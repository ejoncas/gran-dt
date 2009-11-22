package logica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import logica.Arquero;
import logica.Defensor;
import logica.Delantero;
import logica.Jugador;
import logica.Volante;

public class JugadorDAO {

	private DAOConnectionManager DAOCM = DAOConnectionManager.getDAOConectionManager();

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
			Jugador r = new Jugador(rs.getInt("id"),rs.getString("nombre"), rs.getString("apellido"),
					rs.getString("equipo"),rs.getDate("nacimiento"),
					rs.getInt("puntaje"),rs.getFloat("precio"));

			//we close all the connections
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
				Jugador r = new Jugador(rs.getInt("id"),rs.getString("nombre"), rs.getString("apellido"),
						rs.getString("equipo"),rs.getDate("nacimiento"),
						rs.getInt("puntaje"),rs.getFloat("precio"));
				jugadores.addElement(r);
			}

			//we close all the connections
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

	public Vector<Jugador> getJugadoresTodos(){
		try{
			//connect to db
			Connection connection = DAOCM.getConnection();
			//create statment
			Statement stmt = connection.createStatement();

			String query = "SELECT * FROM Jugador";
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			Vector<Jugador> jugadores = new Vector<Jugador>();

			//we move to the first row - ResultSet starts "before first"
			while(rs.next()){
				//we create the new player
				Jugador r=null;
				if(rs.getString("posicion").equals("DEF"))
					r = new Defensor(rs.getInt("id"),rs.getString("nombre"), rs.getString("apellido"),
							rs.getString("equipo"),rs.getDate("nacimiento"),
							rs.getInt("puntaje"),rs.getFloat("precio"));
				else if (rs.getString("posicion").equals("VOL"))
					r = new Volante(rs.getInt("id"),rs.getString("nombre"), rs.getString("apellido"),
							rs.getString("equipo"),rs.getDate("nacimiento"),
							rs.getInt("puntaje"),rs.getFloat("precio"));
				else if (rs.getString("posicion").equals("DEL"))
					r = new Delantero(rs.getInt("id"),rs.getString("nombre"), rs.getString("apellido"),
							rs.getString("equipo"),rs.getDate("nacimiento"),
							rs.getInt("puntaje"),rs.getFloat("precio"));
				else if (rs.getString("posicion").equals("ARQ"))
					r = new Arquero(rs.getInt("id"),rs.getString("nombre"), rs.getString("apellido"),
							rs.getString("equipo"),rs.getDate("nacimiento"),
							rs.getInt("puntaje"),rs.getFloat("precio"));

				if(r!=null){jugadores.addElement(r);}

			}

			//we close all the connections
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
			//seteamos acorde a la instancia que es
			if(j instanceof Volante)
				stmt.setString(7, "VOL");
			else if (j instanceof Defensor)
				stmt.setString(7, "DEF");
			else if (j instanceof Delantero)
				stmt.setString(7, "DEL");
			else if (j instanceof Arquero)
				stmt.setString(7, "ARQ");

			stmt.execute();

			String query2 = "select @@IDENTITY";
			Statement stmt2 = connection.createStatement();
			ResultSet rs2 = stmt2.executeQuery(query2);

			if (rs2.next()){
				//le guardamos el ID otorgado por la BD
				j.setId(rs2.getInt(1));
			}

			//cerramos todo
			stmt.close();
			stmt2.close();
			rs2.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
