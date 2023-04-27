public class App {
    public static void main(String[] args) throws Exception {
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 10d);
        Quadrilatero.area(8, 3, 6);
        Quadrilatero.area(5f, 5f);


        System.out.println("\nUtilizando o return: ");
        QuadrilateroRet.mostrarArea(5);
        QuadrilateroRet.mostrarArea(5, 5);
        QuadrilateroRet.mostrarArea(8, 3, 6);
        QuadrilateroRet.mostrarArea(5, 5);
    }
}
