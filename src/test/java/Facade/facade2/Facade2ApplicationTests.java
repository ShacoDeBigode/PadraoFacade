package Facade.facade2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Facade2ApplicationTests {

    @Test
    public void testModoCinema() {
        Facade facade = new Facade();

        // Testa o modo cinema
        String resultado = facade.modoCinema();
        assertEquals("Modo cinema ativado", resultado);

        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();
        Cortinas cortinas = new Cortinas();

        // Testa os efeitos do modo cinema
        assertEquals("Luz desligada", luz.desligar());
        assertEquals("Ar condicionado ligado", ar.ligar());
        assertEquals("Cortinas fechadas", cortinas.fechar());
    }

    @Test
    public void testModoNormal() {
        Facade facade = new Facade();

        // Testa o modo normal
        String resultado = facade.modoNormal();
        assertEquals("Modo normal ativado", resultado);

        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();
        Cortinas cortinas = new Cortinas();

        // Testa os efeitos do modo normal
        assertEquals("Luz ligada", luz.ligar());
        assertEquals("Ar condicionado desligado", ar.desligar());
        assertEquals("Cortinas abertas", cortinas.abrir());
    }

    @Test
    public void testLuz() {
        Luz luz = new Luz();

        // Testa ligar e desligar a luz
        assertEquals("Luz ligada", luz.ligar());
        assertEquals("Luz desligada", luz.desligar());
    }

    @Test
    public void testArCondicionado() {
        ArCondicionado arCondicionado = new ArCondicionado();

        // Testa ligar e desligar o ar condicionado
        assertEquals("Ar condicionado ligado", arCondicionado.ligar());
        assertEquals("Ar condicionado desligado", arCondicionado.desligar());
    }

    @Test
    public void testCortinas() {
        Cortinas cortinas = new Cortinas();

        // Testa abrir e fechar as cortinas
        assertEquals("Cortinas abertas", cortinas.abrir());
        assertEquals("Cortinas fechadas", cortinas.fechar());
    }
}
