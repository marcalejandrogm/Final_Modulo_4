package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Clientedaoimpl;
import modelo.Cliente;

/**
 * Servlet implementation class ActualizarCliente
 */
@WebServlet("/ActualizarCliente")
public class ActualizarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarCliente() {
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
		String run_cli = request.getParameter("run");
		String nombre_cli = request.getParameter("nombres");
		String apellido_cli = request.getParameter("apellidos");
		String telefono_cli = request.getParameter("telefono");
		String afp_cli = request.getParameter("afps");
		int salud_cli = Integer.parseInt(request.getParameter("salud"));
		String direccion_cli = request.getParameter("direccion");
		String comuna_cli = request.getParameter("comuna");
		int  edad_cli = Integer.parseInt(request.getParameter("edad"));
		String run_usu = "";
		
		Cliente cl = new Cliente(run_cli, nombre_cli, apellido_cli, telefono_cli, afp_cli, salud_cli,
				direccion_cli, comuna_cli, edad_cli, run_usu);
		
		Clientedaoimpl climpl = new Clientedaoimpl();
		
		boolean res = climpl.editarCliente(cl);
		String msg = "";
		
		if (res) {
			msg = "El usuario cliente se editó exitosamente";
		}
		else {
			msg = "El usuario cliente no se pudo editar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("/JSP/msgcrearcliente.jsp").forward(request, response);
		
	}

}
