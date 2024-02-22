package Exercicio10;

import java.util.Scanner;

public class exercicio10 {
		
		public static void main (String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			String senhasecreta = "java123";
			
			
			while(true) {
				System.out.println("digite a senha secreta");
				String senhaDigi = scanner.next();
				
				if(senhasecreta.equals(senhaDigi)) {
					System.out.println("Senha correta");
					break;
				}
				else {
					System.out.println("Senha incorreta, continue tentando");
				}
			}
			
			
			scanner.close();
			

		}
		
		
}

	
