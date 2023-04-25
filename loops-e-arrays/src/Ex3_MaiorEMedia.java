import java.util.Scanner;

/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        double soma = 0;
        int quantidade = 0;

        int count = 0;
        do {
            System.out.println("Numeros: ");
            numero = scanner.nextInt();
            count += 1;
            quantidade = quantidade + 1;
            soma = (soma + numero);

            if(numero > maior) {
                maior = numero;
            }
        } while (count < 5); 

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma/quantidade));
    }
}
