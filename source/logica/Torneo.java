package logica;
import java.util.Vector;

public class Torneo {
	private String nombre;
	private Vector<Usuario> participantes;
	private Vector<Usuario> postulados;
	private Usuario creador;
	private int nroFecha;
	private Vector<Posicion> posiciones;


	public void addObserver(Object aObserver_O) {
		throw new UnsupportedOperationException();
	}

	public void removeObserver(Object aObserver_O) {
		throw new UnsupportedOperationException();
	}

	public void notifyObservers() {
		throw new UnsupportedOperationException();
	}
}