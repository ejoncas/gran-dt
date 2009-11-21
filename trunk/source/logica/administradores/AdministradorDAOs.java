package logica.administradores;

import java.util.Vector;

import logica.Jugador;
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


}
