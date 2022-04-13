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
				break;
			}
		}
		
		if(posicaoResultado < 0) {
			System.out.println("Elemento não foi encontrado");
		}else {
			System.out.println(String.format("O número %d foi encontrado"
					+ " na posicao %d", alvo, posicaoResultado));
		}
		//fim busca linear
		
		System.out.println("Vetor desodernado");
		imprimirArray(numeros);
		
		// ** Selection Sort
		for (int i = 0; i <numeros.length; i++) {
			int indiceMenor = i;
			for (int j = i +1; j < numeros.length; j++){ 
				if(numeros[j] < numeros[indiceMenor]) {
					indiceMenor = j;
				}
				
			}
			int temp = numeros[indiceMenor];
			numeros[indiceMenor] = numeros[i];
			numeros[i] = temp;
		}
		
		System.out.println("Vetor ordenado");
		imprimirArray(numeros);
		// ** FIM: Selection Sort
		
		//System.out.println("Vetor");
		//imprimirArray(numeros);
		scanner.close();
	}

	private static void imprimirArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
