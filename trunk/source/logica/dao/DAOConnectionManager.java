package logica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOConnectionManager {


	/*
        //Home
    protected String jdbc = "jdbc:microsoft:sqlserver://";
	protected String servidor = "192.168.2.102:1443";
	protected String usuario = "jonatan";
	protected String password = "manager";
	private static DAOConnectionManager DAOCM;
	 */
	//Laboratorio

	protected String jdbc = "jdbc:sqlserver://";
	protected String servidor = "172.16.174.2:1433";
	protected String usuario = "poo07";
	protected String password = "poo07";
	protected String defaultdb = "poo07";
	private static DAOConnectionManager DAOCM;

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
