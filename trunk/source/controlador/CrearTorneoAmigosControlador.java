package controlador;

import logica.SistemaGranDT;
import logica.Torneo;
import logica.dao.TorneoDAO;

public class CrearTorneoAmigosControlador {	

	// referencia al sistema, logica de negocio
	private final SistemaGranDT logica;
	private final TorneoDAO tdao;

	// para guardar el nombre del torneo
	private String nombre;

	// constructor del controlador
	public CrearTorneoAmigosControlador (){
		this.logica = SistemaGranDT.getInstance(); // referencia al sistema
		this.tdao= new TorneoDAO();
		System.out.println(this.logica);
	}
	
	// validacion
		
	public String validarCrearTorneo(String n){
		if (n.isEmpty())
			return "Debe ingresar un nombre para el torneo.";		
		return null;
	}
	
	public String validarExisterTorneo(String n){
		String resultado = validarCrearTorneo(n);
		if (resultado==null){
			if (tdao.getTorneoPorNombre(n)==null){ // si no existe un torneo con ese nombre
				Torneo t = new Torneo(n); // crea el torneo
				logica.getTorneos().addElement(t); // lo agrega al vector
				tdao.guardarTorneo(t); // lo guarda en la bd
				return "El torneo '"+n+"' ha sido creado con exito";
			}
			else
				return "El nombre de torneo ingresado ya existe"; // mensaje de error			
		}
		else
			return resultado; // devuelve el mensaje de error
	}
}
