package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modelo.Carta.Palo;
import excepciones.NoHayMasCartasException;

/**
  Representa un mazo de cartas utilizado en el juego de Blackjack.
  El mazo contiene un conjunto de cartas de todos los palos y valores.

  @author Oscar Cruz
  @version 1.0
 */
public class Mazo {

	public List<Carta> cartas;

	/**
	  Constructor que inicializa el mazo con todas las cartas de los cuatro palos (TREBOl, DIAMANTE, CORAZONES, PICAS).
	  Se crean 13 cartas para cada palo, con valores de 1 a 13.
	 */
	public Mazo() {
		this.cartas = new ArrayList<Carta>();
		for (Palo palo : Palo.values()) {
			for (int i = 1; i <= 13; i++) {
				Carta carta = new Carta(i, palo);
				this.cartas.add(carta);
			}
		}
	}

	/**
	  Baraja las cartas del mazo de manera aleatoria.
	 */
	public void barajar() {
		Collections.shuffle(cartas);
	}

	/**
	  Devuelve una representación textual de todas las cartas en el mazo.

	  @return Una cadena que describe todas las cartas en el mazo.
	 */
	@Override
	public String toString() {
		String res = "";
		for (Carta carta : cartas) {
			res = res + carta.toString() + "\n";
		}
		return res;
	}

	/**
	  Solicita una carta del mazo. Si no quedan cartas, lanza una excepción.

	  @return La carta solicitada del mazo.
	  @throws NoHayMasCartasException Si no quedan más cartas en el mazo.
	 */
	public Carta solicitarCarta() throws NoHayMasCartasException {
		if (this.cartas.isEmpty()) {
			throw new NoHayMasCartasException();
		}
		Carta carta = this.cartas.get(0);
		this.cartas.remove(0);
		return carta;
	}
}

