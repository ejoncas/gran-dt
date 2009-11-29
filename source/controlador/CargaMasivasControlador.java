package controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Vector;

import logica.Arquero;
import logica.Defensor;
import logica.Delantero;
import logica.Equipo;
import logica.EquipoSuplente;
import logica.EquipoTitular;
import logica.Jugador;
import logica.JugadorFechaPuntaje;
import logica.SistemaGranDT;
import logica.Usuario;
import logica.Volante;
import logica.administradores.AdministradorDAOs;

import com.csvreader.CsvReader;

public class CargaMasivasControlador {
	//private MenuAdminFrame menu;
	private SistemaGranDT logica;
	private CsvReader csvParser;
	private AdministradorDAOs adminDAO;


	// al presionar el boton examinar
	public CargaMasivasControlador() {
		super();
		//this.menu = MenuAdminFrame.getInstance();
		this.logica = SistemaGranDT.getInstance();
		adminDAO = new AdministradorDAOs();
		csvParser = null;
	}

	public String cargarJugadores(String pathcsv){
		try{
			csvParser = new CsvReader(pathcsv);
			//we set the default delimiter
			csvParser.setDelimiter(';');
			//avanzamos uno para saltearnos los headers

			csvParser.readRecord();

			Vector<Jugador> jugadores = new Vector<Jugador>();

			while(csvParser.readRecord()){
				Jugador j = null;
				float precio = 0;
				try{
					precio = Float.parseFloat(csvParser.get(2));
				}catch (Exception e){
					precio = 0;
				}
				//Nacen todos el 1/1/1999. El CSV no me da esa data
				//tambien se crean todos sin ids
				if(csvParser.get(3).equals("ARQ")){
					j = new Arquero(csvParser.get(0).split(",")[1],
							csvParser.get(0).split(",")[0], 
							csvParser.get(1), 1999,1,1, precio);
				}else if(csvParser.get(3).equals("DEL")){
					j = new Delantero(csvParser.get(0).split(",")[1],
							csvParser.get(0).split(",")[0], 
							csvParser.get(1), 1999,1,1, precio);
				}else if(csvParser.get(3).equals("DEF")){
					j = new Defensor(csvParser.get(0).split(",")[1],
							csvParser.get(0).split(",")[0], 
							csvParser.get(1), 1999,1,1, precio);
				}else if(csvParser.get(3).equals("VOL")){
					j = new Volante(csvParser.get(0).split(",")[1],
							csvParser.get(0).split(",")[0], 
							csvParser.get(1), 1999,1,1, precio);
				}
				//agregamos el jugador
				//esta funcion llama al dao el cual tambien les asigna un id
				jugadores.addElement(j);
			}



			adminDAO.insertarJugadores(jugadores);

			return jugadores.size()+" jugadores guardados.";

		}catch (FileNotFoundException e){
			System.out.println("Archivo no encontrado por el parser");
			e.printStackTrace();
			return "File not found exception";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error de IO");
			e.printStackTrace();
			return "IOException";
		}

	}


	public String cargarPuntajes(String pathcsv){
		Vector<JugadorFechaPuntaje> jfp= new Vector<JugadorFechaPuntaje>();

		try{
			csvParser = new CsvReader(pathcsv);
			//we set the default delimiter
			csvParser.setDelimiter(';');
			//avanzamos uno para saltearnos los headers

			csvParser.readRecord();

			JugadorFechaPuntaje aux;
			while(csvParser.readRecord()){
				aux = new JugadorFechaPuntaje(csvParser.get(0).split(",")[1],csvParser.get(0).split(",")[0], Integer.parseInt(csvParser.get(1)), Integer.parseInt(csvParser.get(2)));
				jfp.addElement(aux);
			}

			adminDAO.updatePuntajes(jfp);

			return jfp.size()+" puntajes guardados.";


		}catch (FileNotFoundException e){
			System.out.println("Archivo no encontrado por el parser");
			e.printStackTrace();
			return "File not found exception";
		} catch (IOException e) {
			System.out.println("Error de IO");
			e.printStackTrace();
			return "IOException";
		}

	}


	public String cargarEquipos(String pathcsv){

		Usuario u;
		Equipo e;
		EquipoTitular et;
		EquipoSuplente es;

		try{

			//cargamos los jugadores
			this.logica.cargarJugadores();

			csvParser = new CsvReader(pathcsv);
			//we set the default delimiter
			csvParser.setDelimiter(';');
			//avanzamos uno para saltearnos los headers

			csvParser.readRecord();


			while(csvParser.readRecord()){
				//todos los usuarios se crean con password csv
				System.out.println("ES ADMIN : " +csvParser.get(0));
				u = new Usuario(csvParser.get(1), csvParser.get(2), csvParser.get(3), 
						Integer.parseInt(csvParser.get(4)), 
						new Date(Integer.parseInt(csvParser.get(5).split("/")[2]),Integer.parseInt(csvParser.get(5).split("/")[1]),Integer.parseInt(csvParser.get(5).split("/")[0])), 
						csvParser.get(6), csvParser.get(7), csvParser.get(8), csvParser.get(9), csvParser.get(10), 
						csvParser.get(11), Integer.parseInt(csvParser.get(12)), Integer.parseInt(csvParser.get(13)), 
						csvParser.get(14).substring(0, 1), csvParser.get(15), Integer.parseInt(csvParser.get(16).replaceAll("-", "")), Integer.parseInt(csvParser.get(17).replaceAll("-", "")), 
						csvParser.get(18), csvParser.get(19), "csv");
				u.setMontoDisponible(60000000);
				//creamos el equipo con el nombre del usuario
				e = new Equipo("Equipo"+csvParser.get(1)+csvParser.get(2));

				this.adminDAO.guardarUsuarioEquipo(e, u);

				Arquero at = (Arquero) this.logica.getJugadorByNombre(csvParser.get(20).split(",")[1], csvParser.get(20).split(",")[0]);
				Arquero as = (Arquero) this.logica.getJugadorByNombre(csvParser.get(21).split(",")[1], csvParser.get(21).split(",")[0]);
				Defensor dt1 = (Defensor) this.logica.getJugadorByNombre(csvParser.get(22).split(",")[1], csvParser.get(22).split(",")[0]);
				Defensor dt2 = (Defensor) this.logica.getJugadorByNombre(csvParser.get(23).split(",")[1], csvParser.get(23).split(",")[0]);
				Defensor dt3 = (Defensor) this.logica.getJugadorByNombre(csvParser.get(24).split(",")[1], csvParser.get(24).split(",")[0]);
				Defensor dt4 = (Defensor) this.logica.getJugadorByNombre(csvParser.get(25).split(",")[1], csvParser.get(25).split(",")[0]);
				Defensor ds = (Defensor) this.logica.getJugadorByNombre(csvParser.get(26).split(",")[1], csvParser.get(26).split(",")[0]);
				Volante vt1 = (Volante) this.logica.getJugadorByNombre(csvParser.get(27).split(",")[1], csvParser.get(27).split(",")[0]);
				Volante vt2 = (Volante) this.logica.getJugadorByNombre(csvParser.get(28).split(",")[1], csvParser.get(28).split(",")[0]);
				Volante vt3 = (Volante) this.logica.getJugadorByNombre(csvParser.get(29).split(",")[1], csvParser.get(29).split(",")[0]);
				Volante vt4 = (Volante) this.logica.getJugadorByNombre(csvParser.get(30).split(",")[1], csvParser.get(30).split(",")[0]);
				Volante vs = (Volante) this.logica.getJugadorByNombre(csvParser.get(31).split(",")[1], csvParser.get(31).split(",")[0]);
				Delantero ddt1 = (Delantero) this.logica.getJugadorByNombre(csvParser.get(32).split(",")[1], csvParser.get(32).split(",")[0]);
				Delantero ddt2 = (Delantero) this.logica.getJugadorByNombre(csvParser.get(33).split(",")[1], csvParser.get(33).split(",")[0]);
				Delantero ds1 = (Delantero) this.logica.getJugadorByNombre(csvParser.get(34).split(",")[1], csvParser.get(34).split(",")[0]);
				Delantero ds2 = (Delantero) this.logica.getJugadorByNombre(csvParser.get(35).split(",")[1], csvParser.get(35).split(",")[0]);




				Vector<Defensor> def = new Vector<Defensor>();
				Vector<Volante> vol= new Vector<Volante>();
				Vector<Delantero> del = new Vector<Delantero>();
				Vector<Delantero> dels = new Vector<Delantero>();

				//Creamos el vector de Defensores tituales
				def.addElement(dt1);
				def.addElement(dt2);
				def.addElement(dt3);
				def.addElement(dt4);

				//Creamos el vector de Volantes tituares
				vol.addElement(vt4);
				vol.addElement(vt3);
				vol.addElement(vt2);
				vol.addElement(vt1);

				//Creamos el vector de delanteros titulare
				del.addElement(ddt2);
				del.addElement(ddt1);

				//Creamos el vector de delanteros suplentes
				dels.addElement(ds2);
				dels.addElement(ds1);

				et = new EquipoTitular(at, def, vol, del);
				es = new EquipoSuplente(as,ds,vs, dels);

				this.adminDAO.guardarEquipoTitular(e, et);
				this.adminDAO.guardarEquipoSuplente(e, es);

			}

			//liberamos el vector de jugadores 
			this.logica.liberarJugadores();

			return "Los equipos han sido cargados correctamente.";

		}catch (FileNotFoundException ex){
			System.out.println("Archivo no encontrado por el parser");
			ex.printStackTrace();
			return "File not found exception";
		} catch (IOException ex) {
			System.out.println("Error de IO");
			ex.printStackTrace();
			return "IOException";
		}

	}




}




