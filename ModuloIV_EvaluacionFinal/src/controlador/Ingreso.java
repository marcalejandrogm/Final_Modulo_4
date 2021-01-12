package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import modelo.Persona;


/**
 * Servlet implementation class Ingreso
 */
@WebServlet("/Ingreso")
public class Ingreso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ingreso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String usuario, password;
		
		usuario = request.getParameter("rut");
		password = request.getParameter("contraseña");
		
		if(usuario.equalsIgnoreCase("admin") && password.equals("1234")) {
			
			Persona persona = new Persona();
			persona.setNombre(usuario);
			persona.setClave(password);
			
			HttpSession session = request.getSession();
			session.setAttribute("sesionusuario", persona);
			
			response.sendRedirect(request.getContextPath() + "/Inicio");
			//request.getRequestDispatcher("ServletInicio").forward(request, response); 
			 
		}else {
			 //request.getRequestDispatcher("Login").forward(request, response); 
			response.sendRedirect(request.getContextPath() + "/Login");
			 JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos!");

		}
		
		
	}

}
