package Facade.facade2;

public class Luz {
    private boolean ligada = false;

    public String ligar (){
        ligada = true;
        return "Luz ligada";
    }

    public String desligar (){
        ligada = false;
        return "Luz desligada";
    }

    public boolean isLigada(){
        return ligada;
    }
}