package logica.administradores;

import java.util.Vector;

import logica.Equipo;
import logica.EquipoSuplente;
import logica.EquipoTitular;
import logica.Jugador;
import logica.JugadorFechaPuntaje;
import logica.Torneo;
import logica.Usuario;
import logica.dao.EquipoDAO;
import logica.dao.EquipoJugadorDAO;
import logica.dao.JugadorDAO;
import logica.dao.PosicionesDAO;
import logica.dao.TorneoDAO;
import logica.dao.UsuarioDAO;

public class AdministradorDAOs {
	private EquipoDAO equipo;
	private JugadorDAO jugador;
	private UsuarioDAO usuario;
	private EquipoJugadorDAO equipojugador;
	private TorneoDAO torneo;
	private PosicionesDAO posiciones;

	public AdministradorDAOs() {
		super();
		this.equipo = new EquipoDAO();
		this.jugador = new JugadorDAO();
		this.usuario = new UsuarioDAO();
		this.equipojugador = new EquipoJugadorDAO();
		this.torneo = new TorneoDAO();
		this.posiciones = new PosicionesDAO();
	}

	public void guardarUsuarioEquipo(Equipo e, Usuario u){
		this.equipo.insertEquipo(e);
		this.usuario.guardarUsuario(u, e.getId());
	}

	public Vector<Jugador> obtenerTodosJugadores(){
		return this.jugador.getJugadoresTodos();
	}


	public void insertarJugadores(Vector<Jugador> jugadores){
		for( Jugador j : jugadores){
			this.jugador.insertJugador(j);
		}
	}

	public void updatePuntajes(Vector<JugadorFechaPuntaje> jfp) {
		for(JugadorFechaPuntaje aux : jfp){
			this.jugador.updatePuntaje(aux.getNombre(), aux.getApellido(),aux.getFecha(), aux.getPuntaje());
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

	public void updateMontosUsuario(Usuario u, float montoDisponible, float montoGastado) {
		this.usuario.updateMontos(u.getTipoDoc(), u.getNroDoc(),montoDisponible, montoGastado);
	}

	public int getCountUltimaFecha(Equipo e) {
		return this.jugador.countPuntajeUltimaFecha(e.getId());
	}


	public Vector<Torneo> getTorneosPorDuenio(String nombre, String apellido){
		Vector<Torneo> v = new Vector();
		v = torneo.getTorneosPorDuenio(nombre, apellido);
		return v;
		
	}
	
	public Vector<Torneo> getTorneosPorNombre(String nombre){
		Vector<Torneo> v = new Vector();
		v = torneo.getTorneosLikeNombre(nombre);
		return v;
	}
	
	public void postularse(Torneo t, Usuario u){
		posiciones.postularTorneo(torneo.getIdTorneo(t.getNombre()), u.getEquipo().getId());
	}
	
	public void guardarTorneo(Torneo t){
		torneo.guardarTorneo(t);		
	}
	
	public Torneo getTorneoPorNombre(String nombre){
		Torneo t = torneo.getTorneoPorNombre(nombre);
		return t;
		
	}


	public void agregarDuenioTorneo(Usuario usuarioActual, Torneo t) {
		posiciones.postularTorneo(torneo.getIdTorneo(t.getNombre()), usuarioActual.getEquipo().getId());
		posiciones.agregarParticipante(torneo.getIdTorneo(t.getNombre()), usuarioActual.getEquipo().getId());
	}
	
	public Vector<Torneo> getTorneosCreados(Usuario ua){
		return torneo.getTorneosCreados(ua.getTipoDoc(),ua.getNroDoc());
		
	}
	
	public void getPostuladosTorneo(Torneo t){
		
	}
	
	public void getParticipantesTorneo(){
		
	}
	
	public void aceptarPostuladoTorneo(Usuario u, Torneo t){
		posiciones.agregarParticipante(torneo.getIdTorneo(t.getNombre()),u.getEquipo().getId());
		
	}


}
