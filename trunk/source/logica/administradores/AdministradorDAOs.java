package logica.administradores;

import java.util.Vector;

import logica.Equipo;
import logica.Jugador;
import logica.Usuario;
import logica.dao.EquipoDAO;
import logica.dao.JugadorDAO;
import logica.dao.UsuarioDAO;

public class AdministradorDAOs {
	private EquipoDAO equipo;
	private JugadorDAO jugador;
	private UsuarioDAO usuario;

	public AdministradorDAOs() {
		super();
		this.equipo = new EquipoDAO();
		this.jugador = new JugadorDAO();
		this.usuario = new UsuarioDAO();
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


}
