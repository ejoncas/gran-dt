
package main;


import java.util.Vector;

import logica.Equipo;
import logica.EquipoSuplente;
import logica.Jugador;
import logica.dao.EquipoDAO;
import logica.dao.JugadorDAO;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j = new Jugador("Jonatan", "Castro", "Almagro",2000,10,12,10000);

		System.out.println(EquipoSuplente.getCANT_DEL());
		//System.out.println(j.getEdad());

		JugadorDAO jdao = new JugadorDAO();
		Jugador loaded = jdao.getJugadorPorId(1704);



		System.out.println(loaded.toString());


		//TODO Menu Interfaz
		//new AltaUsuario1Frame(new AltaUsuarioControlador());

		//Vector<Jugador> jugadoresVolantes = jdao.getJugadoresPorPosicion("VOL");

		//jdao.insertJugador(j);


		//for(Jugador jug : jugadoresVolantes){
		//		System.out.println(jug.toString());
		//}

		EquipoDAO edao = new EquipoDAO();
		Vector<Equipo> equipos = edao.getAllEquipos();


		for(Equipo e : equipos){
			System.out.println(e.toString());
		}

		Equipo e2=edao.getEquipoPorNombre("Equipo Loco");
		if(e2!=null)
			System.out.println("EQUIPILLO LOCO:"+e2.toString());
		else
			System.out.println("No se encontro ningun equipo con ese nombre");


		//new AltaUsuario1();


	}

}
