package modelo;

/**
  Representa una carta de un mazo de blackjack con un número y un palo.

 @author Oscar Cruz
  @version 1.0
 */
public class Carta {

	/**
	  Enumeración de los palos de la baraja.
	 */
	public enum Palo {
		TREBOl, DIAMANTE, CORAZONES, PICAS
	}

	/** Número de la carta (1 a 13). */
	private int numero;
	/** Palo de la carta. */
	private Palo palo;

	/**
	  Constructor de la clase Carta.

	  @param numero Número de la carta (de 1 a 13)
	  @param palo Palo de la carta
	 */
	public Carta(int numero, Palo palo) {
		if (numero >= 1 && numero <= 13) {
			this.numero = numero;
			this.palo = palo;
		}
	}

	/**
	  Obtiene el número de la carta.

	 @return Número de la carta
	 */
	public int getNumero() {
		return numero;
	}

	/**
	  Obtiene el palo de la carta.

	  @return Palo de la carta
	 */
	public Palo getPalo() {
		return palo;
	}

	/**
	  Obtiene el valor de la carta según las reglas del blackjack.

	  @return Valor de la carta
	 @see #mostrarNumero() Este método está relacionado con el valor de la carta, que también depende de su número
	 */
	public int getValor() {
		int valor;
		if (this.numero >= 2 && this.numero <= 10) {
			valor = this.numero;
		} else if (this.numero == 1) {
			valor = 11;
		} else {
			valor = 10;
		}
		return valor;
	}

	/**
	  Devuelve la representación en cadena del número de la carta.

	  @return Representación en letras del número de la carta
	 */
	public String mostrarNumero() {
		if (this.numero == 1) {
			return "AS";
		} else if (this.numero == 11) {
			return "J";
		} else if (this.numero == 12) {
			return "Q";
		} else if (this.numero == 13) {
			return "K";
		}
		return "" + this.numero;
	}

	/**
	  Representación en cadena de la carta.

	  @return Cadena con el número y palo de la carta
	 */
	@Override
	public String toString() {
		return "[" + mostrarNumero() + " - " + palo + "]";
	}
}

