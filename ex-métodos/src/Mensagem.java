public class Mensagem {
    public static void enviarMensagem(int hora) {

        if(hora >= 5 && hora < 12) {
            System.out.println("Bom dia! ");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
