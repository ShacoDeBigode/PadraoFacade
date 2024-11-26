package Facade.facade2;

public class Cortinas {
    public boolean abertas = false;

    public String abrir(){
        abertas = true;
        return "Cortinas abertas";
    }

    public String fechar(){
        abertas = false;
        return "Cortinas fechadas";
    }

    public boolean isAbertas() {
        return abertas;
    }
}
