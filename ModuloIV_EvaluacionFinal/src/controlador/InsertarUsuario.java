package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Usuariodaoimpl;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;

/**
 * Servlet implementation class InsertarUsuario
 */
@WebServlet("/InsertarUsuario")
public class InsertarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarUsuario() {
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
		Usuario usu = new Usuario();
		Cliente cli = new Cliente();
		Administrativo adm = new Administrativo();
		Profesional pro = new Profesional();
		
		String nombre = request.getParameter("txtnombre");
		String fecha = request.getParameter("txtfecha");
		String run = request.getParameter("txtrun");
		int tipo = Integer.parseInt(request.getParameter("tipousuario"));
		
		usu.setNombre(nombre);
		usu.setFecha_nacimiento(fecha);
		usu.setRun_usuario(run);
		usu.setTipo(tipo);
		
		if(tipo == 1) {
			String run_cli = request.getParameter("run");
			String nombre_cli = request.getParameter("nombres");
			String apellido_cli = request.getParameter("apellidos");
			String telefono_cli = request.getParameter("telefono");
			String afp_cli = request.getParameter("afps");
			int salud_cli = Integer.parseInt(request.getParameter("salud"));
			String direccion_cli = request.getParameter("direccion");
			String comuna_cli = request.getParameter("comuna");
			int  edad_cli = Integer.parseInt(request.getParameter("edad"));
			
			cli.setRUT(run_cli);
			cli.setNombres(nombre_cli);
			cli.setApellidos(apellido_cli);
			cli.setTelefono(telefono_cli);
			cli.setAFP(afp_cli);
			cli.setSistema_salud(salud_cli);
			cli.setDireccion(direccion_cli);
			cli.setComuna(comuna_cli);
			cli.setEdad(edad_cli);
			cli.setRun_usuario(run);
			
			Usuariodaoimpl usuimpl = new Usuariodaoimpl();
			
			boolean res = usuimpl.crearUsuario(usu, cli);
			String msg = "";
			
			if (res) {
				msg = "El usuario se agregó exitosamente";
			}
			else {
				msg = "El usuario no se pudo agregar porque ocurrió un error";
			}

			request.setAttribute("mensaje", msg);
			request.getRequestDispatcher("/JSP/msgusuario.jsp").forward(request, response);
			
		}else if(tipo == 2) {
			String run_adm = request.getParameter("run_adm");
			String nombre_adm = request.getParameter("nombres_adm");
			String apellido_adm = request.getParameter("apellidos_adm");
			String correo_adm = request.getParameter("correo_adm");
			String area_adm = request.getParameter("area_adm");
			
			adm.setRun_adm(run_adm);
			adm.setNombres_adm(nombre_adm);
			adm.setApellidos_adm(apellido_adm);
			adm.setCorreo_adm(correo_adm);
			adm.setArea_adm(area_adm);
			adm.setRun_usuario(run);
			
			Usuariodaoimpl usuimpl = new Usuariodaoimpl();
			
			boolean res = usuimpl.crearUsuario1(usu, adm);
			String msg = "";
			
			if (res) {
				msg = "El usuario se agregó exitosamente";
			}
			else {
				msg = "El usuario no se pudo agregar porque ocurrió un error";
			}

			request.setAttribute("mensaje", msg);
			request.getRequestDispatcher("/JSP/msgusuario.jsp").forward(request, response);
		}else if(tipo == 3) {
			String run_pro = request.getParameter("run_pro");
			String nombre_pro = request.getParameter("nombre_pro");
			String apellido_pro = request.getParameter("apellido_pro");
			String telefono_pro = request.getParameter("telefono_pro");
			String titulo_pro = request.getParameter("titulo");
			String proyecto_pro = request.getParameter("proyecto");
			
			pro.setRun_profesional(run_pro);
			pro.setNombre_pro(nombre_pro);
			pro.setApellido_pro(apellido_pro);
			pro.setTelefono_pro(telefono_pro);
			pro.setTitulo(titulo_pro);
			pro.setProyecto(proyecto_pro);
			pro.setRun_usuario(run);
			
			Usuariodaoimpl usuimpl = new Usuariodaoimpl();
			
			boolean res = usuimpl.crearUsuario2(usu, pro);
			String msg = "";
			
			if (res) {
				msg = "El usuario se agregó exitosamente";
			}
			else {
				msg = "El usuario no se pudo agregar porque ocurrió un error";
			}

			request.setAttribute("mensaje", msg);
			request.getRequestDispatcher("/JSP/msgusuario.jsp").forward(request, response);
		}	
	}

}
