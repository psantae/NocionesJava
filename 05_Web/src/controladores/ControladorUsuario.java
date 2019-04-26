package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuario;

/*Para la creacion de servlets se usa un concepto que se llama
 * inversion de control. este concepto nos dice que nosotros no vamos a gestionar
 * directamente el ciclo de vida de este objeto servlet
 * sino que va a ser Tomcat el que lo gestiona
 */

/*
 * La anotacion webserver le dice a TomCat que tiene que gestionar el ciclo de vida de 
 * este objeto (IoC) inversion de control
 */


@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
      


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombreUsuario");
		String password = request.getParameter("passwordUsuario");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		GestorUsuario gu = new GestorUsuario();
		if (gu.validarUsuario(usuario)) {
			//todo ha ido bien
			//vamos a ir a una pagina que nos diga bienvenido, nombre
			//html no podemos, porque es estatico. 
			//tenemos que hacerlo con jsp
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
			
			
		}else {
			//algo a ido mal
			request.getRequestDispatcher("error.html").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}