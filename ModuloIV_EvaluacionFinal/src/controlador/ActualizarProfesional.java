package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Profesionaldaoimpl;
import modelo.Profesional;

/**
 * Servlet implementation class ActualizarProfesional
 */
@WebServlet("/ActualizarProfesional")
public class ActualizarProfesional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarProfesional() {
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
		String run_pro = request.getParameter("run");
		String nombre_pro = request.getParameter("nombres");
		String apellido_pro = request.getParameter("apellidos");
		String telefono_pro = request.getParameter("telefono");
		String titulo_pro = request.getParameter("titulo");
		String proyecto_pro = request.getParameter("proyecto");
		String run_usu = "";
		
		Profesional pro = new Profesional(run_pro, nombre_pro, apellido_pro, telefono_pro, titulo_pro, proyecto_pro, run_usu);
		
		Profesionaldaoimpl proimpl = new Profesionaldaoimpl();
		
		boolean res = proimpl.editarProfesional(pro);
		String msg = "";
		
		if (res) {
			msg = "El usuario profesional se editó exitosamente";
		}
		else {
			msg = "El usuario profesional no se pudo editar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("/JSP/msgcrearprofesional.jsp").forward(request, response);
	}

}
