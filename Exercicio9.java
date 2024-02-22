package Exercicio9;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Digite o 6º nome:");
        String nomeSeis = scanner.nextLine();

        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeSeis)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O 6º nome está presente na lista.");
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        scanner.close();
    }
}