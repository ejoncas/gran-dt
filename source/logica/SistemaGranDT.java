package logica;
import java.util.Date;
import java.util.Vector;

/**
 * @author jonatan
 * 
 * Sistema Gran DT (Claringa)
 * 
 * Este programa corresponde a un trabajo realizado para la cátedra Programacion
 * Orientada a Objetos (POO).
 * 
 * Profesora Titular: Vanesa Maiorana
 * 
 * Integrantes del Grupo:
 * -Arroyo, Maria Candelas
 * -Castro Crespin, Jonatan Ezequiel
 * 
 */

public class SistemaGranDT {
	private final Vector<Usuario> usuarios;
	private final Vector<Jugador> jugadores;
	private final Vector<Torneo> torneos;
	private static SistemaGranDT grandt=null;


	private SistemaGranDT(){
		//Private Constructor -  SINGLETON
		this.usuarios=new Vector<Usuario>();
		this.jugadores=new Vector<Jugador>();
		this.torneos=new Vector<Torneo>();
	}

	public SistemaGranDT getInstance(){
		//This method return the unique instance - SINGLETON
		return grandt==null ? new SistemaGranDT() : grandt;		
	}

	// getters
	public Vector getUsuarios() {
		return usuarios;
	}

	public Vector getJugadores() {
		return jugadores;
	}

	public Vector getTorneos() {
		return torneos;
	}
	
	
	
	/********** validaciones *************/
	// valida el DNI: si ya existe un usuario con el dni devuelve true, si no false.
	public boolean validarDNI (String tipo, int nro){
		Vector usuarios = this.getUsuarios();
		String t;
		int n;
		for(int i=0; i<usuarios.size();i++){
			Usuario u = (Usuario) usuarios.elementAt(i);
			n = u.getNroDoc();
			t = u.getTipoDoc();
			if (tipo.equals(t) && nro == n)
				return true;
		}			
		return false;		
	}
	
	// crea un usuario y lo agrega al vector de usuarios
	public void crearUsuario(String nombre, String apellido, String tipoDoc, int nroDoc,
			Date fechaNac, String sexo, String hincha, String provincia,
			String partido, String localidad, String calle, int numero,
			int piso, String dpto, String cp, int tel, int cel,
			String proveedorCel, String email, String password){
		
		Usuario u = new Usuario(nombre,  apellido,  tipoDoc,  nroDoc,
			 fechaNac,  sexo,  hincha, provincia,
			 partido,  localidad,  calle, numero,
			 piso,  dpto,  cp,  tel,  cel,
			 proveedorCel,  email,  password);
		
		this.usuarios.addElement(u);
		
	}
}