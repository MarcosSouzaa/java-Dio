public class Usuario {
    public static void main(String[] args) throws Exception {
       //Criar um objeto do tipo da classe SmartTv para verificar a operação
       // da TV.
       SmartTv smartTv = new SmartTv();

       System.out.println("TV ligada? " + smartTv.ligada);
       System.out.println("Canal atual: " + smartTv.canal);
       System.out.println("Volume atual: " + smartTv.volume);

       smartTv.ligar();
       System.out.println("Novo Status => TV ligada? " + smartTv.ligada );

       smartTv.desligar();
       System.out.println("Novo Status => TV ligada? " + smartTv.ligada );

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVoume();
       smartTv.aumentarVoume();
       System.out.println("Volume Atual: " + smartTv.volume);
       
       System.out.println("Canal atual: " + smartTv.canal);
       smartTv.aumentarCanal();
       smartTv.diminuirCanal();
       smartTv.diminuirCanal();
       
       smartTv.mudarCanal(11);
       smartTv.mudarCanal(1179);

       System.out.println("Canal atual: " + smartTv.canal);


    }
}
