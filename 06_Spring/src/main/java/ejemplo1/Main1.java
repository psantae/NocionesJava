package ejemplo1;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		
		//manera clasica. spring NO esta llevando el control de este objeto.
		Persona p = new Persona();
		p.setNombre("Homer J. Simpson");
		p.setEdad(40);
		p.setPeso(100);
		
		//para hacerlo de manera spring, lo damos de alta en el fichero xml (beans.xml)
		//y luego para que lo anyada en el contenedor de objetos: 
		
		//arrancamos nuestro contenedor de objetos de Spring
		//todas las etiquetas de ese fichero xml se convertiran en objetos
		
		
		//ahora no hacemos new 
		//el getbean nos devuelve object, por eso le pasamos un segundo parametro con la clase
		//a la que queremos que nos lo convierta
		Persona lisa = context.getBean("lisa", Persona.class);
		System.out.println(lisa.getNombre());
		
		//ojo, usando scope prototype, y spring te devuelve la referencia al objeto, 
		//ya depende de ti el ciclo de vida. 
		
		Persona p2 = context.getBean("personaGenerica", Persona.class);
		p2.setNombre("Bart Simpson");
		
		ArrayList<Persona> listaPersonas = context.getBean("arrayPersonas", ArrayList.class);
		listaPersonas.add(p2);
		
		System.out.println(listaPersonas);
		mostrarPersona(p);
		
		
		
	}

	private static void mostrarPersona(Persona p) {
		imprimirPersona(p);
		
	}

	private static void imprimirPersona(Persona p) {
		System.out.println(p);
		Persona p2 = context.getBean("lisa",Persona.class);
		System.out.println(p2);
		
	}
}
