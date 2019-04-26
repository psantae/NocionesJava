package javabeans;

/* Notaciones javabean es un convenio java sobre la creacion de objetos simples
tambien llamados POJOS. plain old java object).
basicamente son objetos sencillos que no tienen herencia ni logica complicada
Para hacer una clase java bean es atributos privados y metodos accesores y 
modificadores publicos, tambien llamados getters y setters.
Los atributos pasan a ser propiedades
*/

public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if(edad <0) edad = 0;
		this.edad = edad;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Persona(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}

	//@override es una anotacion. es como un mecanismo de control. te aseguras de que
	//efectivamente estas sobreescribiendo un metodo que ya existe. 
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	
	
}
