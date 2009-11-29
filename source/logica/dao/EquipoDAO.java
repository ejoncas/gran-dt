package logica.dao;

import java.sql.Connection;
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
			stmt.close();
			rs.close();
			DAOCM.closeConnection();

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

	public Vector<Equipo> getAllEquiposOrderByPuntaje(){
		Vector<Equipo> equi = new Vector<Equipo>();

		try{
			//connect to db
			Connection connection = DAOCM.getConnection();
			//create statement. we create an special statement. This rs will be able to scroll upwards and backwards
			Statement stmt = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			String query = "SELECT id, nombre, puntaje FROM Equipo ORDER BY puntaje DESC";
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			//we move to the first row - ResultSet starts "before first"
			//we create the new team
			while(rs.next()){
				Equipo e = new Equipo(rs.getInt("id"), rs.getString("nombre"),rs.getInt("puntaje"));
				equi.addElement(e);
			}

			//we close all the connections
			stmt.close();
			rs.close();
			DAOCM.closeConnection();

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
			stmt.close();
			rs.close();
			DAOCM.closeConnection();

			//Return the team vector
			return e;
		}catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}

	//Busca un equipo segun el tipo y nro de documento del usuario.
	// Si lo encuentra lo retorna, sino retorna null.
	public Equipo getEquipoPorUsuario(String tipoDoc, int nroDoc){
		Equipo e;
		try{
			//connect to db
			Connection connection = DAOCM.getConnection();
			//create statement
			Statement stmt = connection.createStatement();


			String query = 
				"SELECT e.id, e.nombre, e.puntaje " +
				"FROM Equipo e " +
				"INNER JOIN Usuario u " +
				"ON u.equipo_fk = e.id "+
				"WHERE u.nro_doc = "+nroDoc+" " +
				"AND u.tipo_doc = '"+tipoDoc+"'";
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			if(rs.next()){
				e=new Equipo(rs.getInt("id"), rs.getString("nombre"), rs.getInt("puntaje"));
			}
			else
				e=null;

			// cerrar conexiones

			stmt.close();
			rs.close();
			DAOCM.closeConnection();

			// devuelve el equipo
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
				System.out.println("Hubo result set");
				e.setId(rs2.getInt(1));

			}
			stmt.close();
			stmt2.close();
			rs2.close();
			DAOCM.closeConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally{

			//DAOCM.getConnection().close();
		}

	}

	public Vector<Equipo> getAllEquiposByTorneo(String nombre) {
		Vector<Equipo> equi = new Vector<Equipo>();

		try{
			//connect to db
			Connection connection = DAOCM.getConnection();
			//create statement. we create an special statement. This rs will be able to scroll upwards and backwards
			Statement stmt = connection.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			String query = 
				"SELECT e.id, e.nombre, p.puntaje " +
				"FROM Equipo e " +
				"INNER JOIN Posiciones p " +
				"ON p.equipo_fk = e.id " +
				"INNER JOIN Torneo t " +
				"ON t.id = p.torneo_fk " +
				"WHERE t.nombre LIKE '"+nombre+"' " +
				"AND p.participa = 1 " +
				"ORDER BY e.puntaje DESC";
			//execute query
			ResultSet rs = stmt.executeQuery(query);

			//we move to the first row - ResultSet starts "before first"
			//we create the new team
			while(rs.next()){
				Equipo e = new Equipo(rs.getInt("id"), rs.getString("nombre"),rs.getInt("puntaje"));
				equi.addElement(e);
			}

			//we close all the connections
			stmt.close();
			rs.close();
			DAOCM.closeConnection();

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

}
