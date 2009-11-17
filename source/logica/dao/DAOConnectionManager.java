package logica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConnectionManager {



	//Home - add your own settings here
	protected String jdbc = "jdbc:sqlserver://";
	protected String servidor = "192.168.56.101:1433";
	protected String usuario = "poo";
	protected String password = "poo";
	protected String defaultdb = "grandt";
	private static DAOConnectionManager DAOCM;

	//Laboratorio
	//Dejar esto comentado para cuando estamos en el laboratorio!
	//	protected String jdbc = "jdbc:sqlserver://";
	//	protected String servidor = "172.16.174.2:1433";
	//	protected String usuario = "poo07";
	//	protected String password = "poo07";
	//	protected String defaultdb = "poo07";
	//	private static DAOConnectionManager DAOCM;

	public static DAOConnectionManager getDAOConectionManager()
	{
		if(DAOCM==null) {
			DAOCM = new DAOConnectionManager();
		}
		return DAOCM;
	}

	private Connection connect()
	{
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

			String dbConnectString = this.jdbc+this.servidor+";DatabaseName="+this.defaultdb;
			Connection connection = DriverManager.getConnection(dbConnectString, usuario, password);
			return connection;
		}
		catch(SQLException e) {
			System.out.println("Mensaje de error: " + e.getMessage());
			return null;
		}
		catch(Exception ex) {
			System.out.println("Mensaje de error: " + ex.getMessage());
			return null;
		}
	}

	public Connection getConnection()
	{
		return connect();
	}

	public void closeConnection()
	{
		try {
			DAOCM.closeConnection();
		}
		catch(Exception ex) {
			System.out.println("Mensaje de error: " + ex.getMessage());
		}
	}

}
