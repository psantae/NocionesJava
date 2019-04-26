
public class MainVariables {
	public static void main(String[] args) {
		//En java tenemos dos tipos de variables, primitivos y referencias
		
		//variables primitivas, son aquellas en las que el valor se guarda dentro de la variable
		int entero1 = 10;
		double reales = 23.24;
		long enterosGrandes = 1000_000_000L; //hay que poner la L para indicar al compilador java que es long
		//desde la version 1.7 se pueden poner guiones bajos para facilitar la lectura del numero
		boolean verdadero = true;
		boolean falso = false;
		
		System.out.println(enterosGrandes);
		
		//Variables de referencia, las referencias apuntan a objetos
		//lo que guarda la referencia es la posicion de memoria donde se guarda el objeto (o los datos)
		String cadena = "Esto es una cadena de texto";
		
		cadena = cadena + " y esto es otra anyadida";
		System.out.println(cadena);
		
		
	}
}
