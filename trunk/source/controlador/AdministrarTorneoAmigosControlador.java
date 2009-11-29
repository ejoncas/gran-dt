package controlador;

import java.util.Vector;

import logica.SistemaGranDT;
import logica.Torneo;
import logica.administradores.AdministradorDAOs;
import vistas.AdministrarTorneoAmigosFrame;

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

	public void refreshTorneo(Torneo t){
		this.frame.getListPostuladosModel().removeAllElements();
		this.frame.getListParticipantesModel().removeAllElements();
		Vector<String> postulados = adminDAO.getPostuladosTorneo(t);
		Vector<String> participantes = adminDAO.getParticipantesTorneo(t);
		for (String epos: postulados)
			this.frame.getListPostuladosModel().addElement(epos);
		//this.frame.getListPostuladosModel().add.getListPostulados().setListData(adminDAO.getPostuladosTorneo(t));
		//this.frame.getListParticipantes().setListData(adminDAO.getParticipantesTorneo(t));
		for (String epar: participantes)
			this.frame.getListParticipantesModel().addElement(epar);
	}

	public void rechazarPostulado(String nombreEquipo, Torneo torneo){
		adminDAO.rechazarPostulado(adminDAO.getEquipoPorNombre(nombreEquipo), torneo);


	}

	public void aceptarPostulado(String nombreEquipo, Torneo torneo){
		adminDAO.aceptarPostuladoTorneo(adminDAO.getEquipoPorNombre(nombreEquipo), torneo);

	}


}
