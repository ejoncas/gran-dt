package controlador;

import logica.SistemaGranDT;

public class CrearTorneoAmigosControlador {	

	// referencia al sistema, logica de negocio
	private final SistemaGranDT logica;

	// para guardar el nombre del torneo
	private String nombre;

	// constructor del controlador
	public CrearTorneoAmigosControlador (){
		this.logica = SistemaGranDT.getInstance(); // referencia al sistema
		System.out.println(this.logica);
	}
	
	// validacion
	
	// si el campo esta vacio devuelve true, si tiene contenido false
	public boolean isEmpty(String t){
		return t.equals("");
	}
	
	public String validarCrearTorneo(String n){
		if (isEmpty(n))
			return "Error en el nombre del torneo ingresado";		
		return null;
	}
	
	public String validarExisterTorneo(String n){
		String resultado = validarCrearTorneo(n);
		if (resultado==null){
			//TODO verificar si el nombre ingresado ya existe en la bd, o en el sistema
			
			// if (no existe)
			// crear el torneo con el nombre n, agregarlo al vector de torneos
			//
			return null;
			
			// else //(si ya existe)
			// return "El nombre de torneo ingresado ya existe";
			
		}
		else
			return resultado; // devuelve el mensaje de error
	}
}
