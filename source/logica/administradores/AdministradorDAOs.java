package logica.administradores;

import java.util.Vector;

import logica.Equipo;
import logica.EquipoSuplente;
import logica.EquipoTitular;
import logica.Jugador;
import logica.Usuario;
import logica.dao.EquipoDAO;
import logica.dao.EquipoJugadorDAO;
import logica.dao.JugadorDAO;
import logica.dao.UsuarioDAO;

public class AdministradorDAOs {
	private EquipoDAO equipo;
	private JugadorDAO jugador;
	private UsuarioDAO usuario;
	private EquipoJugadorDAO equipojugador;

	public AdministradorDAOs() {
		super();
		this.equipo = new EquipoDAO();
		this.jugador = new JugadorDAO();
		this.usuario = new UsuarioDAO();
		this.equipojugador = new EquipoJugadorDAO();
	}

	public Vector<Jugador> obtenerTodosJugadores(){
		return this.jugador.getJugadoresTodos();
	}


	public void insertarJugadores(Vector<Jugador> jugadores){
		for( Jugador j : jugadores){
			this.jugador.insertJugador(j);
		}
	}

	//Levanta el usuario de la base, carga su equipo y sus jugadores
	//	public void loguearUsuario(String tipoDoc, int nroDoc){
	//		Usuario u = this.usuario.getUsuarioPorDoc(tipoDoc, nroDoc);
	//		SistemaGranDT.getInstance().setUsuarioActual(u);
	//		
	//	}

	public Usuario getUsuarioPorDoc(String tipoDoc, int nroDoc) {
		return this.usuario.getUsuarioPorDoc(tipoDoc, nroDoc);
	}

	public Equipo getEquipoPorDoc(String t, int n){
		return this.equipo.getEquipoPorUsuario(t, n);
	}

	public int[] obtenerEquipoTitularIDS(Usuario u){
		return this.equipojugador.getEquipoIDS(u, true);
	}

	public int[] obtenerEquipoSuplenteIDS(Usuario u){
		return this.equipojugador.getEquipoIDS(u, false);
	}

	public void guardarEquipoTitular(Equipo e,EquipoTitular et){
		this.equipojugador.deleteEquipo(e, true);
		//aca manejamos Jugadores ya que para la base no hay herencia
		for(Jugador j : et.getDefensores())
			this.equipojugador.insertEquipoJugador(e, j, true);
		for(Jugador j : et.getDelanteros())
			this.equipojugador.insertEquipoJugador(e, j, true);
		for(Jugador j : et.getVolantes())
			this.equipojugador.insertEquipoJugador(e, j, true);
		//finalmente guardamos el arquero
		this.equipojugador.insertEquipoJugador(e, et.getArquero(), true);

	}

	public void guardarEquipoSuplente(Equipo e,EquipoSuplente es){
		this.equipojugador.deleteEquipo(e, false);
		//aca manejamos Jugadores ya que para la base no hay herencia
		for(Jugador j : es.getDelanteros())
			this.equipojugador.insertEquipoJugador(e, j, false);

		this.equipojugador.insertEquipoJugador(e, es.getDefensor(),false);

		this.equipojugador.insertEquipoJugador(e, es.getVolante(),false);

		this.equipojugador.insertEquipoJugador(e, es.getArquero(), false);

	}


}
