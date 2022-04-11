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
	
		//Busca Linear
		System.out.println("*** BUSCA LINEAR **");
		System.out.println("Digite o número a ser pesquisado");
		int alvo = scanner.nextInt();
		int posicaoResultado = -1;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == alvo) {
				posicaoResultado = 1;
			}
		}
		
		if(posicaoResultado < 0) {
			System.out.println("Elemento não foi encontrado");
		}else {
			System.out.println(String.format("O número %d foi encontrado"
					+ " na posicao %d", alvo, posicaoResultado));
		}
		System.out.println("Vetor");
		imprimirArray(numeros);
		scanner.close();
	}

	private static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
