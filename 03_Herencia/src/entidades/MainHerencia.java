package entidades;

import java.util.ArrayList;

public class MainHerencia {
	public static void main(String[] args) {
		Empleado empleado = new Programador();
		empleado.setDNI("47025409T");
		empleado.setNombre("Bud Spencer");
		empleado.setNomina(1000);
		
		Jefe jefe = new Jefe();
		jefe.setDNI("46537286Y");
		jefe.setNombre("Terence Hill");
		jefe.setNomina(1600);
		jefe.setIncentivos(300);
		
		Director director = new Director();
		director.setDNI("12344567U");
		director.setNombre("Dirty Harry");
		director.setNomina(2300);
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(empleado);
		listaEmpleados.add(jefe);
		
		director.setListaEmpleados(listaEmpleados);
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		empresa.add(empleado);
		empresa.add(jefe);
		empresa.add(director);
		
		calcularSueldo (empresa);
			
	}
	
	public static void calcularSueldo(ArrayList<Empleado> empresa) {
		for (Empleado e : empresa) {
			System.out.println(e.calcularSueldo());
		}
	}
	
}
