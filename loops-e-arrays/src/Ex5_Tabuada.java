import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo abaixo.
 * 
 * Tabuada de 5:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        // int numint = 0;

        System.out.println("Número: ");
        numero = scanner.nextInt();

        System.out.println("Tabuada de: " + numero);

        for(int i = 1; i <= 10; i = i+1) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

        // do {
        //     numint++;
        //     System.out.println(numero + " x " + numint + " = " + (numero*numint));

        // } while (numint > 0 && numint < 10);
    }
}
