package entidades;

/** Con esto java lo incluye en la generacion de la documentacion
 * 
 * Interfaz que hace que los objetos se puedan mover. Cada objeto se movera como corresponda. 
 * A continuacion las anotaciones: son marcas que permiten decirle al compilador que altere 
 * el comportamiento.  
 * 
 * @author pue
 * @version 1.12
 * @since 22/04/2019
 */

public interface Movible { 
	
	// todos los metodos en una interfaz son abstractos y publicos
	// no podemos declarar atributos. Los atributos que declaremos son constantes. 
	int i = 5; // constante

	/* 
	 * Este metodo hace que el objeto se mueva de la manera mas lenta posible
	 */
	public void moverseLento();
	
	/*
	 * Este metodo hace que el objeto se mueva de la manera mas rapida posible
	 */
	public void moverseRapido();

	/**
	 * Este metodo hace que el objeto pueda moverse una cantidad de metros
	 * @param metros
	 * @return 
	 */
	public int moverse(int metros);
	
}
