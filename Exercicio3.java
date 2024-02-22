package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main (String[] args) {

       
        int valor;
        
        Scanner scanner = new Scanner(System.in);
        String opcao = """ 
                ***************************
                Escolha uma das opções:
                1 - Calcular area do quadrado;
                2 - calcular area do circulo;
                ***************************
                """;
        
        System.out.println(opcao);
        valor = scanner.nextInt();
        
        if (valor == 1) {
        	System.out.println("informe a lado do quadrado");
        	double lado = scanner.nextDouble();
        	double areaQuad = lado * lado;
        	System.out.println("o valor da area do quadrado é de: " + areaQuad);
        	
        }
        
        else {
        	System.out.println("informe o raio do circulo");
        	double raioCirculo = scanner.nextDouble();
        	Double areaCirculo = Math.PI * (raioCirculo * raioCirculo);
        	System.out.println("o valor da area do circulo é de: " + areaCirculo);
        	
        }
        
        scanner.close();
		
	}
	
}
