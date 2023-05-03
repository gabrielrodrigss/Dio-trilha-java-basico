public class App {
    
    public static void main(String[] args) {
        
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        // Polimorfismo, pois trabalha com a classe mãe e seus dados
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        // Polimorfismo, pois trabalha com a classe mãe e seus dados
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        // Sobrescrita, pois está trabalhando com a classe filha diretamente e seus métodos sobrescritos
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
