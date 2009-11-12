package logica.dao;

import java.sql.Connection;
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
		System.out.println("Validando contra la BD");
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
				System.out.println(rs.getInt("id")+" " + rs.getString("nombre")+ " " + rs.getInt("puntaje"));
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

}
