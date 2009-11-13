package controlador;

import java.util.Vector;

import logica.EquipoSuplente;
import logica.EquipoTitular;
import logica.Jugador;
import logica.SistemaGranDT;
import vistas.ArmarEquipoFrame;

public class ArmarEquipoControlador {
	private ArmarEquipoFrame frame;
	private SistemaGranDT logica;

	private Vector<Jugador> disponibles;
	private EquipoTitular titulares;
	private EquipoSuplente suplentes;
	private float montoGastado;
	private float montoDisponible;

	public ArmarEquipoControlador(ArmarEquipoFrame frame) {
		super();
		this.frame = frame;
		this.logica = SistemaGranDT.getInstance();

		//levantamos todos los jugadores para llenar la pantalla
		this.disponibles = logica.getJugadores(); 
		//this.disponibles = logica.getJdao().getAllJugadores();

		//levantamos el equipo titular del usuario logueado
		this.titulares=this.logica.getUsuarioActual().getEquipo().getEquipoTitular();
		//levantamos el equipo suplente del usuario logueado
		this.suplentes=this.logica.getUsuarioActual().getEquipo().getEquipoSuplente();

		//obtenemos los demas datos relevantes para la ventana
		this.montoDisponible = this.logica.getUsuarioActual().getMontoDisponible();
		this.montoGastado = this.logica.getUsuarioActual().getMontoGastado();

	}

	public ArmarEquipoFrame getFrame() {
		return frame;
	}

	public void setFrame(ArmarEquipoFrame frame) {
		this.frame = frame;
	}

	public SistemaGranDT getLogica() {
		return logica;
	}

	public void setLogica(SistemaGranDT logica) {
		this.logica = logica;
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
