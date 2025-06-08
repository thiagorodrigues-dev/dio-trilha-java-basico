public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando o volume para: "+ this.volume);
    }
    public void diminuirVolume(){
        this.volume--;
        System.out.println("Diminuindo o volume para: "+ this.volume);
    }

    public void aumentarCanal(){
        this.canal++;
    }

    public void setarCanal(int numerocanal){
        this.canal = numerocanal;
    }

    public void diminuirCanal(){
        this.canal--;
    }

}
