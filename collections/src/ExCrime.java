import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class ExCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> perguntas = new ArrayList<String>();
        perguntas.add("Telefonou para a vítima? ");
        perguntas.add("Esteve no local do crime? ");
        perguntas.add("Mora perto da vítima? ");
        perguntas.add("Devia para a vítima");
        perguntas.add("Já trabalhou com a vítima? ");
        
        Iterator<String> iterator = perguntas.iterator();
        int count = 0;
        while(iterator.hasNext()) {
            String pergunta = iterator.next();
            System.out.println(pergunta);
            String resposta = scanner.next();

            if(resposta.contains("s")) {
                count++;
            }
        }

        System.out.println("Classificação");
        if(count == 2) {
            System.out.println("Suspeita");
        } else if(count == 3 || count == 4) {
            System.out.println("Cúmplice");
        } else if(count == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
    }
}
