import java.util.Scanner;

/*
 * Faça um programa que peça a nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido
 * e continue pedindo até que o usuário informe o valor. 
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Valor inválido, digite outro valor");
            nota = scanner.nextInt();
        }

        // while(true) {
        //     System.out.println("Nota: ");
        //     nota = scanner.nextInt();
        //     if(nota >=1 && nota <= 10) {
        //         break;
        //     } else {
        //         System.out.println("Valor inválido, digite outro valor");
        //     }
        // }
    }
}
