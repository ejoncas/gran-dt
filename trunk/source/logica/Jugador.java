package logica;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Jugador {
	private int id;
	private String nombre;
	private String equipo;
	private String apellido;
	private Date fechaNac;
	private int puntaje;
	private float precio;




	public Jugador(int id, String n, String a, String e, int year, int month, int day, float p){
		this.id = id;
		this.nombre=n;
		this.equipo=e;
		this.apellido=a;
		this.fechaNac=new GregorianCalendar(year,month-1,day).getTime();
		this.precio=p;
		this.puntaje=0;		
	}

	//este constructor se deberia usar solo desde la carga masiva ya que no tiene el id
	public Jugador( String n, String a, String e, int year, int month, int day, float p){
		this.nombre=n;
		this.equipo=e;
		this.apellido=a;
		this.fechaNac=new GregorianCalendar(year,month-1,day).getTime();
		this.precio=p;
		this.puntaje=0;		
	}

	public Jugador(int id,String n, String a, String e, Date f,int pj, float p){
		this.id = id;
		this.nombre=n;
		this.equipo=e;
		this.apellido=a;
		this.fechaNac=f;
		this.precio=p;
		this.puntaje=pj;		
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
		return formatter.format(this.fechaNac.getTime());
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int f){
		this.puntaje = f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public String getPosicion() {
		return "N/A";
	}

}