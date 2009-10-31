package logica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import logica.Jugador;

public class JugadorDAO {
	private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	//edit Config class according to your MSSQLServer
	private final String user = ConfigDB.USER;
	private final String password = ConfigDB.PASS;
	private final String defaultdb = ConfigDB.DEFAULT_DB;
	private final String ip = ConfigDB.IP;

	private final String urldb = "jdbc:sqlserver://"+this.ip+":1433;DatabaseName="+this.defaultdb;

	public Jugador getJugadorPorId(int id){
		try{
			//import jdbc
			Class.forName(this.driver);
			//connect to db
			Connection connection = DriverManager.getConnection(urldb,this.user,this.password);
			//create statment
			Statement stmt = connection.createStatement();

			String query = "SELECT * FROM Jugador where id = "+id;
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			//we move to the first row - ResultSet starts "before first"
			rs.next();

			//we create the new player
			Jugador r = new Jugador(rs.getString("nombre"), rs.getString("apellido"),
					rs.getString("equipo"),rs.getDate("nacimiento"),
					rs.getInt("puntaje"),rs.getFloat("precio"));

			//we close all the connections
			connection.close();
			stmt.close();
			rs.close();

			//Return the player
			return r;

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	public Vector<Jugador> getJugadoresPorPosicion(String posicion){
		try{
			//import jdbc
			Class.forName(this.driver);
			//connect to db
			Connection connection = DriverManager.getConnection(urldb,this.user,this.password);
			//create statment
			Statement stmt = connection.createStatement();

			String query = "SELECT * FROM Jugador where posicion = '"+posicion+"'";
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			Vector<Jugador> jugadores = new Vector<Jugador>();

			//we move to the first row - ResultSet starts "before first"
			while(rs.next()){
				//we create the new player
				Jugador r = new Jugador(rs.getString("nombre"), rs.getString("apellido"),
						rs.getString("equipo"),rs.getDate("nacimiento"),
						rs.getInt("puntaje"),rs.getFloat("precio"));
				jugadores.addElement(r);
			}
			//we close all the connections
			connection.close();
			stmt.close();
			rs.close();

			//Return the player
			return jugadores;

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
