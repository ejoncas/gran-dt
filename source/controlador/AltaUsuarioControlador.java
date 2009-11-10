package controlador;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import logica.Equipo;
import logica.SistemaGranDT;
import logica.Torneo;
import logica.Usuario;

public class AltaUsuarioControlador {
	
	// referencia al sistema, logica de negocio
	private SistemaGranDT logica;
	
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
	private Equipo equipo;
	private float montoDisponible;
	private float montoGastado;
	private Vector<Torneo> torneos;

	// constructor del controlador
	public AltaUsuarioControlador (SistemaGranDT sist){
		this.logica = sist; // referencia al sistema
		
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
        try{
            GregorianCalendar gc = new GregorianCalendar();
            gc.setLenient(false);
            gc.set(GregorianCalendar.DATE, d);
            gc.set(GregorianCalendar.MONTH, m-1);
            gc.set(GregorianCalendar.YEAR, y);

        }catch(Exception e){
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
	
	// devuelve true si todos los datos estan, si falta alguno devuelve false
	public boolean validarAltaUsuario1(String n, String a, String s, String td, int nd, int dia, int mes, int anio, String h){
		// campos vacios
		if (isEmpty(n))
			return false;
		if (isEmpty(a))
			return false;
		if (isEmpty(s))
			return false;
		if (isEmpty(td))
			return false;
		if (isEmpty(h))
			return false;
		// especificas
		if (validarFecha(dia, mes, anio))
			return false;		
		return true;
		
	}
	
	public void siguienteAltaUsuario1 (String n, String a, String s, String td, int nd, int dia, int mes, int anio, String h){
		if (validarAltaUsuario1(n, a, s, td, nd, dia, mes, anio, h)){
			this.nombre=n;
			this.apellido=a;
			this.sexo=s;
			this.tipoDoc=td;
			this.nroDoc=nd;
			this.fechaNac= new Date(anio, mes, dia);
			this.hincha=h;
		}
		else{
			// mensaje de error, faltan datos
		}
		
	}
	
	// ventana 2
	
	public boolean validarAltaUsuario2(String part, String prov, String loc, String c, String num, String piso, String dpto, String cp,
			String tel, String cel, String provCel, String email){
		// campos llenos
		if (isEmpty(part))
			return false;
		if (isEmpty(prov))
			return false;
		if (isEmpty(loc))
			return false;
		if (isEmpty(c))
			return false;
		if (isEmpty(num))
			return false;
		//if (isEmpty(piso))
			//return false;
		//if (isEmpty(dpto))
			//return false;
		if (isEmpty(tel))
			return false;
		if (isEmpty(cel))
			return false;
		if (isEmpty(provCel))
			return false;
		if (isEmpty(email))
			return false;
		// validaciones especificas
		if (!isInteger(num))
			return false;
		if (!isEmpty(piso) && !isInteger(piso))
			return false;
		if (!isInteger(tel))
			return false;
		if (!isInteger(cel))
			return false;
		if (!mailOK(email))
			return false;		
		
		return true;
	}
	
	public void siguienteAltaUsuario2 (String part, String prov, String loc, String c, String num, String piso, String dpto, String cp,
			String tel, String cel, String provCel, String email){
		if (validarAltaUsuario2(part, prov, loc, c, num, piso, dpto, cp, tel, cel, provCel, email)){
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
		
	}
	
	
	// ventana 3
	
	public boolean validarAltaUsuario3(/*parametros de la ventana*/){
		
		// validaciones
		
		return true;
	}
	
	
	
	
	public void finalizarAltaUsuario3(/*parametros de la ventana*/){
		
		//obtener los datos (guardar en los atributos del controlador)
		
		
	}
	

}
