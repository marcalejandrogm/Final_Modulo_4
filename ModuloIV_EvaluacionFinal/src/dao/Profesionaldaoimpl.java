package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import conexion.Singleton;
import interfaces.iProfesionaldao;
import modelo.Profesional;

public class Profesionaldaoimpl implements iProfesionaldao {

	@Override
	public Profesional obtenerUsuarioPorId(String run_usuario) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		Profesional p = new Profesional();
		String sql = "select * from profesionales where usuario_runusuario = '" + run_usuario + "'";

		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);

			while (rs.next()) {
				p.setRun_profesional(rs.getString(1));
				p.setNombre_pro(rs.getString(2));
				p.setApellido_pro(rs.getString(3));
				p.setTelefono_pro(rs.getString(4));
				p.setTitulo(rs.getString(5));
				p.setProyecto(rs.getString(6));
				p.setRun_usuario(rs.getString(7));
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return p;
	}

	@Override
	public boolean editarProfesional(Profesional profesional) {
		// TODO Auto-generated method stub
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;

		String sql = "UPDATE profesionales SET nombres = '" + profesional.getNombre_pro() + "', apellidos = '"
				+ profesional.getApellido_pro() + "', telefono = '" + profesional.getTelefono_pro() + "', titulo = '"
				+ profesional.getTitulo() + "', proyecto = '" + profesional.getProyecto() + "' WHERE runprofesional = '"
				+ profesional.getRun_usuario() + "'";

		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			resultado = true;
			stm.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		return resultado;
	}

}
