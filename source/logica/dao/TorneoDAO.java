package logica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import logica.Equipo;
import logica.Torneo;
import logica.Usuario;

public class TorneoDAO {
	
	// manejo de la conexion
	private final DAOConnectionManager DAOCM = DAOConnectionManager.getDAOConectionManager();
	
	// metodos

	public void guardarTorneo(Torneo t){
		
		ResultSet rs2 = null;
		PreparedStatement stmt = null;
		Statement stmt2 = null;
		
		try{
			
			//conexion a la bd
			Connection connection = DAOCM.getConnection();

			// insercion del torneo
			String query = "INSERT INTO Torneo (nombre, tipo_doc, nro_doc) VALUES (?,?,?)";
			stmt = connection.prepareStatement(query);
			stmt.setString(1, (t.getNombre()));
			stmt.setString(2, t.getCreador().getTipoDoc());
			stmt.setInt(3, t.getCreador().getNroDoc());
			stmt.execute();
			
			// recuperacion del id del torneo			
			String query2 = "SELECT @@IDENTITY;";
			stmt2 = connection.createStatement();
			rs2 = stmt2.executeQuery(query2);
			
			if (rs2.next())
				System.out.println(rs2.getInt(1));
			
			// cerrar
			connection.close();
			stmt.close();
			rs2.close();


		}catch (SQLException e) {
			e.printStackTrace();
			//return null;
		}catch (Exception e) {
			e.printStackTrace();
			//return null;
		}
	}
	
	public Torneo getTorneoPorNombre(String nombre){
		Torneo t = null;
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

			String query = "SELECT nombre FROM Torneo WHERE nombre = '"+nombre+"'";
			ResultSet rs = stmt.executeQuery(query);

			//we create the new team

			if(rs.next()){
				
				t=new Torneo(rs.getString(1)); //TODO aca deberiamos agregar si es necesario el tipo y nro doc del usuario creador y despues los participantes
			}
			else
				t=null;

			//we close all the connections
			stmt.close();
			rs.close();
			//Return the team vector
		}catch (SQLException ex) {
			ex.printStackTrace();
			//		return null;
		}catch (Exception ex) {
			ex.printStackTrace();
			//		return null;
		}
		return t;
		

	}


	public Vector<Torneo> getTorneosLikeNombre(String nombre){
		Vector<Torneo> torneos = new Vector<Torneo>();
		Torneo t=null;
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

			String query = "SELECT nombre FROM Torneo WHERE nombre LIKE '%"+nombre+"%'";
			ResultSet rs = stmt.executeQuery(query);
	
			while(rs.next()){
				
				t=new Torneo(rs.getString(1)); 
				torneos.addElement(t);
			
			}

			//we close all the connections
			stmt.close();
			rs.close();

			//Return the team vector
			return torneos;
		}catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}

	}
	
	public Vector<Torneo> getTorneosPorDuenio (String nombre, String apellido){
		Vector<Torneo> torneos = new Vector<Torneo>();
		Torneo t=null;
		
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

//			String query = "SELECT t.nombre FROM Torneo t, Usuario u WHERE u.nombre LIKE '%"+nombre+"%'" +
//					"or u.nombre LIKE '%"+apellido+"%'" +
//					"or u.apellido LIKE '%"+nombre+"%'" +
//					"or u.apellido LIKE '%"+apellido+"%'" +
//					"AND t.tipo_doc=u.tipo_doc AND t.nro_doc=u.nro_doc";
			
			String query=
				"SELECT t.nombre " +
				"FROM Torneo t " +
				"INNER JOIN Usuario u " +
				"on (t.tipo_doc = u.tipo_doc AND t.nro_doc=u.nro_doc) " +
				"WHERE u.nombre LIKE '%"+nombre+"%' " +
				"or u.nombre LIKE '%"+apellido+"%' " +
				"or u.apellido LIKE '%"+nombre+"%' " +
				"or u.apellido LIKE '%"+apellido+"%' ";
				
			
			ResultSet rs = stmt.executeQuery(query);

			//we create the new team

			while(rs.next()){
				
				t=new Torneo(rs.getString(1)); 
				torneos.addElement(t);
			
			}

			//we close all the connections
			stmt.close();
			rs.close();

			return torneos;
		}catch (SQLException ex) {
			ex.printStackTrace();
			return null;
		}catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
		
	}
	
	// devuelve el id guardado en la base de un torneo segun el nombre
	public int getIdTorneo(String nombre){
		int id=0;
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

			String query = "SELECT id FROM Torneo WHERE nombre = '"+nombre+"'";
			ResultSet rs = stmt.executeQuery(query);

			if(rs.next())
				id=rs.getInt(1);
			

			//we close all the connections
			stmt.close();
			rs.close();
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return id;
		
	}



}
