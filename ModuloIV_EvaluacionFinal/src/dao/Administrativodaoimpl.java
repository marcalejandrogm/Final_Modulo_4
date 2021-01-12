package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import conexion.Singleton;
import interfaces.iAdministrativodao;
import modelo.Administrativo;

public class Administrativodaoimpl implements iAdministrativodao{

	@Override
	public Administrativo obtenerUsuarioPorId(String run_usuario) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		Administrativo a = new Administrativo();
		String sql = "select * from administrativos where usuario_runusuario = '"+run_usuario+"'";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				a.setRun_adm(rs.getString(1));
				a.setNombres_adm(rs.getString(2));
				a.setApellidos_adm(rs.getString(3));
				a.setCorreo_adm(rs.getString(4));
				a.setArea_adm(rs.getString(5));
				a.setRun_usuario(rs.getString(6));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return a;
	}

	@Override
	public boolean editarAdministrativo(Administrativo administrativo) {
		// TODO Auto-generated method stub
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		String sql = "UPDATE administrativos SET nombres = '" + administrativo.getNombres_adm() + "', apellidos = '" 
		+ administrativo.getApellidos_adm()+ "', correo = '" + administrativo.getCorreo_adm()+ "', area = '" 
		+ administrativo.getArea_adm()+ "' WHERE runadministrativo = '" + administrativo.getRun_adm() + "'";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			resultado = true;
			stm.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return resultado;
	}

}
