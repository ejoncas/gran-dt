package controlador;

import java.util.Vector;

import logica.EquipoSuplente;
import logica.EquipoTitular;
import logica.Jugador;
import logica.SistemaGranDT;
import vistas.ArmarEquipoFrame2;
import vistas.JugadorTableModel;

public class ArmarEquipoControlador {
	private ArmarEquipoFrame2 frame;
	private SistemaGranDT logica;

	private Vector<Jugador> disponibles;
	private EquipoTitular titulares;
	private EquipoSuplente suplentes;
	private float montoGastado;
	private float montoDisponible;

	public ArmarEquipoControlador() {
		super();

		//obtenemos referencia al sistema
		this.logica = SistemaGranDT.getInstance();

		//levantamos todos los jugadores para llenar la pantalla
		this.disponibles = logica.getJugadores();

		//TODO Descomentar lo siguiente, solo fue para testear
		//levantamos el equipo titular del usuario logueado
		//this.titulares=this.logica.getUsuarioActual().getEquipo().getEquipoTitular();

		//levantamos el equipo suplente del usuario logueado
		//this.suplentes=this.logica.getUsuarioActual().getEquipo().getEquipoSuplente();

		//obtenemos los demas datos relevantes para la ventana
		//this.montoDisponible = this.logica.getUsuarioActual().getMontoDisponible();
		//this.montoGastado = this.logica.getUsuarioActual().getMontoGastado();

		//Creamos los tables models para completar las vistas
		JugadorTableModel jug = new JugadorTableModel(this.logica.getJugadores());
		JugadorTableModel et = new JugadorTableModel();
		JugadorTableModel es = new JugadorTableModel();

		//Creamos la ventana y la ponemos visible
		this.frame = new ArmarEquipoFrame2(jug, et, es);
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

	public EquipoTitular getTitulares() {
		return titulares;
	}

	public void setTitulares(EquipoTitular titulares) {
		this.titulares = titulares;
	}

	public EquipoSuplente getSuplentes() {
		return suplentes;
	}

	public void setSuplentes(EquipoSuplente suplentes) {
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









}
