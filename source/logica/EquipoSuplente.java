package logica;
public class EquipoSuplente {
	private static int CANT_DEL;
	private Arquero arquero;
	private Defensor[] defensor;
	private Volante volante;
	private Delantero[] delanteros;
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
	public Delantero[] getDelanteros() {
		return delanteros;
	}
	public void setDelanteros(Delantero[] delanteros) {
		this.delanteros = delanteros;
	}
	public EquipoSuplente(Jugador ja, Jugador jd1,Jugador jd2) {
		super();
		this.CANT_DEL=2;
		this.arquero = new Arquero(ja);
		this.defensor = new Defensor[this.CANT_DEL] {new Defensor(jd1),new Defensor(jd2)};
		this.volante = volante;
		this.delanteros = delanteros;
	}
	
	
}