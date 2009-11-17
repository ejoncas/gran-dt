package logica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import logica.Equipo;

public class EquipoDAO {

	private final DAOConnectionManager DAOCM = DAOConnectionManager.getDAOConectionManager();

	public Vector<Equipo> getAllEquipos(){
		Vector<Equipo> equi = new Vector<Equipo>();

		try{
			//connect to db
			Connection connection = DAOCM.getConnection();
			//create statement. we create an special statement. This rs will be able to scroll upwards and backwards
			Statement stmt = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			String query = "SELECT id, nombre, puntaje FROM Equipo";
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			//we move to the first row - ResultSet starts "before first"
			//we create the new team
			while(rs.next()){
				Equipo e = new Equipo(rs.getInt("id"), rs.getString("nombre"),rs.getInt("puntaje"));
				equi.addElement(e);
			}

			//we close all the connections
			connection.close();
			stmt.close();
			rs.close();

			//Return the team vector
			return equi;

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

	//retorna null si no lo encuentra. Otherwise retorna el Equipo
	public Equipo getEquipoPorNombre(String nombre){
		Equipo e;
		try{
			//connect to db
			Connection connection = DAOCM.getConnection();
			//create statment
			Statement stmt = connection.createStatement();

			String query = "SELECT id, nombre, puntaje FROM Equipo WHERE nombre = '"+nombre+"'";
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			//we create the new team

			if(rs.next()){
				e=new Equipo(rs.getInt("id"), rs.getString("nombre"), rs.getInt("puntaje"));
			}
			else
				e=null;

			//we close all the connections
			connection.close();
			stmt.close();
			rs.close();

			//Return the team vector
			return e;
		}catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			return null;
		}catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			return null;
		}

	}
	
	public void insertEquipo(Equipo e){
		ResultSet rs2 = null;
		PreparedStatement stmt = null;
		Statement stmt2 = null;
		
		try {
			Connection connection = DAOCM.getConnection();
			String query = "INSERT INTO Equipo VALUES (?,?)";
			stmt = connection.prepareStatement(query);
			stmt.setString(1, e.getNombre());
			stmt.setInt(2, e.getPuntajeacum());
			//stmt = connection.createStatement();

			stmt.execute();
			
			String query2 =  "SELECT @@IDENTITY";
			stmt2 = connection.createStatement();
			rs2 = stmt2.executeQuery(query2);
			
			if (rs2.next()){
				System.out.println("ADENTRO DEL IF");
				e.setId(rs2.getInt(1));
				
			}
			stmt.close();
			stmt2.close();
			rs2.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}finally{
			
			//DAOCM.getConnection().close();
		}
	
	}

}
