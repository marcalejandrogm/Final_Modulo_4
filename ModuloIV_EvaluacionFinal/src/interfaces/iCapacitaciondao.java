package interfaces;

import java.util.List;

import modelo.Capacitacion;

public interface iCapacitaciondao {

	public boolean registrar(Capacitacion capacitacion);
	
	public List<Capacitacion> obtener();
}
