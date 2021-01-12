package modelo;

public class Administrativo {
	
	private String run_adm;
	private String nombres_adm;
	private String apellidos_adm;
	private String correo_adm;
	private String area_adm;
	private String run_usuario;
	
	public Administrativo() {
		super();
	}

	public Administrativo(String run_adm, String nombres_adm, String apellidos_adm, String correo_adm, String area_adm,
			String run_usuario) {
		super();
		this.run_adm = run_adm;
		this.nombres_adm = nombres_adm;
		this.apellidos_adm = apellidos_adm;
		this.correo_adm = correo_adm;
		this.area_adm = area_adm;
		this.run_usuario = run_usuario;
	}

	public String getRun_adm() {
		return run_adm;
	}

	public void setRun_adm(String run_adm) {
		this.run_adm = run_adm;
	}

	public String getNombres_adm() {
		return nombres_adm;
	}

	public void setNombres_adm(String nombres_adm) {
		this.nombres_adm = nombres_adm;
	}

	public String getApellidos_adm() {
		return apellidos_adm;
	}

	public void setApellidos_adm(String apellidos_adm) {
		this.apellidos_adm = apellidos_adm;
	}

	public String getCorreo_adm() {
		return correo_adm;
	}

	public void setCorreo_adm(String correo_adm) {
		this.correo_adm = correo_adm;
	}

	public String getArea_adm() {
		return area_adm;
	}

	public void setArea_adm(String area_adm) {
		this.area_adm = area_adm;
	}

	public String getRun_usuario() {
		return run_usuario;
	}

	public void setRun_usuario(String run_usuario) {
		this.run_usuario = run_usuario;
	}

	@Override
	public String toString() {
		return "Administrativo [run_adm=" + run_adm + ", nombres_adm=" + nombres_adm + ", apellidos_adm="
				+ apellidos_adm + ", correo_adm=" + correo_adm + ", area_adm=" + area_adm + ", run_usuario="
				+ run_usuario + "]";
	}
	
}
