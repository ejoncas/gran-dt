package controlador;

import logica.SistemaGranDT;
import logica.Torneo;
import logica.Usuario;
import logica.administradores.AdministradorDAOs;
import logica.dao.TorneoDAO;

public class CrearTorneoAmigosControlador {	

	// referencia al sistema, logica de negocio
	private final SistemaGranDT logica;
	private final AdministradorDAOs adminDAO;
	//private final TorneoDAO tdao;
	
	// para guardar el nombre del torneo
	private String nombre;

	// constructor del controlador
	public CrearTorneoAmigosControlador (){
		this.logica = SistemaGranDT.getInstance(); // referencia al sistema
		//this.tdao= new TorneoDAO();
		this.adminDAO=new AdministradorDAOs();
		System.out.println(this.logica);
	}
	
	// validacion
		
	public String validarCrearTorneo(String n){
		if (n.isEmpty())
			return "Debe ingresar un nombre para el torneo.";		
		return null;
	}
	
	public String crearTorneo(String n){
		String resultado = validarCrearTorneo(n);
		if (resultado==null){ // si el ingreso del nombre del torneo esta ok
			if (adminDAO.getTorneoPorNombre(n)==null){ // si no existe un torneo con ese nombre				
				Torneo t = new Torneo(n); // crea el torneo
				t.setCreador(logica.getUsuarioActual());
				logica.getTorneos().addElement(t); // lo agrega al vector
				adminDAO.guardarTorneo(t); // lo guarda en la bd
				adminDAO.agregarDuenioTorneo(logica.getUsuarioActual(), t);
				return null; // si se creo ok devuelve null
			}
			else
				return "El nombre de torneo ingresado ya existe"; // mensaje de error			
		}
		else
			return resultado; // devuelve el mensaje de error
	}
	
//	public String crearTorneo(String n, Usuario u){
//		String resultado = validarExisteTorneo(String n);
//		if (resultado==null)
//			
//		
//		return null;
//		
//	}
}
