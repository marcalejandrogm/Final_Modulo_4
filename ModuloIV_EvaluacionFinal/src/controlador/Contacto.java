package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Persona;

/**
 * Servlet implementation class ServletContacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		Persona user = (Persona) session.getAttribute("sesionusuario");
		if (user == null) {
		       //no se ha creado
			//getServletContext().getRequestDispatcher("/JSP/Login.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath() + "/Login");
		} else {
		       // Already created.
			//getServletContext().getRequestDispatcher("/JSP/Contacto.jsp").forward(request, response);
			request.getRequestDispatcher("/JSP/Contacto.jsp").forward(request, response);
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre = request.getParameter("nombre");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String mensaje = request.getParameter("mensaje");
		
		System.out.println("Nombre: "+ nombre +" \\\r\n"
				+ "Correo Electrónico: "+ correo + " \\\r\n"
				+ "Teléfono: " + telefono +"\\\r\n"
				+ "Mensaje: " + mensaje);
	}

}
