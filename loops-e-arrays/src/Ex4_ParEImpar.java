import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeNumeros;
        int numero;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Quantidade de números");
        quantidadeNumeros = scanner.nextInt();

        int count = 0;
        do {
            System.out.println("Números: ");
            numero = scanner.nextInt();
            count++;

            if(numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        } while(count < quantidadeNumeros);

        System.out.println("Pares: " + quantidadePares);
        System.out.println("Impares: " + quantidadeImpares);
    }
}
