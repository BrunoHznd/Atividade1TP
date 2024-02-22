package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int num = scanner.nextInt();
		

		
		if (num % 2 == 0) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número impar");
		}
		
		
		scanner.close();	
	}
}
