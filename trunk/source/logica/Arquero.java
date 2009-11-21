package logica;

import java.sql.Date;

public class Arquero extends Jugador {
	private int golesAtajados;

	public Arquero(String n, String a, String e, int year, int month, int day,
			float p) {
		super(n, a, e, year, month, day, p);
		// TODO Auto-generated constructor stub
		this.golesAtajados=0;
	}

	public Arquero(String string, String string2, String string3, Date date,
			int int1, float float1) {
		super(string, string2, string3, date, int1, float1);
	}

	public int getGolesAtajados() {
		return golesAtajados;
	}

	public void setGolesAtajados(int golesAtajados) {
		this.golesAtajados = golesAtajados;
	}

	@Override
	public String getPosicion() {
		return "ARQ";
	}


}