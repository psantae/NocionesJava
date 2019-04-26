package modelo.negocio;

import java.util.ArrayList;

import modelo.entidades.Usuario;
import modelo.persistencia.DaoUsuario;

/* esta capa se encarga de llevar la logica de negocio de nuestra aplicacion
 * dicho de otra manera, la funcionalidad de nuestra aplicacion, para lo que se programo
 */
public class GestorUsuario {

	/**
	 * Metrodo que valida si un usuario esta registrado en el sistema
	 * @param user es el usuario a validar
	 * @return true en caso de que el usuario este registrado y false en caso contrario
	 */
	
	public boolean validarUsuario(Usuario user) {
		//esta capa es la que se comunica con la bbdd
		//aqui en este ejemplo, como la bbdd la tenemos simulada (es una lista con 2 usuarios)
		//pues es diferente.
		
		//podemos validar por ejemplo que el usuario que nos pasan tenga datos, no este vacio
		
		if (user.getNombre().equals("") || user.getPassword().equals("")) {
			return false;
		}
		
		DaoUsuario daoUsuario = new DaoUsuario();
		ArrayList<Usuario> listaUsuario = daoUsuario.getListaUsuarios();
		for (Usuario usuarioaux : listaUsuario) {
			if (usuarioaux.getNombre().equals(user.getNombre()) && 
				usuarioaux.getPassword().equals(user.getPassword())){
				return true;
			}
		}
		
		return false;
				
	}
}
