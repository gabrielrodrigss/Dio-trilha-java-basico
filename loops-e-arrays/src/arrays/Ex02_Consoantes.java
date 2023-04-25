package arrays;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes fora lidas;
 * imprima as consoantes.
 */
public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scanner.next();

            if( !(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("e") |
            letra.equalsIgnoreCase("i") |
            letra.equalsIgnoreCase("o") |
            letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;
            
        } while (count < consoantes.length);

        // Para cada elemento nessa array de consoantes, imprima cada uma das consoantes.
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if( consoante != null ) {
                System.out.println(consoante  + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        

    }
}
