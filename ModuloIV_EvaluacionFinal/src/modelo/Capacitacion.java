package modelo;

public class Capacitacion {

	private int id;
	private String fecha;
	private String hora;
	private String lugar;
	private int duracion;
	private String rutCliente;
	
	public Capacitacion() {
		super();
	}

	public Capacitacion(int id, String fecha, String hora, String lugar, int duracion, String rutCliente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.rutCliente = rutCliente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	@Override
	public String toString() {
		return "Capacitacion [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", duracion="
				+ duracion + ", rutCliente=" + rutCliente + "]";
	}
	
}
