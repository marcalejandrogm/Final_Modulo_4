package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Usuariodaoimpl;
import modelo.Persona;
import modelo.Usuario;

/**
 * Servlet implementation class ListadoUsuario
 */
@WebServlet("/ListadoUsuario")
public class ListadoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		
		Persona user = (Persona) session.getAttribute("sesionusuario");
		
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/Login");
		} else {
		    Usuariodaoimpl usuarioimpl = new Usuariodaoimpl();
		    List<Usuario> listusuario = usuarioimpl.obtenerUsuario();
		    request.setAttribute("lusuarios", listusuario);
			request.getRequestDispatcher("/JSP/ListadoUsuario.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
