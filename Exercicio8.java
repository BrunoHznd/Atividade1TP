package Exercicio8;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int numeroImpar = 1;

        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();

       
        for (int i = 0; i < n; i++) {
            soma += numeroImpar;
            numeroImpar += 2;
        }

        System.out.println("A soma dos primeiros " + n + " números ímpares é: " + soma);

        scanner.close();
    }

}
