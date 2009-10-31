package logica;
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
		this.usuarios=new Vector();
		this.jugadores=new Vector();
		this.torneos=new Vector();
	}

	public SistemaGranDT getInstance(){
		//This method return the unique instance - SINGLETON
		return grandt==null ? new SistemaGranDT() : grandt;		
	}


	public void ingresoNuevoUsuario(Object aString_n, Object aString_a, Object aString_td, Object aInt_nd, Object aDate_fn, Object aString_s, Object aString_h) {
		throw new UnsupportedOperationException();
	}

	public void armarEquipo() {
		throw new UnsupportedOperationException();
	}

	public void static_getInstance() {
		throw new UnsupportedOperationException();
	}

	public boolean validarDni(Object aInt_dni) {
		throw new UnsupportedOperationException();
	}

	public void ingresoDatosEquipoUsuario(Object aInt_nro, Object aString_ne, Object aString_nu, Object aString_pass, Object aString_cpass, Object aString_captcha) {
		throw new UnsupportedOperationException();
	}

	public void verificarDatosObligatorios() {
		throw new UnsupportedOperationException();
	}

	public void verificarDatosContacto() {
		throw new UnsupportedOperationException();
	}

	public void verificarDatosEquipoUsuario() {
		throw new UnsupportedOperationException();
	}

	public void ingresoDatosContacto(Object aString_p, Object aString_pa, Object aString_l, Object aString_c, Object aString_n, Object aString_cp, Object aString_cel, Object aString_op, Object aString_email) {
		throw new UnsupportedOperationException();
	}

	public void crearUsuario() {
		throw new UnsupportedOperationException();
	}
}