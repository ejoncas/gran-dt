package controlador;

import java.util.Vector;

import vistas.AdministrarTorneoAmigosFrame;

import logica.SistemaGranDT;
import logica.Torneo;
import logica.administradores.AdministradorDAOs;

public class AdministrarTorneoAmigosControlador {
	
	private SistemaGranDT logica;
	private AdministradorDAOs adminDAO;
	private AdministrarTorneoAmigosFrame frame;
	
	public AdministrarTorneoAmigosControlador(){
		this.logica=SistemaGranDT.getInstance();
		this.adminDAO=logica.getAdminDAO();
		this.frame= new AdministrarTorneoAmigosFrame(this);
		this.frame.setVisible(true);
	}
	
	public Vector<Torneo> cargarTorneosCreados(){
		Vector<Torneo> torneos = adminDAO.getTorneosCreados(logica.getUsuarioActual());
		return torneos;
		
		
	}

	public AdministrarTorneoAmigosFrame getFrame() {
		return this.frame;
	}
	
	

}
