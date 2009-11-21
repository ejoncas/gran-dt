package controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import logica.Arquero;
import logica.Defensor;
import logica.Delantero;
import logica.Jugador;
import logica.SistemaGranDT;
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


}



