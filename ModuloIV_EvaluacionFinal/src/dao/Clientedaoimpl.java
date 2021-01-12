package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import conexion.Singleton;
import interfaces.iClientedao;
import modelo.Cliente;

public class Clientedaoimpl implements iClientedao{

	@Override
	public Cliente obtenerUsuarioPorId(String run_usuario) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		Cliente c = new Cliente();
		String sql = "select * from cliente where usuario_runusuario = '"+run_usuario+"'";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				c.setRUT(rs.getString(1));
				c.setNombres(rs.getString(2));
				c.setApellidos(rs.getString(3));
				c.setTelefono(rs.getString(4));
				c.setAFP(rs.getString(5));
				c.setSistema_salud(rs.getInt(6));
				c.setDireccion(rs.getString(7));
				c.setComuna(rs.getString(8));
				c.setEdad(rs.getInt(9));
				c.setRun_usuario(rs.getString(10));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return c;
	
	}

	@Override
	public boolean editarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		String sql = "UPDATE cliente SET clinombre = '" + cliente.getNombres() + "', cliapellidos = '" 
		+ cliente.getApellidos()+ "', clitelefono = '" 
		+ cliente.getTelefono()+ "', cliafp = '" + cliente.getAFP()+ "', clisistemasalud = '" 
		+ cliente.getSistema_salud()+ "', clidireccion = '" + cliente.getDireccion() 
		+ "', clicomuna = '" + cliente.getComuna()+ "', cliedad = '" + cliente.getEdad()
		+ "' WHERE rutcliente = '" + cliente.getRUT() + "'";
		
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
