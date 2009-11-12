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
		
		this.disponibles = logica.getJugadores(); //
		//this.disponibles = logica.getJdao().getAllJugadores();
		
		this.titulares=this.logica.getUsuarioActual().getEquipo().getEquipoTitular();
		this.suplentes=this.logica.getUsuarioActual().getEquipo().getEquipoSuplente();
	}
	
	
	
	

	

}
