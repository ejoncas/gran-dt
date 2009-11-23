package controlador;

import java.util.Vector;

import vistas.JugadorTableModel;
import vistas.MostrarEquipoFrame;
import logica.SistemaGranDT;
import logica.Jugador;

public class MostrarEquipoControlador {
	
	private Vector<Jugador> titulares=null;
	private Vector<Jugador> suplentes=null;	

	private JugadorTableModel tableEquipoTModel;
	private JugadorTableModel tableEquipoSModel;
		
	private SistemaGranDT logica;
	private MostrarEquipoFrame frame;
	
	public MostrarEquipoControlador() {
		super();
		this.logica = SistemaGranDT.getInstance();
		
		logica.cargarJugadores();
		logica.cargarEquipoTitular();
		logica.cargarEquipoSuplente();
		
		
		this.titulares = this.logica.getUsuarioActual().getEquipo().getEquipoTitular().toVector();
		this.suplentes = this.logica.getUsuarioActual().getEquipo().getEquipoSuplente().toVector();
		tableEquipoTModel = new JugadorTableModel(this.titulares);
		tableEquipoSModel = new JugadorTableModel(this.suplentes);
		
		this.frame = new MostrarEquipoFrame(tableEquipoTModel,tableEquipoSModel);
		this.frame.setControlador(this);
		this.frame.setVisible(true);

	}
	
	public MostrarEquipoFrame getFrame(){
		return this.frame;
	}
	
	
	
	
	
	

}
