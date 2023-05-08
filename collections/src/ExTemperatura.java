import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;


/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, 
 * e em que mês elas ocorreram (mostrar o mês por extenso: 1 -Janeiro, 2 - Fevereiro e etc).
 */

public class ExTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while(true) {
            if (count == 6) break;
            System.out.println("Digite a temperatura");
            double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
            count++;
        }

        System.out.println("----------");

        System.out.println(temperaturas);

        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        int quantidade = 0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
            quantidade++;
        }

        double media = soma/quantidade;
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        // double media = temperaturas.stream()
        //         .mapToDouble(Double::doubleValue)
        //         .average()
        //         .orElse(0d);
        // System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        
        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator1 = temperaturas.iterator();

        count = 0;
        while (iterator1.hasNext()) {
            Double temp = iterator1.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }





     /* List<Double> temperaturas = new ArrayList<Double>();
        temperaturas.add(23.2);
        temperaturas.add(25.2);
        temperaturas.add(23.8);
        temperaturas.add(24.0);
        temperaturas.add(22.0);
        temperaturas.add(20.2);
        
        Iterator<Double> iterator = temperaturas.iterator();
        Double soma = 0d;
        int quantidade = 0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
            quantidade += 1;
        }
        Double media = soma/quantidade;

        System.out.println("Média: " + media);

        for (Double temperatura : temperaturas) {
            if(temperatura > media) {
                System.out.println("Temperaturas acima da média: " + temperatura);
            }
        } */
    }
}
