import java.util.Scanner;
/*
 * Faça um programa que calcúle o fatorial de um número inteiro fornecido pelo o usuário.
 */
public class Ex06_Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial;

        System.out.println("Número: ");
        fatorial = scanner.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for(int i = fatorial; i >= 1; i--) {
            multiplicacao *= i;
        }

        System.out.println(multiplicacao);
    }
}