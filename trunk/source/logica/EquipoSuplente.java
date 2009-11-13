package logica;

import java.util.Vector;

public class EquipoSuplente {
	private static int CANT_DEL=2;
	private Arquero arquero;
	private Defensor defensor;
	private Volante volante;
	private Vector<Delantero> delanteros;

	public Arquero getArquero() {
		return arquero;
	}
	public void setArquero(Arquero arquero) {
		this.arquero = arquero;
	}
	public Defensor getDefensor() {
		return defensor;
	}
	public void setDefensor(Defensor defensor) {
		this.defensor = defensor;
	}
	public Volante getVolante() {
		return volante;
	}
	public void setVolante(Volante volante) {
		this.volante = volante;
	}

	public Vector<Delantero> getDelanteros() {
		return delanteros;
	}
	public void setDelanteros(Vector<Delantero> delanteros) {
		this.delanteros = delanteros;
	}

	public EquipoSuplente(Arquero arquero, Defensor defensor, Volante volante,
			Vector<Delantero> delanteros) {
		super();
		this.arquero = arquero;
		this.defensor = defensor;
		this.volante = volante;
		this.delanteros = delanteros;
	}


	public EquipoSuplente(Jugador ja,Jugador jdf, Jugador jv, Jugador jd1,Jugador jd2) {
		super();
		this.arquero = (Arquero) ja;
		this.defensor = (Defensor) jdf;
		this.volante = (Volante) jv;
		this.delanteros.setSize(EquipoSuplente.getCANT_DEL());
		this.delanteros.addElement((Delantero)jd1);
		this.delanteros.addElement((Delantero)jd2);
	}

	//recibiendo los parametros casteados
	public EquipoSuplente(Arquero ja,Defensor jdf, Volante jv, Delantero jd1,Delantero jd2) {
		super();
		this.arquero = ja;
		this.defensor = jdf;
		this.volante = jv;
		//fixed size vector
		this.delanteros = new Vector<Delantero>();
		this.delanteros.setSize(EquipoSuplente.getCANT_DEL());
		this.delanteros.addElement(jd1);
		this.delanteros.addElement(jd2);
	}

	public static void setCANT_DEL(int cANT_DEL) {
		CANT_DEL = cANT_DEL;
	}
	public static int getCANT_DEL() {
		return CANT_DEL;
	}

}