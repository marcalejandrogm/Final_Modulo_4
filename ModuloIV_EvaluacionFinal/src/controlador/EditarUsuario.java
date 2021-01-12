package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Administrativodaoimpl;
import dao.Clientedaoimpl;
import dao.Profesionaldaoimpl;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;

/**
 * Servlet implementation class EditarUsuario
 */
@WebServlet("/EditarUsuario")
public class EditarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String run_usuario = request.getParameter("id");
		int tipo_usuario = Integer.parseInt(request.getParameter("tipo"));
		
		if(tipo_usuario == 1) {
			
			Clientedaoimpl cimpl = new Clientedaoimpl();
			Cliente clienteaux = cimpl.obtenerUsuarioPorId(run_usuario);
			
			request.setAttribute("us", clienteaux);
			request.getRequestDispatcher("/JSP/formeditarcliente.jsp").forward(request, response);
			
		}else if(tipo_usuario == 2) {
			
			Administrativodaoimpl aimpl = new Administrativodaoimpl();
			Administrativo admaux = aimpl.obtenerUsuarioPorId(run_usuario);
			
			request.setAttribute("us", admaux);
			request.getRequestDispatcher("/JSP/formeditaradministrativo.jsp").forward(request, response);
			
		}else if(tipo_usuario == 3) {
			
			Profesionaldaoimpl pimpl = new Profesionaldaoimpl();
			Profesional paux = pimpl.obtenerUsuarioPorId(run_usuario);
			
			request.setAttribute("us", paux);
			request.getRequestDispatcher("/JSP/formeditarprofesional.jsp").forward(request, response);
			
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
