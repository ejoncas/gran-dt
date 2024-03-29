package controlador;

import java.util.Date;
import java.util.GregorianCalendar;

import logica.Equipo;
import logica.SistemaGranDT;
import logica.Usuario;
import logica.dao.EquipoDAO;
import logica.dao.UsuarioDAO;

public class AltaUsuarioControlador {

	// referencia al sistema, logica de negocio
	private final SistemaGranDT logica;
	private final UsuarioDAO udao;
	private final EquipoDAO edao;

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
	private String password;
	private String equipo;

	// constructor del controlador
	public AltaUsuarioControlador (){
		this.logica = SistemaGranDT.getInstance(); // referencia al sistema
		this.udao=new UsuarioDAO();
		this.edao=new EquipoDAO();
		System.out.println(this.logica);
	}

	// validaciones de campos

	// devuelve true si es entero, false si no
	public boolean isInteger(String i){
		boolean es;
		try {
			Integer.parseInt(i);
			es = true;
		} catch(NumberFormatException e) {
			es = false;
		}
		return es;
	}

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

	public String validarAltaUsuario1(String n, String a, String s, String td, String nd, int dia, int mes, int anio, String h){
		// campos vacios
		if (n.isEmpty()){
			System.out.println("Error en Nombre");
			return "Error en Nombre";
		}
		if (a.isEmpty()){
			return "Error en Apellido";
		}
		if(!isInteger(nd))
			return "Error en documento. Debe ser numerico";
		if (s.isEmpty()){
			System.out.println("Error en Sexo");
			return "Error en Sexo";
		}
		if (td.isEmpty()){
			System.out.println("Error en TipoDoc");
			return "Error en TipoDoc";
		}
		if (h.isEmpty()){
			System.out.println("Error en Equipo");
			return "Error en Equipo";
		}

		// especificas
		if (!validarFecha(dia, mes, anio)){
			System.out.println("Error en Fecha");
			return "Error en Fecha";
		}
		//TODO Agregar a la validacion que ese DNI no exista
		//TODO para esto falta el UsuarioDAO
		//		if(dniUsuarioOk(td,nd)){
		//			System.out.println("El Documento ingresado ya existe. Verificar");
		//			return "El Documento ingresado ya existe. Verificar";
		//		}
		return null;
	}

	public String siguienteAltaUsuario1 (String n, String a, String s, String td, String nd, int dia, int mes, int anio, String h){
		String resultado = validarAltaUsuario1(n, a, s, td, nd, dia, mes, anio, h);
		if (resultado == null){
			this.nombre=n;
			this.apellido=a;
			this.sexo=s;
			this.tipoDoc=td;
			this.nroDoc=Integer.parseInt(nd);
			//this.fechaNac= new Date(anio, mes, dia);
			this.fechaNac= new Date(anio-1900, mes-1, dia);
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
		if (part.isEmpty())
			return "Error en partido";
		if (prov.isEmpty())
			return "Error en Provincia";
		if (loc.isEmpty())
			return "Error en Localidad";
		if (c.isEmpty())
			return "Error en Calle";
		if (num.isEmpty())
			return "Error en Numero";
		//if (isEmpty(piso))
		//return false;
		//if (isEmpty(dpto))
		//return false;
		if (tel.isEmpty())
			return "Error en Telefono";
		//		if (isEmpty(cel))
		//			return "Error en Celular";
		//		if (isEmpty(provCel))
		//			return "Error en Proveedor de Celular";
		// validaciones especificas
		if (!isInteger(num))
			return "Error en Numero (No es Numerico)";
		if (!piso.isEmpty() && !isInteger(piso))
			return "Error en Piso";
		if (!isInteger(tel))
			return "Error en Tel (debe ser numerico)";
		if (!cel.isEmpty() && !isInteger(cel))
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
			if (piso.isEmpty())
				this.piso=0;
			else
				this.piso=Integer.parseInt(piso);
			if (dpto.isEmpty())
				this.dpto="-";
			else
				this.dpto=dpto;
			this.cp=cp;
			this.tel=Integer.parseInt(tel);
			try{
				this.cel=Integer.parseInt(cel);
			}catch(Exception e){
				this.cel=0;
			}
			this.proveedorCel=provCel;
			this.email=email;
		}
		else
			return r;
		return null;

	}


	// ventana 3

	public String validarAltaUsuario3(String nombequipo, String pass1, String pass2, String hasho, String hashe){
		if (nombequipo.isEmpty())
			return "Error en nombre del equipo";
		if (pass1.isEmpty() || pass2.isEmpty())
			return "Error de contrasena";
		if (!pass1.equals(pass2))
			return "Las contrasenas deben ser iguales";
		if(!hasho.equals(hashe))
			return "El captcha no es correcto. Intente nuevamente";
		if(this.logica.getEdao().getEquipoPorNombre(nombequipo)!=null)
			return "El nombre de equipo ingresado ya existe. Intente cambiando el nombre";
		return null;
	}




	public String finalizarAltaUsuario3(String nombequipo, String pass1, String pass2, String hasho, String hashe){
		String r = validarAltaUsuario3(nombequipo, pass1, pass2, hasho, hashe);
		if (r==null){
			//si esta todo OK creamos el usuario
			this.equipo=nombequipo;
			this.password=pass1;
			Equipo e = new Equipo(this.equipo);
			Usuario u = new Usuario(this.nombre, this.apellido, this.tipoDoc, this.nroDoc, this.fechaNac,this.sexo,this.hincha, this.provincia, this.partido, this.localidad, this.calle, this.numero, this.piso,this.dpto, this.cp, this.tel, this.cel, this.proveedorCel, this.email, this.password, e, 60000000, 0);
			logica.getUsuarios().addElement(u);
			//			System.out.println("LISTANDO TODOS LOS USUARIOS");
			//			logica.listarUsuarios();
			//			System.out.println("LISTANDO TODOS LOS EQUIPOS");
			//			logica.listarEquipos();

			// guardar en la BD
			System.out.println("Datos del usuario recien creado: \n" + u.toString());
			edao.insertEquipo(e);
			System.out.println(e.getId());
			udao.guardarUsuario(u, e.getId());

			//udao.guardarUsuario(u, e.getId());
		}
		return r;
	}


}
