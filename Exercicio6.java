package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		int fatorial = 1;
		
		
		System.out.println("Digite um número fatorial");
		int numFat = scanner.nextInt();
		
		for(int i = 1; i <= numFat; i++ ) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial de " + numFat + " é de: " + fatorial);
		
		scanner.close();
		
	}
	
}
