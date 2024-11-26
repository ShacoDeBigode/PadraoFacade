package Facade.facade2;

public class Facade {
    private Luz luz;
    private ArCondicionado arCondicionado;
    private Cortinas cortinas;

    public Facade() {
        this.luz = new Luz();
        this.arCondicionado = new ArCondicionado();
        this.cortinas = new Cortinas();
    }

    public String modoCinema(){
        luz.desligar();
        arCondicionado.ligar();
        cortinas.fechar();
        return "Modo cinema ativado";
    }

    public String modoNormal(){
        luz.ligar();
        arCondicionado.desligar();
        cortinas.abrir();
        return "Modo normal ativado";
    }
}
