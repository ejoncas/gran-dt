package controlador;

import java.util.Vector;

import vistas.InscribirTorneoAmigosFrame;
import vistas.MostrarEquipoFrame;
import logica.SistemaGranDT;
import logica.Torneo;
import logica.administradores.AdministradorDAOs;
import logica.dao.TorneoDAO;

public class InscribirTorneoAmigosControlador {
	
	private SistemaGranDT logica;
	private AdministradorDAOs adminDAO;
	
	private InscribirTorneoAmigosFrame frame;
	
	public InscribirTorneoAmigosControlador(){
		super();
		
		this.logica = SistemaGranDT.getInstance();
		this.adminDAO = logica.getAdminDAO();
		
		this.frame = new InscribirTorneoAmigosFrame();
		this.frame.setControlador(this);
		this.frame.setVisible(true);
	}

	
	public void buscarTorneosPorDuenio(String busqueda) {
			String []cortado = busqueda.split(" ");
			Vector<Torneo> torneos ;
			if(cortado.length==1)
				torneos = adminDAO.getTorneosPorDuenio(cortado[0], cortado[0]);
			else if (cortado.length==2)
				torneos =adminDAO.getTorneosPorDuenio(cortado[0], cortado[1]);
			else
				torneos = adminDAO.getTorneosPorDuenio("","");
			for (Torneo t : torneos){
				this.frame.getListEncontradosModel().addElement(t);
			}

		}
	
	public void buscarTorneosPorNombre(String busqueda){
		Vector<Torneo> torneos ;
		if (busqueda.isEmpty())
			torneos=adminDAO.getTorneosPorNombre("");
		else
			torneos=adminDAO.getTorneosPorNombre(busqueda);
		for (Torneo t : torneos)
			this.frame.getListEncontradosModel().addElement(t);
	}

	public InscribirTorneoAmigosFrame getFrame() {
		return frame;
	}


	public void setFrame(InscribirTorneoAmigosFrame frame) {
		this.frame = frame;
	}
	
	public String postularse(Torneo t){
		if (t==null)
			return "Debe seleccionar el torneo al que desea postularse.";
		else{
			adminDAO.postularse(t,logica.getUsuarioActual());			
			return null;
		}
		
	}



}
