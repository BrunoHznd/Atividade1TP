package Exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro número é maior");
		}
		else if (num1 < num2) {
			System.out.println("O Segundo número é maior");
		}
		else {
			System.out.println("Os números são iguais");
		}
		
		
		scanner.close();
		
	}

}
