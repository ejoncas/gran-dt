
package Main;


import logica.Jugador;
import logica.dao.JugadorDAO;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jugador j = new Jugador("Jonatan", "Castro", "Almagro",2000,10,12,10000);

		System.out.println(j.getEdad());

		JugadorDAO jdao = new JugadorDAO();
		Jugador loaded = jdao.getJugadorPorId(1704);

		//Vector<Jugador> jugadoresVolantes = jdao.getJugadoresPorPosicion("VOL");

		//jdao.insertJugador(j);


		//for(Jugador jug : jugadoresVolantes){
		//		System.out.println(jug.toString());
		//}

		System.out.println(loaded.toString());



	}

}
