public class Calculadora {
    public static void soma(double valorUm, double valorDois) {
        double soma = valorUm + valorDois;
        System.out.println("A soma de valor " + valorUm + " valor " + valorDois + " o resultado é: " + soma);
    }

    public static void subtracao(double valorUm, double valorDois) {
        double subtracao = valorUm - valorDois;
        System.out.println("A subtração do valor " + valorUm + " valor " + valorDois + " o resultado é: " + subtracao);
    }

    public static void divisao(double valorUm, double valorDois) {
        double divisao = valorUm / valorDois;
        System.out.println("A divisão de valor " + valorUm + " valor " + valorDois + " o resultado é: " + divisao);
    }

    public static void multiplicacao(double valorUm, double valorDois) {
        double multiplicacao = valorUm * valorDois;
        System.out.println("A multiplicação de valor " + valorUm + " valor " + valorDois + " o resultado é: " + multiplicacao);
    }
}
