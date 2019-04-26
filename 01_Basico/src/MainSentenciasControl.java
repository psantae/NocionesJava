
public class MainSentenciasControl {
	public static void main(String[] args) {
		//condicionales
		int numero = 10;
		if(numero > 10) {
			System.out.println("el numero es mayor que 10");
		}else if(numero < 10){
			System.out.println("el numero es menor que 10");
		}else {
			System.out.println("el numero es 10");
		}
		
		//inicializacion de la variable, condicion de bucle, incremento de bucle
		//for
		for (int i=0;i<=10;i++) {
			System.out.println(i);
		}
		
		int numero2 = 0;
		
		//while
		while (numero2 <= 10) {
			System.out.println(numero2);
			numero2++;
			
		}
		
		//switch
		String diaSemana = "LUNES";
		switch (diaSemana) { //ponemos a valorar la variable
		case "LUNES":
			System.out.println("El dia de la semana es lunes");
			break; //con el break rompemos la sentencia switch.
			//la ejecucion continuara hasta que se encuentre un break
		case "MARTES":
			System.out.println("El dia de la semana es martes");
			break;
		case "MIERCOLES":
			System.out.println("El dia de la semana es miercoles");
			break;
		case "JUEVES":
			System.out.println("El dia de la semana es jueves");
			break;
		case "VIERNES":
			System.out.println("El dia de la semana es viernes");
			break;
		default:
			break;
		}
		
		if (true && false) {
			//and
		}
		if (true || false) {
			//or
		}
		if (!true) {
			//negacion
		}
			
		
		
	}
}
