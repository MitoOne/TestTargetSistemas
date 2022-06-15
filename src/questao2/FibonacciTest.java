package questao2;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		int termo1 = 1;
		int termo2 = 0;
		int auxiliar;
		boolean isFibonacci = false;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = teclado.nextInt();
		
		for(int i= 0;i < numero; i++) {
			auxiliar = termo1;
			termo1 = termo1 + termo2;
			termo2 = auxiliar;
			if(termo1 == numero) {
				System.out.println("O numero informado e um numero de uma sequência fibonacci \n");
				isFibonacci = true;
			}
		  }
		if(!isFibonacci) {
			System.out.println("O numero informado não e uma sequência fibonacci ");
		}
		teclado.close();
	  }
	}

