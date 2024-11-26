package Facade.facade2;

public class Cliente {
    public static void main(String[] args) {
        Facade facade = new Facade();
        System.out.println("Modo Cinema");
        facade.modoCinema();

        System.out.println("Modo Normal");
        facade.modoNormal();
    }

}
