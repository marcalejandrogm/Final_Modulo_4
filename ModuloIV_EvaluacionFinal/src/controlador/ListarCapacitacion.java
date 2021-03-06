package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Capacitaciondaoimpl;
import modelo.Capacitacion;
import modelo.Persona;


/**
 * Servlet implementation class ServletListarCapacitacion
 */
@WebServlet("/ListarCapacitacion")
public class ListarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//getServletContext().getRequestDispatcher("/JSP/ListarCapacitacion.jsp").forward(request, response);
		HttpSession session = request.getSession();
		
		Persona user = (Persona) session.getAttribute("sesionusuario");
		
		if (user == null) {
			response.sendRedirect(request.getContextPath() + "/Login");
		} else {
		    
			Capacitaciondaoimpl micapacitacion = new Capacitaciondaoimpl();
			List<Capacitacion> listacapa = micapacitacion.obtener();
			request.setAttribute("listacap", listacapa);
			
			request.getRequestDispatcher("/JSP/ListarCapacitacion.jsp").forward(request, response);
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
