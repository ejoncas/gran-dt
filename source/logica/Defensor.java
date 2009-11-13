package logica;
public class Defensor extends Jugador {

	private int golesBloqueados;

	public Defensor(String n, String a, String e, int year, int month, int day,
			float p) {
		super(n, a, e, year, month, day, p);
		// TODO Auto-generated constructor stub
		this.golesBloqueados=0;
	}

	public int getGolesBloqueados() {
		return golesBloqueados;
	}

	public void setGolesBloqueados(int golesBloqueados) {
		this.golesBloqueados = golesBloqueados;
	}


}