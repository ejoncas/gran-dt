package controlador;

import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import logica.Equipo;
import logica.SistemaGranDT;
import logica.Torneo;
import vistas.TablasPosicionesFrame;

public class TablaPosicionesControlador {

	private Vector<Equipo> equipos;
	private Vector<Torneo> torneos;

	private EquipoTableModel equiposModel;


	private SistemaGranDT logica;
	private TablasPosicionesFrame frame;

	public TablaPosicionesControlador(){
		super();
		this.logica = SistemaGranDT.getInstance();

		equipos = this.logica.cargarEquipos();

		//cargamos todos los equipos, para el caso de tabla general
		equiposModel =  new EquipoTableModel(equipos);



		//si el usuario actual es el admin, obtenemos todos los torneos
		if(this.logica.getUsuarioActual().getNombre().equals("admin"))
			torneos = this.logica.getAdminDAO().getAllTorneos();
		//sino, obtenemos solo los que creo
		else
			//agregamos el torneo general para que lo vea en el combo box
			torneos = this.logica.getAdminDAO().getTorneosParticipando(this.logica.getUsuarioActual());
		//en el caso que sea, agregamos el caso por default que muestra la tabla general
		torneos.add(0, new Torneo("General"));

		this.frame = new TablasPosicionesFrame();

		this.frame.getCmbTorneo().setModel(new DefaultComboBoxModel(torneos));
		this.frame.setControlador(this);
		this.frame.getTableEquipos().setModel(equiposModel);
		this.frame.setVisible(true);
	}

	public TablasPosicionesFrame getFrame() {
		return frame;
	}

	public void getPosiciones(Torneo selectedItem) {
		if(selectedItem.getNombre().equals("General"))
			this.equiposModel = new EquipoTableModel(this.logica.getAdminDAO().getAllEquiposByPuntaje());
		else
			this.equiposModel =  new EquipoTableModel(this.logica.getAdminDAO().getAllEquiposByTorneo(selectedItem));
		this.frame.getTableEquipos().setModel(equiposModel);
	}



}
