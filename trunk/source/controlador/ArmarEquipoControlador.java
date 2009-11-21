package controlador;

import java.util.Vector;

import logica.Jugador;
import logica.SistemaGranDT;
import vistas.ArmarEquipoFrame;
import vistas.JugadorTableModel;

public class ArmarEquipoControlador {
	private ArmarEquipoFrame frame;
	private SistemaGranDT logica;

	private Vector<Jugador> disponibles;
	//	private EquipoTitular titulares;
	//	private EquipoSuplente suplentes;
	private Vector<Jugador> titulares;
	private Vector<Jugador> suplentes;
	private float montoGastado;
	private float montoDisponible;

	public ArmarEquipoControlador() {
		super();

		//obtenemos referencia al sistema
		this.logica = SistemaGranDT.getInstance();

		//levantamos todos los jugadores para llenar la pantalla
		//levantamos todos los jugadores de la BD
		logica.cargarJugadores();
		//pasasrselos al table model y luego a la ventana
		this.disponibles = logica.getJugadores();

		//this.titulares = logica.getUsuarioActual().getEquipo().getEquipoTitular().toVector();

		//this.suplentes = logica.getUsuarioActual().getEquipo().getEquipoSuplente().toVector();

		//TODO Descomentar lo siguiente, solo fue para testear
		//levantamos el equipo titular del usuario logueado
		//this.titulares=this.logica.getUsuarioActual().getEquipo().getEquipoTitular();

		//levantamos el equipo suplente del usuario logueado
		//this.suplentes=this.logica.getUsuarioActual().getEquipo().getEquipoSuplente();

		//obtenemos los demas datos relevantes para la ventana
		//this.montoDisponible = this.logica.getUsuarioActual().getMontoDisponible();
		//this.montoGastado = this.logica.getUsuarioActual().getMontoGastado();

		//Creamos los tables models para completar las vistas
		JugadorTableModel jug = new JugadorTableModel(this.disponibles);
		JugadorTableModel et = null;
		JugadorTableModel es = null;
		if(this.titulares != null)
			et = new JugadorTableModel(this.titulares);
		else
			et = new JugadorTableModel();
		if(this.suplentes != null)
			es = new JugadorTableModel(this.suplentes);
		else
			es = new JugadorTableModel();

		//Creamos la ventana y la ponemos visible
		this.frame = new ArmarEquipoFrame(jug, et, es);
		//le seteamos esta misma clase como controlador
		this.frame.setControlador(this);
		this.frame.setVisible(true);
	}

	public Vector<Jugador> getDisponibles() {
		return disponibles;
	}

	public void setDisponibles(Vector<Jugador> disponibles) {
		this.disponibles = disponibles;
	}

	public Vector<Jugador> getTitulares() {
		return titulares;
	}

	public void setTitulares(Vector<Jugador> titulares) {
		//TODO validar que sea la cantidad correcta
		this.titulares = titulares;
	}

	public Vector<Jugador> getSuplentes() {
		return suplentes;
	}

	public void setSuplentes(Vector<Jugador> suplentes) {
		this.suplentes = suplentes;
	}

	public float getMontoGastado() {
		return montoGastado;
	}

	public void setMontoGastado(float montoGastado) {
		this.montoGastado = montoGastado;
	}

	public float getMontoDisponible() {
		return montoDisponible;
	}

	public void setMontoDisponible(float montoDisponible) {
		this.montoDisponible = montoDisponible;
	}

	public ArmarEquipoFrame getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}


}
