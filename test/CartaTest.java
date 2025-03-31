import modelo.Carta;
import modelo.Carta.Palo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CartaTest {


    @Test
    void testGetValor() {
        Carta carta = new Carta(5, Palo.CORAZONES);
        assertEquals(5, carta.getValor());

        carta = new Carta(1, Palo.PICAS);
        assertEquals(11, carta.getValor());

        carta = new Carta(11, Palo.DIAMANTE);
        assertEquals(10, carta.getValor());
    }

    @Test
    void testMostrarNumero() {
        Carta carta = new Carta(1, Palo.CORAZONES);
        assertEquals("AS", carta.mostrarNumero());

        carta = new Carta(11, Palo.PICAS);
        assertEquals("J", carta.mostrarNumero());

        carta = new Carta(12, Palo.DIAMANTE);
        assertEquals("Q", carta.mostrarNumero());

        carta = new Carta(13, Palo.CORAZONES);
        assertEquals("K", carta.mostrarNumero());

        carta = new Carta(5, Palo.PICAS);
        assertEquals("5", carta.mostrarNumero());
    }
}

