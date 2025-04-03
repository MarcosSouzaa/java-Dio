
/* Criar uma classe SmartTv onde:
 * 1- Tenha as características: ligada (boolean), canal(int) e volume (int);
   2- Nossa TV poderá ligar e desligar e assim mudar seu estado;
   3- Nossa TV aumentará e diminnuará o volume  em +1 e -1
   4- Nossa TV poderá mudar o canal de 1 em 1 ou definindo o número correspondente.
 */

public class SmartTv {

    boolean ligada = false;
    int canal = 4;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
         ligada = false;
    }

    public void aumentarVoume () {
      volume ++;
      System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirVolume () {
      volume --;
      System.out.println("Diminuindo o volume: " + volume);     
    }

    public void aumentarCanal () {
      canal ++;
    }

    public void diminuirCanal () {
      canal --; 
    }

    public void mudarCanal (int novoCanal) {
      canal = novoCanal;
    }

}
