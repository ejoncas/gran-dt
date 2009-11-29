package logica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import logica.Torneo;

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
			rs2.close();
			stmt.close();
			DAOCM.closeConnection();;

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
			rs.close();
			stmt.close();
			DAOCM.closeConnection();;
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
			rs.close();
			stmt.close();
			DAOCM.closeConnection();;

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
			rs.close();
			stmt.close();
			DAOCM.closeConnection();;


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
			rs.close();
			stmt.close();
			DAOCM.closeConnection();;

		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return id;

	}

	public Vector<Torneo> getTorneosCreados(String tipoDoc, int nroDoc){
		Vector<Torneo> torneos = new Vector<Torneo>();
		Torneo t=null;		
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();
			String query=
				"SELECT t.nombre " +
				"FROM Torneo t " +
				"WHERE t.nro_doc = "+nroDoc+
				" and t.tipo_doc = '"+tipoDoc+"'";			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){				
				t=new Torneo(rs.getString(1)); 
				torneos.addElement(t);			
			}

			rs.close();
			stmt.close();
			DAOCM.closeConnection();;
			return torneos;
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return torneos;



	}

	public Vector<Torneo> getAllTorneos() {
		Vector<Torneo> torneos = new Vector<Torneo>();
		Torneo t=null;		
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();
			String query=
				"SELECT t.nombre " +
				"FROM Torneo t ";			
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){				
				t=new Torneo(rs.getString(1));
				torneos.addElement(t);
			}
			rs.close();
			stmt.close();
			DAOCM.closeConnection();;

			return torneos;
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return torneos;
	}

	public Vector<Torneo> getTorneosPorParticipante(String tipoDoc, int nroDoc) {
		Vector<Torneo> torneos = new Vector<Torneo>();
		Torneo t=null;		
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();
			String query=
				"SELECT t.nombre " +
				"FROM Torneo t " +
				"INNER JOIN Posiciones p " +
				"ON p.torneo_fk = t.id  " +
				"INNER JOIN Usuario u " +
				"ON u.equipo_fk = p.equipo_fk " +
				"WHERE u.tipo_doc like '"+tipoDoc+"' " +
				"AND u.nro_doc = "+nroDoc+" " + 
				"AND p.participa = 1";

			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){				
				t=new Torneo(rs.getString(1)); 
				torneos.addElement(t);			
			}

			rs.close();
			stmt.close();
			DAOCM.closeConnection();;
			return torneos;
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return torneos;

	}
	
	
	public boolean isCreador(String tipoDoc, int nroDoc, int idTorneo){
		boolean es = false;
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

			String query = 
				"select * " +
				"from torneo " +
				"where id = " +idTorneo+
				" and nro_doc = " +nroDoc+
				" and tipo_doc = '"+tipoDoc+"'";

			ResultSet rs = stmt.executeQuery(query);

			if(rs.next())
				es= true;
			else
				es= false;
			
			stmt.close();	
			rs.close();
			DAOCM.closeConnection();
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}	
		return es;
	}



}
