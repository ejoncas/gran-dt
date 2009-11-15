package logica;
import java.util.Date;
import java.util.Vector;

import logica.dao.EquipoDAO;
import logica.dao.JugadorDAO;

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
	private Vector<Usuario> usuarios;
	private Vector<Jugador> jugadores;
	private Vector<Torneo> torneos;
	private JugadorDAO jdao;
	private EquipoDAO edao;
	private Usuario usuarioActual;
	//otros daos
	private static SistemaGranDT grandt=null;


	private SistemaGranDT(){
		//Private Constructor -  SINGLETON
		this.usuarios=new Vector<Usuario>();
		this.jugadores=new Vector<Jugador>();
		this.torneos=new Vector<Torneo>();
		this.edao = new EquipoDAO();
		this.jdao = new JugadorDAO();
		this.usuarioActual=null;
	}

	public static SistemaGranDT getInstance(){
		//This method return the unique instance - SINGLETON
		return grandt==null ? grandt = new SistemaGranDT() : grandt;		
	}

	// getters
	public Vector<Usuario> getUsuarios() {
		return usuarios;
	}

	public Vector<Jugador> getJugadores() {
		return jugadores;
	}

	public Vector<Torneo> getTorneos() {
		return torneos;
	}

	public JugadorDAO getJdao() {
		return jdao;
	}

	public void setJdao(JugadorDAO jdao) {
		this.jdao = jdao;
	}

	public EquipoDAO getEdao() {
		return edao;
	}

	public void setEdao(EquipoDAO edao) {
		this.edao = edao;
	}

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}


	// valida el DNI: si ya existe un usuario con el dni devuelve true, si no false.
	public boolean validarDNI (String tipo, int nro){
		String t;
		int n;
		for(int i=0; i<usuarios.size();i++){
			Usuario u = usuarios.elementAt(i);
			n = u.getNroDoc();
			t = u.getTipoDoc();
			if (tipo.equals(t) && nro == n)
				return true;
		}			
		return false;		
	}
	
	// debe validarse previamente que el nro y doc existan
	public Usuario getUsuarioByDoc(String tipo, int nro){
		String t;
		int n;
		for(int i=0; i<usuarios.size();i++){
			Usuario u = usuarios.elementAt(i);
			n = u.getNroDoc();
			t = u.getTipoDoc();
			if (tipo.equals(t) && nro == n)
				return u;
		}			
		return null;	
		
	}

	public void listarUsuarios(){
		for(Usuario u : this.usuarios){
			System.out.println(u.toString());
		}
	}
	public void listarEquipos(){
		for(Usuario u: this.usuarios){
			System.out.println(u.getEquipo().toString());
		}
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

		//TODO Agregarlo a la BD... aca o en el costructor, as you wish. 
		// Pero que la base no quede inconsistente!!!

		this.usuarios.addElement(u);

	}

	public void setUsuarios(Vector<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setJugadores(Vector<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public void setTorneos(Vector<Torneo> torneos) {
		this.torneos = torneos;
	}

	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}


}