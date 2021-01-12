package modelo;

public class Profesional {

	private String run_profesional;
	private String nombre_pro;
	private String apellido_pro;
	private String telefono_pro;
	private String titulo;
	private String proyecto;
	private String run_usuario;
	
	public Profesional() {
		super();
	}

	public Profesional(String run_profesional, String nombre_pro, String apellido_pro, String telefono_pro,
			String titulo, String proyecto, String run_usuario) {
		super();
		this.run_profesional = run_profesional;
		this.nombre_pro = nombre_pro;
		this.apellido_pro = apellido_pro;
		this.telefono_pro = telefono_pro;
		this.titulo = titulo;
		this.proyecto = proyecto;
		this.run_usuario = run_usuario;
	}

	public String getRun_profesional() {
		return run_profesional;
	}

	public void setRun_profesional(String run_profesional) {
		this.run_profesional = run_profesional;
	}

	public String getNombre_pro() {
		return nombre_pro;
	}

	public void setNombre_pro(String nombre_pro) {
		this.nombre_pro = nombre_pro;
	}

	public String getApellido_pro() {
		return apellido_pro;
	}

	public void setApellido_pro(String apellido_pro) {
		this.apellido_pro = apellido_pro;
	}

	public String getTelefono_pro() {
		return telefono_pro;
	}

	public void setTelefono_pro(String telefono_pro) {
		this.telefono_pro = telefono_pro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public String getRun_usuario() {
		return run_usuario;
	}

	public void setRun_usuario(String run_usuario) {
		this.run_usuario = run_usuario;
	}

	@Override
	public String toString() {
		return "Profesional [run_profesional=" + run_profesional + ", nombre_pro=" + nombre_pro + ", apellido_pro="
				+ apellido_pro + ", telefono_pro=" + telefono_pro + ", titulo=" + titulo + ", proyecto=" + proyecto
				+ ", run_usuario=" + run_usuario + "]";
	}

	
}
