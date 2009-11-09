package logica;
import java.util.Date;
import java.util.Vector;

public class Usuario {
	private String nombre;
	private String apellido;
	private String tipoDoc;
	private int nroDoc;
	private Date fechaNac;
	private String sexo;
	private String hincha;
	private String provincia;
	private String partido;
	private String localidad;
	private String calle;
	private int numero;
	private int piso;
	private String dpto;
	private String cp;
	private int tel;
	private int cel;
	private String proveedorCel;
	private String email;
	private String username;
	private String password;
	private Equipo equipo;
	private float montoDisponible;
	private float montoGastado;
	private Vector<Torneo> torneos;


	public void update() {
		throw new UnsupportedOperationException();
	}

	public void getDNI() {
		throw new UnsupportedOperationException();
	}

	public void operation() {
		throw new UnsupportedOperationException();
	}
}