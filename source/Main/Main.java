
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
		Jugador loaded = jdao.cargarJugadorPorId(1704);

		System.out.println(loaded.toString());



	}

}