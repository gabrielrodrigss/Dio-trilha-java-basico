package arrays;
/*
 * Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100) armazene-os num vetor. 
 * Ao final mostre os números e seus sucessores
 */

import java.util.Random;

public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatiorios = new int[20];

        for(int i = 0; i < numerosAleatiorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatiorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatiorios) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatiorios) {
            System.out.println(numero+1 + " ");
        }
    }
}
