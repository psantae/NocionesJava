package modelo.persistencia;

import java.util.ArrayList;

import modelo.entidades.Usuario;

/* esta capa se encarga del acceso a los objetos de negocio dao
 * (dao significa data access object)
 * 
 * Simulamos una bbdd
 */

public class DaoUsuario {
	
	private ArrayList<Usuario> listaUsuarios;
	
	public DaoUsuario() {
		listaUsuarios = new ArrayList<>();
		
		Usuario usuario = new Usuario();
		usuario.setNombre("pepe");
		usuario.setPassword("qwerty");
		
		listaUsuarios.add(usuario);
		
		usuario = new Usuario();
		usuario.setNombre("pablo");
		usuario.setPassword("1234");
		
		listaUsuarios.add(usuario);
				
	}
	
	public ArrayList<Usuario> getListaUsuarios(){
		//este metodo tendria que hacer la consulta a la bbdd, pero como la estamos simulando...
		return listaUsuarios;
	}
	
	public Usuario getUsuario(String nombre) {
		//to do
		return null;
	}
	
}
