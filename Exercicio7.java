package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		int idade = scanner.nextInt();
		
		if (idade < 18) {
			System.out.println("Menor de idade");
		}
		else if (idade >= 18 && idade <= 59) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
		
		
		scanner.close();
		
	}
	
}
