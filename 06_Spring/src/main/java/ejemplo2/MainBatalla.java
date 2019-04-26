package ejemplo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBatalla {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("beansGuerra.xml");
	
	public static void main(String[] args) {
		Guerrero guerrero = new Guerrero();
		guerrero.setNombre("Aquiles");
		
		Espada espada = new Espada();
		espada.setTipo("larga");
		
		//inyectar la dependencia
		
		Arco arco = new Arco();
		arco.setTipo("de poleas");
		
		
		guerrero.setArma(arco);
		
		guerrero.atacar();
		
		//ahora con Spring
		
		Guerrero guerrero2 = context.getBean("guerrero", Guerrero.class);
		guerrero2.atacar();
		
	}
}
