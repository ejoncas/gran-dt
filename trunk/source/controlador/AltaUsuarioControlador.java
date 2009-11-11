package controlador;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

import logica.Equipo;
import logica.SistemaGranDT;
import logica.Torneo;
import logica.Usuario;

public class AltaUsuarioControlador {

	// referencia al sistema, logica de negocio
	private final SistemaGranDT logica;

	// para guardar los datos del usuario
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
	private String equipo;
	//private float montoDisponible;
	//private float montoGastado;
	//private Vector<Torneo> torneos;

	// constructor del controlador
	public AltaUsuarioControlador (){
		this.logica = SistemaGranDT.getInstance(); // referencia al sistema
	}

	// validaciones de campos

	// si el campo esta vacio devuelve true, si tiene contenido false
	public boolean isEmpty(String t){
		return t.equals("");
	}
	// devuelve true si es entero, false si no
	public boolean isInteger(String i){
		boolean es;
		int n;
		try {
			n = Integer.parseInt(i);
			es = true;
		} catch(NumberFormatException e) {
			es = false;
		}
		return es;
	}

	////////// verificar q selecciono uno ?
	public boolean sexoOK(String s){
		return false;
	}

	public boolean validarFecha( int d,  int m,  int y){
		System.out.println(d+ " " + m + " " + y);
		try{
			GregorianCalendar gc = new GregorianCalendar();
			gc.setLenient(false);
			gc.set(GregorianCalendar.DATE, d);
			gc.set(GregorianCalendar.MONTH, m-1);
			gc.set(GregorianCalendar.YEAR, y);

			System.out.println(gc.getTime());//possible exception
		}catch(Exception e){
			System.out.println("Exception parsing date");
			e.printStackTrace();
			return false;
		}
		return true;      
	}

	// devuelve true si hay @, sino devuelve false
	public boolean mailOK(String e){
		return e.contains("@");
	}





	// validacion de pasos de alta usuario

	// ventana 1

	public String validarAltaUsuario1(String n, String a, String s, String td, int nd, int dia, int mes, int anio, String h){
		// campos vacios
		if (isEmpty(n)){
			System.out.println("Error en Nombre");
			return "Error en Nombre";
		}
		if (isEmpty(a)){
			System.out.println("Error en Apellido");
			return "Error en Apellido";
		}
		if (isEmpty(s)){
			System.out.println("Error en Sexo");
			return "Error en Sexo";
		}
		if (isEmpty(td)){
			System.out.println("Error en TipoDoc");
			return "Error en TipoDoc";
		}
		if (isEmpty(h)){
			System.out.println("Error en Equipo");
			return "Error en Equipo";
		}
		// especificas
		if (!validarFecha(dia, mes, anio)){
			System.out.println("Error en Fecha");
			return "Error en Fecha";
		}		
		return null;
	}

	public String siguienteAltaUsuario1 (String n, String a, String s, String td, int nd, int dia, int mes, int anio, String h){
		String resultado = validarAltaUsuario1(n, a, s, td, nd, dia, mes, anio, h);
		if (resultado == null){
			this.nombre=n;
			this.apellido=a;
			this.sexo=s;
			this.tipoDoc=td;
			this.nroDoc=nd;
			this.fechaNac= new Date(anio, mes, dia);
			this.hincha=h;
			return null;
		}
		else{
			// mensaje de error, faltan datos
			return resultado;
		}

	}

	// ventana 2

	public String validarAltaUsuario2(String part, String prov, String loc, String c, String num, String piso, String dpto, String cp,
			String tel, String cel, String provCel, String email){
		// campos llenos
		if (isEmpty(part))
			return "Error en partido";
		if (isEmpty(prov))
			return "Error en Provincia";
		if (isEmpty(loc))
			return "Error en Localidad";
		if (isEmpty(c))
			return "Error en Calle";
		if (isEmpty(num))
			return "Error en Numero";
		//if (isEmpty(piso))
		//return false;
		//if (isEmpty(dpto))
		//return false;
		if (isEmpty(tel))
			return "Error en Telefono";
		if (isEmpty(cel))
			return "Error en Celular";
		if (isEmpty(provCel))
			return "Error en Proveedor de Celular";
		// validaciones especificas
		if (!isInteger(num))
			return "Error en Numero (No es Numerico)";
		if (!isEmpty(piso) && !isInteger(piso))
			return "Error en Piso";
		if (!isInteger(tel))
			return "Error en Tel (debe ser numerico)";
		if (!isInteger(cel))
			return "Error en Cel (debe ser numerico)";
		if (!mailOK(email))
			return "Error en Email";		
		return null;
	}

	public String siguienteAltaUsuario2 (String part, String prov, String loc, String c, String num, String piso, String dpto, String cp,
			String tel, String cel, String provCel, String email){
		String r =validarAltaUsuario2(part, prov, loc, c, num, piso, dpto, cp, tel, cel, provCel, email);
		if (r==null){
			this.partido=part;
			this.provincia=prov;
			this.localidad=loc;
			this.calle=c;
			this.numero=Integer.parseInt(num);
			if (isEmpty(piso))
				this.piso=0;
			else
				this.piso=Integer.parseInt(piso);
			if (isEmpty(dpto))
				this.dpto="-";
			else
				this.dpto=dpto;
			this.cp=cp;
			this.tel=Integer.parseInt(tel);
			this.cel=Integer.parseInt(cel);
			this.proveedorCel=provCel;
			this.email=email;
		}
		else
			return r;
		return null;

	}


	// ventana 3

	public String validarAltaUsuario3(String nombequipo, String pass1, String pass2){		
		if (isEmpty(nombequipo))
			return "Error en nombre del equipo";
		if (isEmpty(pass1) || isEmpty(pass2))
			return "Error de contrase–a";
		if (!pass1.equals(pass2))
			return "Las contrase–as deben ser iguales";
		return null;
	}




	public String finalizarAltaUsuario3(String nombequipo, String pass1, String pass2){
		String r = validarAltaUsuario3(nombequipo, pass1, pass2);
		if (r==null){
			this.equipo=nombequipo;
			this.password=pass1;
			Equipo e = new Equipo(this.equipo);
			Usuario u = new Usuario(this.nombre, this.apellido, this.tipoDoc, this.nroDoc, this.fechaNac,this.sexo, 
					this.hincha, this.provincia, this.partido, this.localidad, this.calle, this.numero, this.piso, 
					this.dpto, this.cp, this.tel, this.cel, this.proveedorCel, this.email, this.password, e, 60000000, 0);
			logica.getUsuarios().addElement(u);
			}
		else
			return r;
		
		return null;


	}


}
