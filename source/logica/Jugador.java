package logica;
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

	public Jugador(String n, String a, String e, Date f, float p){
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
		return now.compareTo(this.fechaNac) > 0 ? ((now.getTime() - this.fechaNac.getTime()) / (1000 * 60 * 60 * 24))/365 : null;
	}

	@Override
	public String toString(){
		return 	"Nombre: "+this.nombre+
		"\nApellido: "+this.apellido+
		"\nEquipo: "+this.equipo+
		"\nFecha Nacimiento: "+this.fechaNac.toString()+
		"\nPuntaje: "+this.puntaje+
		"\nPrecio: "+this.precio;
	}

}