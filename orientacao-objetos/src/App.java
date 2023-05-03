public class App {
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro();

        System.out.println();

        carro1.setCor("Prata");
        carro1.setModelo("Palio lt");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.29));

        System.out.println();

        Carro carro2 = new Carro("Branco", "Golf gti", 66);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.49));

        System.out.println();
    }
}
