package logica;
import java.util.Date;
import java.util.Vector;

public class Usuario {
	private final String nombre;
	private final String apellido;
	private final String tipoDoc;
	private final int nroDoc;
	private final Date fechaNac;
	private final String sexo;
	private final String hincha;
	private final String provincia;
	private final String partido;
	private final String localidad;
	private final String calle;
	private final int numero;
	private final int piso;
	private final String dpto;
	private final String cp;
	private final int tel;
	private final int cel;
	private final String proveedorCel;
	private final String email;
	private final String password;
	private final Equipo equipo;
	private final float montoDisponible;
	private final float montoGastado;
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

	@Override
	public String toString(){
		return "\nDocumento"+this.tipoDoc+":"+this.nroDoc+
		"\nNombre:"+this.nombre + 
		"\nApellido:"+this.apellido;
	}



	//	public Usuario(String nombre, String apellido, String tipoDoc, int nroDoc,
	//			Date fechaNac, String sexo, String hincha, String provincia,
	//			String partido, String localidad, String calle, int numero,
	//			int piso, String dpto, String cp, int tel, int cel,
	//			String proveedorCel, String email, String password) {
	//		super();
	//		this.nombre = nombre;
	//		this.apellido = apellido;
	//		this.tipoDoc = tipoDoc;
	//		this.nroDoc = nroDoc;
	//		this.fechaNac = fechaNac;
	//		this.sexo = sexo;
	//		this.hincha = hincha;
	//		this.provincia = provincia;
	//		this.partido = partido;
	//		this.localidad = localidad;
	//		this.calle = calle;
	//		this.numero = numero;
	//		this.piso = piso;
	//		this.dpto = dpto;
	//		this.cp = cp;
	//		this.tel = tel;
	//		this.cel = cel;
	//		this.proveedorCel = proveedorCel;
	//		this.email = email;
	//		this.password = password;
	//	}
	//	

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

	public Usuario(String nombre, String apellido, String tipoDoc, int nroDoc,
			Date fechaNac, String sexo, String hincha, String provincia,
			String partido, String localidad, String calle, int numero,
			int piso, String dpto, String cp, int tel, int cel,
			String proveedorCel, String email,
			String password) {
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
		this.montoDisponible=0;
		this.montoGastado=0;
		this.equipo=null;
	}
	public Usuario (String tipo, int nro, String pass) {
		this.tipoDoc=tipo;
		this.nroDoc=nro;
		this.password=pass;
		
		//en blanco		
		this.nombre = null;
		this.apellido = null;
		this.fechaNac = null;
		this.sexo = null;
		this.hincha = null;
		this.provincia = null;
		this.partido = null;
		this.localidad = null;
		this.calle = null;
		this.numero = 0;
		this.piso = 0;
		this.dpto = null;
		this.cp = null;
		this.tel=0;
		this.cel=0;
		this.proveedorCel = null;
		this.email = null;
		this.montoDisponible=0;
		this.montoGastado=0;
		this.equipo=null;
		
}


}