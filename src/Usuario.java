public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("A tv esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual" + smartTv.canal1);
            smartTv.mudarCanal(13);

        System.out.println("Volume atual: " + smartTv.volume);


    }
}
