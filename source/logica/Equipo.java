package logica;
public class Equipo {
	private int id;
	private String nombre;
	private EquipoTitular equipoTitular;
	private EquipoSuplente equipoSuplente;
	private int puntajeacum;

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.puntajeacum=0;
	}
	public Equipo(int id,String nombre) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.puntajeacum=0;
	}

	public Equipo(int id, String nombre, int puntaje) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.nombre=nombre;
		this.puntajeacum=puntaje;
	}


	public EquipoTitular getEquipoTitular() {
		return equipoTitular;
	}
	public void setEquipoTitular(EquipoTitular equipoTitular) {
		this.equipoTitular = equipoTitular;
	}
	public EquipoSuplente getEquipoSuplente() {
		return equipoSuplente;
	}
	public void setEquipoSuplente(EquipoSuplente equipoSuplente) {
		this.equipoSuplente = equipoSuplente;
	}
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString(){
		return "\nNombre Equipo:"+this.nombre;
	}


}