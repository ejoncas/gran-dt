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
		this.volantes = volantes;
		this.delanteros = delanteros;
	}

	public EquipoTitular(){
		super();
		this.arquero = null;
		this.defensores = new Vector<Defensor>();
		this.volantes = new Vector<Volante>();
		this.delanteros = new Vector<Delantero>();
	}

	public void addDelantero(Delantero d){
		this.delanteros.addElement(d);
	}

	public void addDefensor(Defensor d){
		this.defensores.addElement(d);
	}

	public void addVolante(Volante v){
		this.volantes.addElement(v);
	}

	public void addArquero(Arquero arquero) {
		this.arquero = arquero;
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
		if(this.arquero!=null)
			aux.addElement(this.arquero);
		if(!this.defensores.isEmpty())
			aux.addAll(this.defensores);
		if(!this.volantes.isEmpty())
			aux.addAll(this.volantes);
		if(!this.delanteros.isEmpty())
			aux.addAll(this.delanteros);

		return aux;
	}




}