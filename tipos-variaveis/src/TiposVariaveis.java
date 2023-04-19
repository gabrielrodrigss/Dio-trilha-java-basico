public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        // Classes String 


        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // O short por mais que o número seja 1(curto), pode ser que esse valor seja longo e o short não comportaria esse valor
        short numeroCurto2 = (short) numeroNormal;
    
    
        int numero = 5;
        
        numero = 10;

        // O nome da váriavel constante, por conveção deve ser em caixa alta
        final double NUMERO_PI = 3.14;
    }
}
