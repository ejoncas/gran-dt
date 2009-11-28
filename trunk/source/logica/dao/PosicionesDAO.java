package logica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import logica.Torneo;
import logica.Usuario;

public class PosicionesDAO {

	// manejo de la conexion
	private final DAOConnectionManager DAOCM = DAOConnectionManager.getDAOConectionManager();
	
	public void postularTorneo(int idTorneo, int idEquipo){		
		PreparedStatement stmt = null;
		
		try{
			
			//conexion a la bd
			Connection connection = DAOCM.getConnection();

			// insercion del torneo
			String query = "INSERT INTO Posiciones (torneo_fk, equipo_fk, puntaje, participa) VALUES (?,?,?,?)";
			
			stmt = connection.prepareStatement(query);
			stmt.setInt(1,idTorneo);
			stmt.setInt(2, idEquipo);
			stmt.setInt(3, 0);
			stmt.setInt(4, 0);
			stmt.execute();
			
			// cerrar
			connection.close();
			stmt.close();


		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void agregarParticipante(int idTorneo, int idEquipo){
				
		Statement stmt = null;
		
		try{
			
			//conexion a la bd
			Connection connection = DAOCM.getConnection();

			// insercion del torneo
			String query = "UPDATE Posiciones set participa = 1 where torneo_fk = "+idTorneo
			+" and equipo_fk = "+idEquipo;
			
			stmt = connection.createStatement();
			stmt.execute(query);
			
			// cerrar
			connection.close();
			stmt.close();


		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	public Vector<String> obtenerPostulados(int idTorneo){
		Vector<String> postulados = new Vector<String>();
		String nombre = null;
		
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

			String query = 			
			"select e.nombre " +
			"from posiciones p inner join equipo e on  e.id=p.equipo_fk inner join torneo t on t.id = p.torneo_fk " +
			"where participa=0" +
			"and t.id = "+idTorneo;
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()){
				nombre=rs.getString(1);
				postulados.addElement(nombre);
			}
			stmt.close();
			rs.close();
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return postulados;
		
	}
	
	public Vector<String> obtenerParticipantes(int idTorneo){
		
		Vector<String> participantes = new Vector<String>();
		String nombre = null;
		
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

			String query = 			
			"select e.nombre " +
			"from posiciones p inner join equipo e on  e.id=p.equipo_fk inner join torneo t on t.id = p.torneo_fk " +
			"where participa=1" +
			"and t.id = "+idTorneo;
			ResultSet rs = stmt.executeQuery(query);

			while(rs.next()){
				nombre=rs.getString(1);
				participantes.addElement(nombre);
			}
			stmt.close();
			rs.close();
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return participantes;
		
	}

	public void quitarPostulado(int idTorneo, int idEquipo) {
		try{
			Connection connection = DAOCM.getConnection();
			Statement stmt = connection.createStatement();

			String query = 
				"delete from posiciones where torneo_fk="+idTorneo+" and equipo_fk="+idEquipo;
			stmt.execute(query);
			stmt.close();
			
		}catch (SQLException ex) {
			ex.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
