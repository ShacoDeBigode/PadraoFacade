package Facade.facade2;

public class ArCondicionado {
    private boolean ligado = false;

    public String ligar(){
        ligado = true;
        return "Ar condicionado ligado";
    }

    public String desligar(){
        ligado = false;
        return "Ar condicionado desligado";
    }

    public boolean isLigado() {
        return ligado;
    }
}