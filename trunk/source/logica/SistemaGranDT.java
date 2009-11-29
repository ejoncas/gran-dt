package logica;
import java.util.Date;
import java.util.Vector;

import logica.administradores.AdministradorDAOs;
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
	private AdministradorDAOs adminDAO;
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
		this.adminDAO = new AdministradorDAOs();
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



	public AdministradorDAOs getAdminDAO() {
		return adminDAO;
	}

	public void setAdminDAO(AdministradorDAOs adminDAO) {
		this.adminDAO = adminDAO;
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

	public void cargarJugadores(){ 
		this.jugadores = this.adminDAO.obtenerTodosJugadores() ;
	}

	public void liberarJugadores(){
		this.jugadores = null;
		//y aca esperemos que pase el garbage colector y los limpie
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

	public void cargarEquipoTitular() {
		int[] idsTitulares = this.adminDAO.obtenerEquipoTitularIDS(this.usuarioActual);
		EquipoTitular et  = new EquipoTitular();
		for(Jugador j : this.jugadores){
			for(int i=0; i<idsTitulares.length;i++){
				if(j.getId()==idsTitulares[i]){
					if(j instanceof Arquero)
						et.addArquero((Arquero) j);
					else if (j instanceof Defensor)
						et.addDefensor((Defensor) j);
					else if (j instanceof Delantero)
						et.addDelantero((Delantero) j);
					else if (j instanceof Volante)
						et.addVolante((Volante) j);
				}

			}
		}
		this.usuarioActual.getEquipo().setEquipoTitular(et);
	}

	public void cargarEquipoSuplente() {
		//mandamos false para indicar al query que queremos solo los suplentes
		int[] idsSuplentes = this.adminDAO.obtenerEquipoSuplenteIDS(this.usuarioActual);
		EquipoSuplente es = new EquipoSuplente();
		for(Jugador j: this.jugadores){
			for(int i=0; i < idsSuplentes.length ; i++ ){
				if(j.getId()==idsSuplentes[i]){
					if(j instanceof Arquero)
						es.addArquero((Arquero) j);
					else if (j instanceof Defensor)
						es.addDefensor((Defensor) j);
					else if (j instanceof Delantero)
						es.addDelantero((Delantero) j);
					else if (j instanceof Volante)
						es.addVolante((Volante) j);
				}
			}
		}
		this.usuarioActual.getEquipo().setEquipoSuplente(es);
	}



	//	public Torneo buscarTorneo(String nombre){
	//		for (int i=0; i<this.getTorneos().;
	//		
	//		
	//		return t;
	//	}

	public Jugador getJugadorByNombre(String n, String a){
		if(this.jugadores == null)
			this.cargarJugadores();
		for ( Jugador j : this.jugadores){
			if(j.getNombre().equals(n) && j.getApellido().equals(a))
				return j;
		}
		return null;
	}

	public Vector<Equipo> cargarEquipos() {
		Vector<Equipo> e = new Vector<Equipo>();

		e = this.adminDAO.getAllEquiposByPuntaje();

		return e;
	}

}