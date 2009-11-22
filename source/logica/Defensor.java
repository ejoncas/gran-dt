package logica;

import java.sql.Date;

public class Defensor extends Jugador {

	private int golesBloqueados;

	public Defensor(int id, String n, String a, String e, int year, int month, int day,
			float p) {
		super(id,n, a, e, year, month, day, p);
		// TODO Auto-generated constructor stub
		this.golesBloqueados=0;
	}

	public Defensor(String n, String a, String e, int year, int month, int day,
			float p) {
		super(n, a, e, year, month, day, p);
		// TODO Auto-generated constructor stub
		this.golesBloqueados=0;
	}

	public Defensor(int id,String string, String string2, String string3, Date date,
			int int1, float float1) {
		super(id,string, string2, string3, date, int1, float1);
	}

	public int getGolesBloqueados() {
		return golesBloqueados;
	}

	public void setGolesBloqueados(int golesBloqueados) {
		this.golesBloqueados = golesBloqueados;
	}

	@Override
	public String getPosicion() {
		// TODO Auto-generated method stub
		return "DEF";
	}


}