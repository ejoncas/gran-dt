package logica;
import java.util.Vector;

public class Torneo {
	private String nombre;
	private Vector<Usuario> participantes;
	private Vector<Usuario> postulados;
	private Usuario creador;
	private int nroFecha; //TODO que onda esta ? para q se usa la fecha esta ?
	private Vector<Posicion> posiciones;


	public Torneo(String nombre) { 
	this.nombre=nombre;
	this.participantes= new Vector();
	this.postulados= new Vector();
	this.creador=null;
	this.posiciones= new Vector();
	}

	public void addObserver(Object aObserver_O) {
		throw new UnsupportedOperationException();
	}

	public void removeObserver(Object aObserver_O) {
		throw new UnsupportedOperationException();
	}

	public void notifyObservers() {
		throw new UnsupportedOperationException();
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

	public Vector<Posicion> getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(Vector<Posicion> posiciones) {
		this.posiciones = posiciones;
	}
	
	public String toString(){	
		return this.nombre;
	}
	
	
}