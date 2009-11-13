package logica;
public class Arquero extends Jugador {
	private int golesAtajados;

	public Arquero(String n, String a, String e, int year, int month, int day,
			float p) {
		super(n, a, e, year, month, day, p);
		// TODO Auto-generated constructor stub
		this.golesAtajados=0;
	}

	public int getGolesAtajados() {
		return golesAtajados;
	}

	public void setGolesAtajados(int golesAtajados) {
		this.golesAtajados = golesAtajados;
	}


}