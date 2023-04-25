package arrays;

/*
 * Crie um vetor de 6 número inteiros
 * e mostre-os na ordem inversa. 
 */
public class Ex01_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, -15, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        while(count <= vetor.length-1) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }
}
