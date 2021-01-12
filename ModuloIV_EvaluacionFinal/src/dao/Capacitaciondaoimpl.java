package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Singleton;
import interfaces.iCapacitaciondao;
import modelo.Capacitacion;

public class Capacitaciondaoimpl implements iCapacitaciondao {

	@Override
	public boolean registrar(Capacitacion capacitacion) {
		// TODO Auto-generated method stub
		boolean registrar = false;
		
		Statement stm = null;
		
		Connection con = null;
		
		String sql = "INSERT INTO CAPACITACION VALUES ('" 
				+ capacitacion.getId() + "','" 
				+ capacitacion.getFecha() + "','" 
				+ capacitacion.getHora() + "','" 
				+ capacitacion.getLugar() + "','" 
				+ capacitacion.getDuracion()+ "','" 
				+ capacitacion.getRutCliente() + "')";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		} catch (SQLException e) {
			System.out.println("Error: " + "Clase Capacitaciondaoimpl, " + "método registrar");
			e.printStackTrace();
		}
		
		return registrar;
	}

	@Override
	public List<Capacitacion> obtener() {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
		Statement stm = null;
		
		ResultSet rs = null;
		
		String sql = "SELECT * FROM CAPACITACION";
		
		List<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Capacitacion capacitacion = new Capacitacion();
				capacitacion.setId(rs.getInt(1));
				capacitacion.setFecha(rs.getString(2));
				capacitacion.setHora(rs.getString(3));
				capacitacion.setLugar(rs.getString(4));
				capacitacion.setDuracion(rs.getInt(5));
				capacitacion.setRutCliente(rs.getString(6));
				listaCapacitacion.add(capacitacion);
			}
			rs.close();
			stm.close();
			//con.close();
		} catch (SQLException e) {
			System.out.println("Error: " + "Clase Capacitaciondaoimpl, " + "método obtener");
			e.printStackTrace();
		}
		
		return listaCapacitacion;

	}

	
}
