package logica;
import java.util.Vector;

public class Torneo {
	private String nombre;
	private Vector<Usuario> participantes;
	private Vector<Usuario> postulados;
	private Usuario creador;
	private int nroFecha;

	public Torneo(String nombre) { 
		this.nombre=nombre;
		this.participantes= new Vector<Usuario>();
		this.postulados= new Vector<Usuario>();
		this.creador=null;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vector<Usuario> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Vector<Usuario> participantes) {
		this.participantes = participantes;
	}

	public Vector<Usuario> getPostulados() {
		return postulados;
	}

	public void setPostulados(Vector<Usuario> postulados) {
		this.postulados = postulados;
	}

	public Usuario getCreador() {
		return creador;
	}

	public void setCreador(Usuario creador) {
		this.creador = creador;
	}

	public int getNroFecha() {
		return nroFecha;
	}

	public void setNroFecha(int nroFecha) {
		this.nroFecha = nroFecha;
	}

	@Override
	public String toString(){	
		return this.nombre;
	}


}