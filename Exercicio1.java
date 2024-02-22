package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite um número");
		int numero = scanner.nextInt();
		
		if (numero > 0) {
			System.out.println("número positivo");
		}
		else {
			System.out.println("número negativo");
		}
		
		scanner.close();
		

		
	}

}
