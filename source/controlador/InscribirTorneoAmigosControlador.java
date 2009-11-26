package controlador;

import vistas.InscribirTorneoAmigosFrame;
import vistas.MostrarEquipoFrame;
import logica.SistemaGranDT;
import logica.dao.TorneoDAO;

public class InscribirTorneoAmigosControlador {
	
	private SistemaGranDT logica;
	private TorneoDAO tdao;
	
	private InscribirTorneoAmigosFrame frame;
	
	public InscribirTorneoAmigosControlador(){
		super();
		
		this.logica = SistemaGranDT.getInstance();
		this.tdao= new TorneoDAO();
		
		this.frame = new InscribirTorneoAmigosFrame();
		this.frame.setControlador(this);
		this.frame.setVisible(true);
	}

	public String buscarTorneosPorDuenio(String busqueda) {
		if (busqueda.isEmpty())
			return "Debe ingresar el nombre o apellido de un usuario";
		else{
			String nombre="";
			String apellido="";
			busqueda.split(" ");
			
			
			return null;
		}
	}

	public void buscarTorneosPorNombre(String busqueda) {
		// TODO Auto-generated method stub
		
	}

}
