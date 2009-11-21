package logica;

import java.sql.Date;

public class Volante extends Jugador {

	//TODO, add some unique value from Volante. If it does not have. it does not make sense
	public Volante(String n, String a, String e, int year, int month, int day,
			float p) {
		super(n, a, e, year, month, day, p);

	}

	public Volante(String string, String string2, String string3, Date date,
			int int1, float float1) {
		super(string, string2, string3, date, int1, float1);
	}

	@Override
	public String getPosicion() {
		return "VOL";
	}
}