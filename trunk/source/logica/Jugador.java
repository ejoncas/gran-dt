package logica;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Jugador {
	private final String nombre;
	private final String equipo;
	private final String apellido;
	private final Date fechaNac;
	private final int puntaje;
	private final float precio;


	public Jugador(String n, String a, String e, int year, int month, int day, float p){
		this.nombre=n;
		this.equipo=e;
		this.apellido=a;
		this.fechaNac=new GregorianCalendar(year,month,day).getTime();
		this.precio=p;
		this.puntaje=0;		
	}

	public Jugador(String n, String a, String e, Date f,int pj, float p){
		this.nombre=n;
		this.equipo=e;
		this.apellido=a;
		this.fechaNac=f;
		this.precio=p;
		this.puntaje=0;		
	}


	public long getEdad() {
		/** Today's date */
		Date now = new Date();
		/**Datediff in java? get lost**/
		return now.compareTo(this.fechaNac) > 0 ? ((now.getTime() - this.fechaNac.getTime()) / (1000 * 60 * 60 * 24))/365 : 0;
	}

	@Override
	public String toString(){
		return 	"Nombre: "+this.nombre+
		"\nApellido: "+this.apellido+
		"\nEquipo: "+this.equipo+
		"\nFecha Nacimiento: "+this.fechaNac.toString()+
		"\nPuntaje: "+this.puntaje+
		"\nPrecio: "+this.precio+"\n";
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public String getApellido() {
		return apellido;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public String getFechaNacSQLString(){
		Format formatter = new SimpleDateFormat("yyyyMMdd");
		System.out.println(formatter.format(this.fechaNac));
		return formatter.format(this.fechaNac);
	}

	public int getPuntaje() {
		return puntaje;
	}

	public float getPrecio() {
		return precio;
	}

}