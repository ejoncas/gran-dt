package logica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import logica.Jugador;

public class JugadorDAO {



	//	private final String driver = ConfigDB.DRIVER;
	//	private final String user = ConfigDB.USER;
	//	private final String password = ConfigDB.PASS;
	//	private final String defaultdb = ConfigDB.DEFAULT_DB;
	//	private final String ip = ConfigDB.IP;
	//	private final String urldb = "jdbc:sqlserver://"+this.ip+":1433;DatabaseName="+this.defaultdb;

	private final DAOConnectionManager DAOCM = DAOConnectionManager.getDAOConectionManager();

	public Jugador getJugadorPorId(int id){
		try{
			//connect to db
			Connection connection = DAOCM.getConnection();
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
			//connect to db
			Connection connection = DAOCM.getConnection();
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


	public void insertJugador(Jugador j){

		try{
			//connect to db
			Connection connection = DAOCM.getConnection();

			String query = "insert into Jugador(nombre, apellido, equipo, nacimiento, puntaje, precio, posicion) values(?,?,?,?,?,?,?)";
			//create statment
			PreparedStatement stmt = connection.prepareStatement(query);

			//we prepare the statement
			stmt.setString(1, j.getNombre());
			stmt.setString(2, j.getApellido());
			stmt.setString(3, j.getEquipo());
			stmt.setString(4, j.getFechaNacSQLString());
			stmt.setInt(5, j.getPuntaje());
			stmt.setFloat(6, j.getPrecio());
			stmt.setString(7, "VOL");

			stmt.execute();

			//we close all the connections
			connection.close();
			stmt.close();

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
