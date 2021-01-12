package interfaces;

import modelo.Profesional;

public interface iProfesionaldao {

	public Profesional obtenerUsuarioPorId(String run_usuario);
	
	public boolean editarProfesional(Profesional profesional);
}
