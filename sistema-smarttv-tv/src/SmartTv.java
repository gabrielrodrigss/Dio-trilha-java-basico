// Definido uma classe objeto
public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        volume++;
    }
    public void diminuirCanal() {
        volume--;
    }

    public void ligar() {
        ligada=true;
    }

    public void desligar() {
        ligada=false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volome para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volome para: " + volume);
    }
}
