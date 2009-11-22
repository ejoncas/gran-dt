package logica;

import java.sql.Date;

public class Delantero extends Jugador {
	private int golesConvertidos;

	public Delantero(int id, String n, String a, String e, int year, int month,
			int day, float p) {
		super(id,n, a, e, year, month, day, p);
		this.golesConvertidos = 0;
	}

	public Delantero( String n, String a, String e, int year, int month,
			int day, float p) {
		super(n, a, e, year, month, day, p);

		this.golesConvertidos = 0;
	}

	public Delantero(int id, String string, String string2, String string3, Date date,
			int int1, float float1) {
		super(id, string, string2, string3, date, int1, float1);
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