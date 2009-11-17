package logica.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logica.Jugador;
import logica.Usuario;

public class UsuarioDAO {
	
	private final DAOConnectionManager DAOCM = DAOConnectionManager.getDAOConectionManager();
	
	
	// metodos
	
	public void guardarUsuario(Usuario u){
		try{
			//connect to db
			Connection connection = DAOCM.getConnection();

			String query = "INSERT INTO Usuarios (tipo_doc,nro_doc,password,nacimiento,nombre," +
					"apellido,sexo,equipo_hincha,monto,monto_gastado,equipo_fk) " +
					"VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, u.getTipoDoc());
			stmt.setInt(2, u.getNroDoc());
			stmt.setString(3, u.getPassword());
			stmt.setDate(4,(Date) u.getFechaNac());
			stmt.setString(5, u.getNombre());
			stmt.setString(6, u.getApellido());
			stmt.setString(7, u.getSexo());
			stmt.setString(8, u.getHincha());
			stmt.setFloat(9, u.getMontoDisponible());  // ver
			stmt.setFloat(10, u.getMontoGastado());
			stmt.setInt(11, u.getEquipo().getId());
				
			stmt.execute();

			//ResultSet rs = stmt.executeQuery(query);

			//we move to the first row - ResultSet starts "before first"
//			rs.next();
//
//			
//
//			// cerrar
//			connection.close();
//			stmt.close();
//			rs.close();


		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return null;
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//return null;
		}
	}


}
