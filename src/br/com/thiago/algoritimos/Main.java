package br.com.thiago.algoritimos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*|----------------------
		 *    |   |   |   |   |
		 *| ---------------------
		 * 0     1    2   3   4    
		 */
		int [] numeros = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero");
			int numero = scanner.nextInt();
			numeros[i] = numero;
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		scanner.close();
	}

}
