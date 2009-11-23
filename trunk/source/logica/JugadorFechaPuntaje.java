package logica;

public class JugadorFechaPuntaje {

	private String nombre;
	private String apellido;
	private int fecha;
	private int puntaje;
	
	public JugadorFechaPuntaje(String n, String a, int f, int p){
		this.nombre = n;
		this.apellido = a;
		this.fecha = f;
		this.puntaje = p;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getFecha() {
		return this.fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getPuntaje() {
		return this.puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}


	
}
