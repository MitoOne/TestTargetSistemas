package questao5;

import java.util.Scanner;

public class InvertendoCaractere {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a palavra: ");
		String palavra = teclado.nextLine();
		
		char[] vetor = palavra.toCharArray();
		
		for(int i = vetor.length - 1;i >= 0 ; i--) {
			System.out.print(vetor[i]);
		}
		teclado.close();
	}

}
