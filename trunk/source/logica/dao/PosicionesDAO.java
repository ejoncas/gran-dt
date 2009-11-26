package logica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logica.Torneo;

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


}
