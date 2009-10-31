package logica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logica.Jugador;

public class JugadorDAO {
	private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	//change the following lines acording to your MSSQLServer
	private final String user = "jonatan";
	private final String password = "manager";
	private final String defaultdb = "grandt";
	private final String ip = "192.168.2.102";

	private final String urldb = "jdbc:sqlserver://"+this.ip+":1433;DatabaseName="+this.defaultdb;

	public Jugador cargarJugadorPorId(int id){
		try{
			Class.forName(this.driver);
			Connection connection = DriverManager.getConnection(urldb,this.user,this.password);
			Statement stmt = connection.createStatement();
			String query = "SELECT * FROM Jugador where id = "+id;
			ResultSet rs = stmt.executeQuery(query);

			//we move to the first row - ResultSet starts "before first"
			rs.next();

			//we create the new player
			Jugador r = new Jugador(rs.getString("nombre"), rs.getString("apellido"),
					rs.getString("equipo"),rs.getDate("nacimiento"),
					rs.getFloat("precio"));

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

}
