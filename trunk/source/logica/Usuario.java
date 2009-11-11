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
	private String password;
	private Equipo equipo;
	private float montoDisponible;
	private float montoGastado;
	private Vector<Torneo> torneos;
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getTipoDoc() {
		return tipoDoc;
	}
	public int getNroDoc() {
		return nroDoc;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public String getSexo() {
		return sexo;
	}
	public String getHincha() {
		return hincha;
	}
	public String getProvincia() {
		return provincia;
	}
	public String getPartido() {
		return partido;
	}
	public String getLocalidad() {
		return localidad;
	}
	public String getCalle() {
		return calle;
	}
	public int getNumero() {
		return numero;
	}
	public int getPiso() {
		return piso;
	}
	public String getDpto() {
		return dpto;
	}
	public String getCp() {
		return cp;
	}
	public int getTel() {
		return tel;
	}
	public int getCel() {
		return cel;
	}
	public String getProveedorCel() {
		return proveedorCel;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public float getMontoDisponible() {
		return montoDisponible;
	}
	public float getMontoGastado() {
		return montoGastado;
	}
	public Vector<Torneo> getTorneos() {
		return torneos;
	}
	
	// constructor
	/*public Usuario(String nombre, String apellido, String tipoDoc, int nroDoc,
			Date fechaNac, String sexo, String hincha, String provincia,
			String partido, String localidad, String calle, int numero,
			int piso, String dpto, String cp, int tel, int cel,
			String proveedorCel, String email, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.hincha = hincha;
		this.provincia = provincia;
		this.partido = partido;
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.dpto = dpto;
		this.cp = cp;
		this.tel = tel;
		this.cel = cel;
		this.proveedorCel = proveedorCel;
		this.email = email;
		this.password = password;
	}*/
	public Usuario(String nombre, String apellido, String tipoDoc, int nroDoc,
			Date fechaNac, String sexo, String hincha, String provincia,
			String partido, String localidad, String calle, int numero,
			int piso, String dpto, String cp, int tel, int cel,
			String proveedorCel, String email,
			String password, Equipo equipo, float montoDisponible,
			float montoGastado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDoc = tipoDoc;
		this.nroDoc = nroDoc;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.hincha = hincha;
		this.provincia = provincia;
		this.partido = partido;
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.dpto = dpto;
		this.cp = cp;
		this.tel = tel;
		this.cel = cel;
		this.proveedorCel = proveedorCel;
		this.email = email;
		this.password = password;
		this.equipo = equipo;
		this.montoDisponible = montoDisponible;
		this.montoGastado = montoGastado;
	}

	

	}