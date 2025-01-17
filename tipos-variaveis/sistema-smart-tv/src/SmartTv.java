public class SmartTv {
    boolean ligada = false;
    int canal =1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarVolume(){
        System.out.println("aumentando volume " + volume);
        volume++;
    }
    public void diminuirVolume(){
        System.out.println("diminuindo volume " + volume);
        volume--;
    }
    public void ligar() {
        ligada=true;
        
    }
    public void desligar() {
        ligada=false;
        
    }
    public void aumentarCnal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

}
