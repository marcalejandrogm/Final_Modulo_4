package interfaces;

import modelo.Administrativo;

public interface iAdministrativodao {
	
	public Administrativo obtenerUsuarioPorId(String run_usuario);
	
	public boolean editarAdministrativo(Administrativo administrativo);
}
