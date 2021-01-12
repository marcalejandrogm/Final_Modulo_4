package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Administrativodaoimpl;
import modelo.Administrativo;

/**
 * Servlet implementation class ActualizarAdministrativo
 */
@WebServlet("/ActualizarAdministrativo")
public class ActualizarAdministrativo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarAdministrativo() {
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
		String run_adm = request.getParameter("run");
		String nombre_adm = request.getParameter("nombres");
		String apellido_adm = request.getParameter("apellidos");
		String correo_adm = request.getParameter("correo");
		String area_adm = request.getParameter("area");
		String run_usu = "";
		
		Administrativo adm = new Administrativo(run_adm, nombre_adm, apellido_adm, correo_adm, area_adm, run_usu);
		
		Administrativodaoimpl admimpl = new Administrativodaoimpl();
		
		boolean res = admimpl.editarAdministrativo(adm);
		String msg = "";
		
		if (res) {
			msg = "El usuario administrativo se editó exitosamente";
		}
		else {
			msg = "El usuario administrativo no se pudo editar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("/JSP/msgcrearadministrativo.jsp").forward(request, response);
	}

}
