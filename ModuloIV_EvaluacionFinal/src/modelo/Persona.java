package modelo;

public class Persona {
	
	private String nombre;
	private String clave;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String clave) {
		super();
		this.nombre = nombre;
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", clave=" + clave + "]";
	}
	
	
}
