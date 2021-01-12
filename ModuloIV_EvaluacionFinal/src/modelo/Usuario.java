package modelo;

public class Usuario {

	private String nombre;
	private String fecha_nacimiento;
	private String run_usuario;
	private int tipo;
	
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String fecha_nacimiento, String run_usuario, int tipo) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.run_usuario = run_usuario;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getRun_usuario() {
		return run_usuario;
	}

	public void setRun_usuario(String run_usuario) {
		this.run_usuario = run_usuario;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento + ", run_usuario=" + run_usuario
				+ ", tipo=" + tipo + "]";
	}

	
	
}
