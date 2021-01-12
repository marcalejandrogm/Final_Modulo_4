package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Singleton;
import interfaces.iUsuariodao;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;


public class Usuariodaoimpl implements iUsuariodao{

	@Override
	public List<Usuario> obtenerUsuario() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		List<Usuario> listausuarios = new ArrayList<Usuario>();		
		String sql = "select * from usuario";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Usuario u = new Usuario();
				u.setNombre(rs.getString(1));
				u.setFecha_nacimiento(rs.getString(2));
				u.setRun_usuario(rs.getString(3));
				u.setTipo(rs.getInt(4));
				listausuarios.add(u);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return listausuarios;
	}

	@Override
	public boolean crearUsuario(Usuario usuario, Cliente cliente) {
		// TODO Auto-generated method stub
		boolean registrar = false;
		
		Statement stm = null;
		
		Connection con = null;
		
		String sql = "INSERT INTO USUARIO VALUES ('" 
				+ usuario.getNombre() + "','" 
				+ usuario.getFecha_nacimiento() + "','" 
				+ usuario.getRun_usuario() + "','" 
				+ usuario.getTipo() + "')";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		} catch (SQLException e) {
			System.out.println("Error: " + "Clase Usuariodaoimpl, " + "método crear Usuario");
			e.printStackTrace();
		}
		
		
			String sql1 = "INSERT INTO cliente VALUES ('" 
					+ cliente.getRUT() + "','" 
					+ cliente.getNombres() + "','" 
					+ cliente.getApellidos() + "','" 
					+ cliente.getTelefono() + "','" 
					+ cliente.getAFP() + "','" 
					+ cliente.getSistema_salud()+ "','"
					+ cliente.getDireccion() + "','"
					+ cliente.getComuna() + "','" 
					+ cliente.getEdad() + "','" 
					+ cliente.getRun_usuario()+"')";
			
			try {
				con = Singleton.getConnection();
				stm = con.createStatement();
				stm.execute(sql1);
				registrar = true;
				stm.close();
				//con.close();
			} catch (SQLException e) {
				System.out.println("Error: " + "Clase Usuariodaoimpl, " + "método crear Usuario tipo ");
				e.printStackTrace();
			}
		
		
		return registrar;
	}

	@Override
	public boolean crearUsuario1(Usuario usuario, Administrativo administrativo) {
		// TODO Auto-generated method stub
		boolean registrar = false;
		
		Statement stm = null;
		
		Connection con = null;
		
		String sql = "INSERT INTO USUARIO VALUES ('" 
				+ usuario.getNombre() + "','" 
				+ usuario.getFecha_nacimiento() + "','" 
				+ usuario.getRun_usuario() + "','" 
				+ usuario.getTipo() + "')";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		} catch (SQLException e) {
			System.out.println("Error: " + "Clase Usuariodaoimpl, " + "método crear Usuario");
			e.printStackTrace();
		}
		
		String sql1 = "INSERT INTO administrativos VALUES ('" 
				+ administrativo.getRun_adm() + "','" 
				+ administrativo.getNombres_adm() + "','" 
				+ administrativo.getApellidos_adm() + "','" 
				+ administrativo.getCorreo_adm() + "','" 
				+ administrativo.getArea_adm()+ "','" 
				+ administrativo.getRun_usuario()+"')";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql1);
			registrar = true;
			stm.close();
			//con.close();
		} catch (SQLException e) {
			System.out.println("Error: " + "Clase Usuariodaoimpl, " + "método crear Usuario tipo Administrativo");
			e.printStackTrace();
		}
	
	
		return registrar;
	}

	@Override
	public boolean crearUsuario2(Usuario usuario, Profesional profesional) {
		// TODO Auto-generated method stub
		boolean registrar = false;
		
		Statement stm = null;
		
		Connection con = null;
		
		String sql = "INSERT INTO USUARIO VALUES ('" 
				+ usuario.getNombre() + "','" 
				+ usuario.getFecha_nacimiento() + "','" 
				+ usuario.getRun_usuario() + "','" 
				+ usuario.getTipo() + "')";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			
		} catch (SQLException e) {
			System.out.println("Error: " + "Clase Usuariodaoimpl, " + "método crear Usuario");
			e.printStackTrace();
		}
		
		
			String sql1 = "INSERT INTO profesionales VALUES ('" 
					+ profesional.getRun_profesional() + "','" 
					+ profesional.getNombre_pro() + "','" 
					+ profesional.getApellido_pro() + "','" 
					+ profesional.getTelefono_pro() + "','" 
					+ profesional.getTitulo() + "','" 
					+ profesional.getProyecto()+ "','"
					+ profesional.getRun_usuario()+"')";
			
			try {
				con = Singleton.getConnection();
				stm = con.createStatement();
				stm.execute(sql1);
				registrar = true;
				stm.close();
				//con.close();
			} catch (SQLException e) {
				System.out.println("Error: " + "Clase Usuariodaoimpl, " + "método crear Usuario tipo Profesional");
				e.printStackTrace();
			}
		
		
		return registrar;
	}

	@Override
	public boolean editarUsuario(Usuario usuario, Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}



	
	

}
