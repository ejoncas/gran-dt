package logica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import logica.Arquero;
import logica.Defensor;
import logica.Delantero;
import logica.Equipo;
import logica.EquipoSuplente;
import logica.EquipoTitular;
import logica.Jugador;
import logica.Usuario;
import logica.Volante;

public class EquipoJugadorDAO {

	private DAOConnectionManager DAOCM = DAOConnectionManager
	.getDAOConectionManager();

	public void insertEquipoJugador(Equipo e, Jugador j, boolean titular) {
		try {
			int titular_bit = titular ? 1 : 0;
			Connection connection = DAOCM.getConnection();
			String query = "INSERT INTO EquipoJugador (equipo_fk, jugador_fk, titular) VALUES (?,?,?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, e.getId());
			stmt.setInt(2, j.getId());
			stmt.setInt(3, titular_bit);

			// Guardamos el equipo-jugador
			stmt.execute();

			stmt.close();

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

	public int[] getEquipoIDS(Usuario u, boolean titular) {
		// lo cargamos con 11 ids invalidos
		int[] ids = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		try {
			Connection connection = DAOCM.getConnection();

			// reutilizamos esta funcion, tanto para jugadores titulares como
			// para suplentes
			int titular_bit = titular ? 1 : 0;


			String query = "SELECT ej.jugador_fk as idjugador "
				+ "FROM Equipo e " + "INNER JOIN EquipoJugador ej "
				+ "ON e.id = ej.equipo_fk " + "INNER JOIN Usuario u "
				+ "ON u.equipo_fk = e.id " + "WHERE u.nro_doc = "
				+ u.getNroDoc() + " " + "AND u.tipo_doc = '"
				+ u.getTipoDoc() + "' " + "AND ej.titular = " + titular_bit
				+ " ;";

			Statement stmt2 = connection.createStatement();

			ResultSet rs = stmt2.executeQuery(query);

			int i = 0;
			while (rs.next()) {
				ids[i] = rs.getInt("idjugador");
				i++;
			}


			stmt2.close();
			rs.close();
			return ids;

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return null;

	}

	// le pasamos todos los jugadores, para que de esta manera
	// los busque por el id y duplique una referencia, y no que cree Jugadores
	// nuevos, que en si son el mismo
	public EquipoTitular getEquipoTitular(Usuario u) {
		EquipoTitular et = new EquipoTitular();
		try {
			Connection connection = DAOCM.getConnection();
			// este query levanta los 11 jugadores del equipo del usuario que
			// tiene ese tipoDoc y nroDoc
			String query = "SELECT j.id, j.nombre, j.apellido, j.equipo, j.nacimiento, j.puntaje, j.precio, j.posicion "
				+ "FROM Equipo e "
				+ "INNER JOIN EquipoJugador ej "
				+ "ON e.id = ej.equipo_fk "
				+ "INNER JOIN Usuario u "
				+ "ON u.equipo_fk = e.id "
				+ "INNER JOIN Jugador j "
				+ "ON j.id = ej.jugador_fk "
				+ "WHERE u.nro_doc = "
				+ u.getNroDoc()
				+ " "
				+ "AND u.tipo_doc = '"
				+ u.getTipoDoc() + "';";

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery(query);

			Jugador j = null;
			while (rs.next()) {
				if (rs.getString("posicion").equals("ARQ")) {
					j = new Arquero(rs.getInt("id"), rs.getString("nombre"), rs
							.getString("apellido"), rs.getString("equipo"), rs
							.getDate("nacimiento").getYear(), rs.getDate(
							"nacimiento").getMonth(), rs.getDate("nacimiento")
							.getDate(), rs.getFloat("precio"));
					j.setPuntaje(rs.getInt("puntaje"));
					et.addArquero((Arquero) j);
				} else if (rs.getString("posicion").equals("DEL")) {
					j = new Delantero(rs.getInt("id"), rs.getString("nombre"),
							rs.getString("apellido"), rs.getString("equipo"),
							rs.getDate("nacimiento").getYear(), rs.getDate(
							"nacimiento").getMonth(), rs.getDate(
							"nacimiento").getDate(), rs
							.getFloat("precio"));
					j.setPuntaje(rs.getInt("puntaje"));
					et.addDelantero((Delantero) j);
				} else if (rs.getString("posicion").equals("DEF")) {
					j = new Defensor(rs.getInt("id"), rs.getString("nombre"),
							rs.getString("apellido"), rs.getString("equipo"),
							rs.getDate("nacimiento").getYear(), rs.getDate(
							"nacimiento").getMonth(), rs.getDate(
							"nacimiento").getDate(), rs
							.getFloat("precio"));
					j.setPuntaje(rs.getInt("puntaje"));
					et.addDefensor((Defensor) j);
				} else if (rs.getString("posicion").equals("VOL")) {
					j = new Volante(rs.getInt("id"), rs.getString("nombre"), rs
							.getString("apellido"), rs.getString("equipo"), rs
							.getDate("nacimiento").getYear(), rs.getDate(
							"nacimiento").getMonth(), rs.getDate("nacimiento")
							.getDate(), rs.getFloat("precio"));
					j.setPuntaje(rs.getInt("puntaje"));
					et.addVolante((Volante) j);
				}
			}

			return et;

		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return null;
	}

	public EquipoSuplente getEquipoSuplente(Usuario u) {
		EquipoSuplente es = null;

		return es;
	}

	//borra todos los registros de la table EquipoJugador para un cierto equipo (titular o suplente, depende el bit)
	public void deleteEquipo(Equipo e, boolean titulares) {
		try {
			Connection connection = DAOCM.getConnection();

			// reutilizamos esta funcion, tanto para jugadores titulares como
			// para suplentes
			int titular_bit = titulares ? 1 : 0;


			String team_killer = "DELETE FROM EquipoJugador " +
			"WHERE equipo_fk = "+ e.getId() + " " +
			"AND titular = "+titular_bit+" ;";

			Statement stmt = connection.createStatement();

			stmt.execute(team_killer);

			stmt.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
