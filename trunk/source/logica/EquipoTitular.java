package logica;

import java.util.Vector;

public class EquipoTitular {
	private static int CANT_DEF=4;
	private static int CANT_VOL=4;
	private static int CANT_DEL=2;
	private Arquero arquero;
	private Vector<Defensor> defensores;
	private Vector<Volante> volantes;
	private Vector<Delantero> delanteros;

	public EquipoTitular(Arquero arquero, Vector<Defensor> defensores,
			Vector<Volante> volantes, Vector<Delantero> delanteros) {
		super();
		this.arquero = arquero;
		this.defensores = defensores;
		this.defensores.setSize(getCANT_DEF());
		this.volantes = volantes;
		this.volantes.setSize(getCANT_VOL());
		this.delanteros = delanteros;
		this.delanteros.setSize(getCANT_DEL());
	}

	public static int getCANT_DEF() {
		return CANT_DEF;
	}
	public static void setCANT_DEF(int cANTDEF) {
		CANT_DEF = cANTDEF;
	}
	public static int getCANT_VOL() {
		return CANT_VOL;
	}
	public static void setCANT_VOL(int cANTVOL) {
		CANT_VOL = cANTVOL;
	}
	public static int getCANT_DEL() {
		return CANT_DEL;
	}
	public static void setCANT_DEL(int cANTDEL) {
		CANT_DEL = cANTDEL;
	}
	public Arquero getArquero() {
		return arquero;
	}
	public void setArquero(Arquero arquero) {
		this.arquero = arquero;
	}
	public Vector<Defensor> getDefensores() {
		return defensores;
	}
	public void setDefensores(Vector<Defensor> defensores) {
		this.defensores = defensores;
	}
	public Vector<Volante> getVolantes() {
		return volantes;
	}
	public void setVolantes(Vector<Volante> volantes) {
		this.volantes = volantes;
	}
	public Vector<Delantero> getDelanteros() {
		return delanteros;
	}
	public void setDelanteros(Vector<Delantero> delanteros) {
		this.delanteros = delanteros;
	}

	public Vector<Jugador> toVector(){
		Vector<Jugador> aux = new Vector<Jugador>();
		aux.addElement(this.arquero);
		aux.addAll(this.defensores);
		aux.addAll(this.volantes);
		aux.addAll(this.delanteros);
		return aux;
	}




}