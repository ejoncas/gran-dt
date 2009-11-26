package main;

import java.io.IOException;

import logica.SistemaGranDT;
import vistas.LoginFrame;
import controlador.LoginControlador;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @author jonatan, candela
	 */
	public static void main(String[] args) throws IOException {
		SistemaGranDT sys = SistemaGranDT.getInstance();

		//		TESTING Armar Equipo
		//		Jugador j1 = new Jugador("Jona", "Castro", "Almagro",2000,10,12,10000);
		//		j1.setPosicion("DEF");
		//		Jugador j2 = new Jugador("Roberto", "Carlos", "Brasil",2000,10,12,10000);
		//		Jugador j3 = new Jugador("LaGata", "Fernandez", "River",2000,10,12,10000);
		//		Jugador j4 = new Jugador("Lisandro", "Lopez", "River",2000,10,12,10000);
		//		Jugador j5 = new Jugador("Gauyo","Ronaldinho", "River",2000,10,12,10000);
		//		Jugador j6 = new Jugador("Martin","Palermo", "River",2000,10,12,10000);
		//		j3.setPosicion("DEL");
		//
		//		Usuario u = new Usuario("admin", "admin", "DNI", 345678, new Date(2009,1,1), "F", "admin", "admin", "admin", "admin", "admin", 1, 1, "A","AB", 345, 34567, "Movistar", "admin@admin.com", "1234");

		//TESTING LoginFrame
		//		Usuario u = new Usuario("admin", "admin", "DNI", 345678, new Date(2009,1,1), "F", "admin", "admin", "admin", "admin", "admin", 1, 1, "A","AB", 345, 34567, "Movistar", "admin@admin.com", "1234");
		//		sys.getUsuarios().addElement(u);
		//		new LoginFrame(new LoginControlador()).setVisible(true);

		//		sys.setUsuarioActual(u);
		//		sys.getUsuarios().addElement(u);
		//
		//
		//		sys.getJugadores().addElement(j3);
		//		sys.getJugadores().addElement(j4);
		//		sys.getJugadores().addElement(j5);
		//		sys.getJugadores().addElement(j6);
		//		sys.getJugadores().addElement(j1);
		//		sys.getJugadores().addElement(j2);
		//
		//
		//		new ArmarEquipoControlador();

		//		Jugador j1 = new Jugador("Jona", "Castro", "Almagro",2000,10,12,10000);
		//		j1.setPosicion("DEF");
		//		Jugador j2 = new Jugador("Roberto", "Carlos", "Brasil",2000,10,12,10000);
		//		j2.getFechaNacSQLString();
		//		Jugador j3 = new Jugador("LaGata", "Fernandez", "River",2000,10,12,10000);
		//		Jugador j4 = new Jugador("Lisandro", "Lopez", "River",2000,10,12,10000);
		//		Jugador j5 = new Jugador("Gauyo","Ronaldinho", "River",2000,10,12,10000);
		//		Jugador j6 = new Jugador("Martin","Palermo", "River",2000,10,12,10000);
		//		j3.setPosicion("DEL");
		//
		//
		//		sys.setUsuarioActual(u);
		//		sys.getUsuarios().addElement(u);


		//		sys.getJugadores().addElement(j3);
		//		sys.getJugadores().addElement(j4);
		//		sys.getJugadores().addElement(j5);
		//		sys.getJugadores().addElement(j6);
		//		sys.getJugadores().addElement(j1);
		//		sys.getJugadores().addElement(j2);
		//
		//
		//		new ArmarEquipoControlador();


		//Testing DAO
		//		JugadorDAO jdao = new JugadorDAO();
		//		Jugador loaded = jdao.getJugadorPorId(1704);
		//		System.out.println(loaded.toString());


		//new AltaUsuario1Frame(new AltaUsuarioControlador());

		//Vector<Jugador> jugadoresVolantes = jdao.getJugadoresPorPosicion("VOL");

		//jdao.insertJugador(j);


		//for(Jugador jug : jugadoresVolantes){
		//		System.out.println(jug.toString());
		//}

		//		EquipoDAO edao = new EquipoDAO();
		//		Vector<Equipo> equipos = edao.getAllEquipos();
		//
		//
		//		for(Equipo e : equipos){
		//			System.out.println(e.toString());
		//		}
		//
		//		Equipo e2=edao.getEquipoPorNombre("Equipo Loco");
		//		if(e2!=null)
		//			System.out.println("EQUIPILLO LOCO:"+e2.toString());
		//		else
		//			System.out.println("No se encontro ningun equipo con ese nombre");
		//	EquipoDAO edao = new EquipoDAO();
		//		Vector<Equipo> equipos = edao.getAllEquipos();
		//
		//
		//		for(Equipo e : equipos){
		//			System.out.println(e.toString());
		//		}
		//
		//		Equipo e2=edao.getEquipoPorNombre("Equipo Loco");
		//		if(e2!=null)
		//			System.out.println("EQUIPILLO LOCO:"+e2.toString());
		//		else
		//			System.out.println("No se encontro ningun equipo con ese nombre");

		//new AltaUsuario1();

		//		TESTING CSV

		//		CsvReader r=null;
		//		try {
		//			r = new CsvReader("database/jugadores.csv");
		//		} catch (FileNotFoundException e) {
		//			e.printStackTrace();
		//		}
		//
		//
		//		//avanzamos uno ya que la primer row son los headers de la tabla
		//		r.readRecord();
		//
		//		while(r.readRecord()){
		//			//les paso el index de la columna
		//			System.out.println("Apellido: "+r.get(0));
		//			System.out.println("Nombre: "+r.get(1));
		//			System.out.println("Equipo: "+r.get(2));
		//			System.out.println("Precio: "+r.get(3));
		//			System.out.println("Posicion: "+r.get(4));
		//		}

		//		Equipo e = new Equipo("rdfghjk");
		//		EquipoDAO  edao = new EquipoDAO();
		//		System.out.println(e.getId());
		//		edao.insertEquipo(e);
		//		System.out.println(e.getId());

		//LA POSTA
		new LoginFrame(new LoginControlador()).setVisible(true);

		//		EquipoDAO edao = new EquipoDAO();
		//		Equipo e = edao.getEquipoPorUsuario("DNI", 123123);
		//		System.out.println(e.toString());

		//System.out.println(sys.getUsuarios().toString());
		//		Equipo equipoCande = new Equipo("equipo de cande");
		//		Usuario userCande = new Usuario("cande", "arroyo", "dni",34292147, new Date(1989,1,12), "f","nada", "nqn", "nqn", "capital","alguna",123,3,"d","300",123,123,"Movistar","cande89@gmail.com", "cande",equipoCande,6000000,0);
		//		UsuarioDAO udao = new UsuarioDAO();
		//		udao.guardarUsuario(userCande, 5);
		//		



		//		
		//		Equipo e2 = edao.getEquipoPorNombre("Sarasa");
		//		System.out.println(e2.getId() + e2.getNombre());
		//		

		
		
		
		String x = "lalala lalalal lalalla la";
		
		System.out.println(x);

		String []cortado = x.split(" ");
		for(String s :cortado)
			System.out.println(s);
	}

}
