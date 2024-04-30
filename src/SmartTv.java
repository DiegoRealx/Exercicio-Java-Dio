public class SmartTv {
    boolean ligada = false;
    int canal1 = 1;
    int volume = 25;
    public void ligar(String[] args) {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }
    public void mudarCanal(int novoCanal) {
     canal1 = novoCanal; 
     System.out.println("Canal novo: " + novoCanal); 
    }
    public void almentarCanal() {
        canal1++;
    }
    public void diminuirCanal() {
        canal1--;
    }
    public void aumentarVolume() {
        volume++;
        System.out.println("aumentando o volume: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminindo o volume:  " + volume); 
    }
}
