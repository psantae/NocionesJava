package javabeans;

public class JBMain {
	public static void main(String[] args) {
		Persona p = new Persona("Pablo",36,79.8);
		p.setEdad(8);
		
		System.out.println(p.getEdad());
		
		System.out.println(p);
	}
}
