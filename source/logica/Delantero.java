package logica;
public class Delantero extends Jugador {
	private int golesConvertidos;

	public Delantero(String n, String a, String e, int year, int month,
			int day, float p) {
		super(n, a, e, year, month, day, p);
		super.setPosicion("DEL");
		// TODO Auto-generated constructor stub
		this.golesConvertidos = 0;
	}

	public int getGolesConvertidos() {
		return golesConvertidos;
	}

	public void setGolesConvertidos(int golesConvertidos) {
		this.golesConvertidos = golesConvertidos;
	}



}