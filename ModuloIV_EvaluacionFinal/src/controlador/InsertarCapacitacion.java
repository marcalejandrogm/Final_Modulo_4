package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Capacitaciondaoimpl;
import modelo.Capacitacion;

/**
 * Servlet implementation class InsertarCapacitacion
 */
@WebServlet("/InsertarCapacitacion")
public class InsertarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarCapacitacion() {
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
		Capacitacion cap = new Capacitacion();
		
		int idcap = Integer.parseInt(request.getParameter("id"));
		String fecha = request.getParameter("fecha");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		int duracion = Integer.parseInt(request.getParameter("duracion"));
		String rut = request.getParameter("rut");
		
		cap.setId(idcap);
		cap.setFecha(fecha);
		cap.setHora(hora);
		cap.setLugar(lugar);
		cap.setDuracion(duracion);
		cap.setRutCliente(rut);
		
		Capacitaciondaoimpl capimpl = new Capacitaciondaoimpl();
		
		boolean res = capimpl.registrar(cap);
		String msg = "";
		
		if (res) {
			msg = "La capacitación se agregó exitosamente";
		}
		else {
			msg = "La capacitación no se pudo agregar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("/JSP/msgcapacitacion.jsp").forward(request, response);
	}

}
