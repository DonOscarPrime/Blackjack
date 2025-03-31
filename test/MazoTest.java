import modelo.Mazo;
import modelo.Carta;
import modelo.Carta.Palo;
import excepciones.NoHayMasCartasException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MazoTest {


    @Test
    void testBarajar() {
        Mazo mazo = new Mazo();
        Carta primeraCartaAntes = mazo.cartas.get(0);
        mazo.barajar();
        Carta primeraCartaDespues = mazo.cartas.get(0);
        assertNotEquals(primeraCartaAntes, primeraCartaDespues, "Después de barajar, la primera carta debería cambiar.");
    }

    @Test
    void testSolicitarCarta() throws NoHayMasCartasException {
        Mazo mazo = new Mazo();
        Carta carta = mazo.solicitarCarta();
        assertNotNull(carta, "La carta solicitada no debe ser nula.");
    }

}

