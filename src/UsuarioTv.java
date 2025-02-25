public class UsuarioTv {

    public static void main (String [] args ) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanaç(13);

        System.out.println("Canal atual? " + smartTv.canal);

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Statys -> TV Ligada ?  " + smartTv.ligada);


    }
    
}
