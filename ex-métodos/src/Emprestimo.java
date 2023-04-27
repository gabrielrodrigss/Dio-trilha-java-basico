public class Emprestimo {
    public static double calcularJuros(double valor, int quantidadeParcelas) {
        double juros = 0;
        int count = 0;
        while(count < quantidadeParcelas) {
            count++;
            juros = valor * 0.06;
            valor = valor + juros;
        }
        return valor;
    }

    public static void imprimirValor(double valor, int quantidadeParcelas) {
        double valorTotal = calcularJuros(valor, quantidadeParcelas);
        System.out.printf("Valor da parcela: %.2f %n", (valorTotal));
    }
}
