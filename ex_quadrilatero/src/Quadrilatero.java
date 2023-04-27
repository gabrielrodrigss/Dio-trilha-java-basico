public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Aréa do quadrado " + lado * lado);
    }
    public static void area(double altura, double base) {
        System.out.println("Area do retangulo " + altura * base);
    }
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do trapézio " + ((baseMaior+baseMenor)*altura)/2);
    }
    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Area do losangulo " + (diagonal1*diagonal2)/2);
    }
}
