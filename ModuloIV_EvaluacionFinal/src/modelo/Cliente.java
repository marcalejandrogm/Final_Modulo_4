package modelo;

public class Cliente {

	private String RUT;
	private String Nombres;
	private String Apellidos;
	private String Telefono;
	private String AFP;
	private int Sistema_salud;
	private String Direccion;
	private String Comuna;
	private int Edad;
	private String run_usuario;
	
	public Cliente() {
		super();
	}

	public Cliente(String rUT, String nombres, String apellidos, String telefono, String aFP, int sistema_salud,
			String direccion, String comuna, int edad, String run_usuario) {
		super();
		RUT = rUT;
		Nombres = nombres;
		Apellidos = apellidos;
		Telefono = telefono;
		AFP = aFP;
		Sistema_salud = sistema_salud;
		Direccion = direccion;
		Comuna = comuna;
		Edad = edad;
		this.run_usuario = run_usuario;
	}

	public String getRUT() {
		return RUT;
	}

	public void setRUT(String rUT) {
		RUT = rUT;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getAFP() {
		return AFP;
	}

	public void setAFP(String aFP) {
		AFP = aFP;
	}

	public int getSistema_salud() {
		return Sistema_salud;
	}

	public void setSistema_salud(int sistema_salud) {
		Sistema_salud = sistema_salud;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getComuna() {
		return Comuna;
	}

	public void setComuna(String comuna) {
		Comuna = comuna;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public String getRun_usuario() {
		return run_usuario;
	}

	public void setRun_usuario(String run_usuario) {
		this.run_usuario = run_usuario;
	}

	@Override
	public String toString() {
		return "Cliente [RUT=" + RUT + ", Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono
				+ ", AFP=" + AFP + ", Sistema_salud=" + Sistema_salud + ", Direccion=" + Direccion + ", Comuna="
				+ Comuna + ", Edad=" + Edad + ", run_usuario=" + run_usuario + "]";
	}

	
}
