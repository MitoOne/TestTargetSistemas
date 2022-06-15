package questao3;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FaturamentoDiarioTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		//Retorne o menor valor de faturamento ocorrido em um dia do mês
		//Retorne o maior valor de faturamento ocorrido em um dia do mês
		//Número de dias no mês em que o valor de faturamento diário foi superior à média mensal

		ObjectMapper mapper = new ObjectMapper();
		List<Faturamento> faturamentos = mapper.readValue(Paths.get("dados.json").toFile(), 
				new TypeReference<List<Faturamento>>() {
		});
		
		OptionalDouble min = faturamentos.stream()
				.mapToDouble(Faturamento::getValor)
				.min();
		
		OptionalDouble max = faturamentos.stream()
				.mapToDouble(Faturamento:: getValor)
				.max();
		
		OptionalDouble average = faturamentos.stream()
				.mapToDouble(Faturamento::getValor)
				.average();
		
		Double media = average.getAsDouble();
		Double menorValor = min.getAsDouble();
		Double maiorValor = max.getAsDouble();
		
		List<Faturamento> faturamentoMaiorQueMedia = faturamentos.stream()
				.filter(faturamento -> faturamento.getValor().compareTo(media) == 1)
				.collect(Collectors.toList());
		
		System.out.println("Maior valor faturado: " + maiorValor);
		System.out.println("Menor valor faturado: " + menorValor);
		System.out.println("Média dos valores: " + media);
		
		faturamentoMaiorQueMedia.forEach(fat -> System.out.println("Dia que o faturamento foi maior que a média: " + 
		fat.getDia() + " valor: " + fat.getValor()));
	}

}
