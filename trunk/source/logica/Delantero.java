package logica;

import java.sql.Date;

public class Delantero extends Jugador {
	private int golesConvertidos;

	public Delantero(String n, String a, String e, int year, int month,
			int day, float p) {
		super(n, a, e, year, month, day, p);

		// TODO Auto-generated constructor stub
		this.golesConvertidos = 0;
	}

	public Delantero(String string, String string2, String string3, Date date,
			int int1, float float1) {
		super(string, string2, string3, date, int1, float1);
	}

	public int getGolesConvertidos() {
		return golesConvertidos;
	}

	public void setGolesConvertidos(int golesConvertidos) {
		this.golesConvertidos = golesConvertidos;
	}

	@Override
	public String getPosicion() {
		return "DEL";
	}



}