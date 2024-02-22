package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scanner.nextInt();
		

		int mult = 1;
		System.out.println("Tabuada de " + num + ":");
		
		do {
			int result = num * mult;
			System.out.println(num + " X " +  mult  + " = " +  result );
			mult ++;
			
		} while (mult <= 10);
		
		
		scanner.close();	
	}
	
}
