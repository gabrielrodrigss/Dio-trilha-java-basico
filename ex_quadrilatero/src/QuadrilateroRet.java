public class QuadrilateroRet {
    public static double area(double lado) {
        return lado*lado;
    }
    public static double area(double altura, double base) {
        return altura * base;
    }
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura)/2;
    }
    public static double area(float diagonal1, float diagonal2) {
        return (diagonal1*diagonal2)/2;
    }

    public static void mostrarArea(double lado) {
        double area = area(lado);
        System.out.println("Aréa do quadrado " + area);
    }

    public static void mostrarArea(double altura, double base) {
        double area = area(altura, base);
        System.out.println("Aréa do retangulo " + area);
    }

    public static void mostrarArea(double baseMaior, double baseMenor, double altura) {
        double area = area(baseMaior, baseMenor, altura);
        System.out.println("Aréa do quadrado " + area);
    }

    public static void mostrarArea(float diagonal1, float diagonal2) {
        double area = area(diagonal1, diagonal2);
        System.out.println("Aréa do quadrado " + area);
    }
    public static void main(String[] args) {
        
    }
}
