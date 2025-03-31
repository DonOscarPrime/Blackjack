

import modelo.Mano;
import excepciones.NoHayMasCartasException;
import modelo.Mazo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManoTest {

    private Mano mano;
    private Mazo mazo;

    @BeforeEach
    void setUp() {
        mano = new Mano();
        mazo = new Mazo();
    }

    @Test
    void testValorMano() {
        assertEquals(0, mano.valorMano(), "Una nueva mano debe tener valor 0.");
    }

    @Test
    void testFinDeJuego() throws NoHayMasCartasException {
        // Añadir cartas hasta alcanzar o superar 21
        while (mano.valorMano() < 21) {
            mano.pedirCarta(mazo);
        }
        assertTrue(mano.finDeJuego(), "El juego debe terminar cuando el valor de la mano es 21 o más.");
    }

    @Test
    void testPedirCarta() throws NoHayMasCartasException {
        int valorAntes = mano.valorMano();
        mano.pedirCarta(mazo);
        assertTrue(mano.valorMano() > valorAntes, "El valor de la mano debe aumentar al pedir una carta.");
    }
}


