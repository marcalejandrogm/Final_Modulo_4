package interfaces;

import modelo.Cliente;

public interface iClientedao {
	
	public Cliente obtenerUsuarioPorId(String run_usuario);
	
	public boolean editarCliente(Cliente cliente);
}
