package logica;
public class Equipo {
	private String nombre;
	private EquipoTitular equipoTitular;
	private EquipoSuplente equipoSuplente;

	public String getNombre() {
		return this.nombre;
	}
	

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}
}