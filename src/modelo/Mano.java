package modelo;

import java.util.ArrayList;

import excepciones.NoHayMasCartasException;

/**
  Representa la mano de un jugador en el juego de Blackjack.
  Esta clase extiende la clase Mazo para manejar un conjunto de cartas.

 @author Oscar Cruz
  @version 1.0
 */
public class Mano extends Mazo {

	/**
	  Constructor que inicializa la mano con una lista vacía de cartas.
	 */
	public Mano() {
		this.cartas = new ArrayList<Carta>();
	}

	/**
	  Calcula el valor total de las cartas en la mano.

	  @return El valor total de las cartas en la mano.
	 */
	public int valorMano() {
		int valor = 0;
		for (Carta carta : this.cartas) {
			valor = valor + carta.getValor();
		}
		return valor;
	}

	/**
	  Determina si el juego ha terminado, es decir, si el valor de la mano es igual o mayor que 21.

	  @return true si el valor de la mano es 21 o más; false en caso contrario.
	 */
	public boolean finDeJuego() {
		if (this.valorMano() >= 21) {
			return true;
		}
		return false;
	}

	/**
	  Devuelve una representación textual de la mano, incluyendo el valor total de la mano y las cartas que la componen.

	  @return Una cadena que describe la mano, incluyendo el valor total y las cartas.
	 */
	@Override
	public String toString() {
		String res = "Valor de la Mano: " + this.valorMano() + "\n";
		res = res + super.toString();
		return res;
	}

	/**
	  Solicita una carta del mazo y la añade a la mano.

	  @param m El mazo desde el cual se solicita una carta.
	  @throws NoHayMasCartasException Si el mazo está vacío y no se puede solicitar una carta.
	 */
	public void pedirCarta(Mazo m) throws NoHayMasCartasException {
		Carta c = m.solicitarCarta();
		this.cartas.add(c);
	}
}
