package interfaces;

import java.util.List;

import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;

public interface iUsuariodao {
	
	public List<Usuario> obtenerUsuario();
	
	public boolean crearUsuario(Usuario usuario, Cliente cliente);
	
	public boolean crearUsuario1(Usuario usuario, Administrativo administrativo);
	
	public boolean crearUsuario2(Usuario usuario, Profesional profesional);
	
	public boolean editarUsuario(Usuario usuario, Cliente cliente);
	
	
}
