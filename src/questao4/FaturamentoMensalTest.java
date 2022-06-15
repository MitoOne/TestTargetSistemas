package questao4;

public class FaturamentoMensalTest {

	public static void main(String[] args) {
		float sp = 67836.43F;
		float rj = 36678.66F;
		float mg = 29229.88F;
		float es = 27165.48F;
		float outros = 19849.53F;

		float total = (sp + rj + mg + es + outros);

		float porcSp = ((sp * 100) / total);
		float porcRj = ((rj * 100) / total);
		float porcMg = ((mg * 100) / total);
		float porcEs = ((es * 100) / total);
		float porcOutros = ((outros * 100) / total);

		System.out.printf("O pecentual da distribuidora de SP: %.2f %% \n", porcSp);
		System.out.printf("O pecentual da distribuidora de RJ: %.2f %% \n", porcRj);
		System.out.printf("O pecentual da distribuidora de MG: %.2f %% \n", porcMg);
		System.out.printf("O pecentual da distribuidora de ES: %.2f %% \n", porcEs);
		System.out.printf("O pecentual da distribuidora de OUTROS: %.2f %% \n", porcOutros);
	}

}
