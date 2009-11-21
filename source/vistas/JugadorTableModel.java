package vistas;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import logica.Jugador;

public class JugadorTableModel extends AbstractTableModel {

	private String [] columnNames = {"Jugador","Equipo", "Posicion", "Cotiza"};
	private Vector<Jugador> datalist = new Vector<Jugador>();


	public JugadorTableModel() {

	}

	public JugadorTableModel(Vector<Jugador> l) {
		datalist.addAll(l);
	}  

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		System.out.println(this.datalist.size());
		return this.datalist.size();
	}

	public Jugador getJugadorAt(int row){
		return datalist.get(row);
	}

	public Jugador removeJugadorAt(int row){
		Jugador j = datalist.remove(row);
		fireTableDataChanged();
		//we return the player to get the reference to move it to another table
		return j;
	}

	public void addJugador(Jugador w) {
		datalist.add(w);
		fireTableDataChanged();
	}

	public void addJugadorList(Vector<Jugador> l) {
		datalist.addAll(l);
		fireTableDataChanged();
	}


	public Object getValueAt(int row, int col) {
		Jugador j = datalist.get(row);
		System.out.println("Getting row no:"+row );
		switch (col) {
		case 0:
			return j.getApellido()+","+j.getNombre();
		case 1:
			return j.getEquipo();
		case 2:
			return j.getPosicion();
		case 3:
			return j.getPrecio();
		default:
			return null;
		}
	}


	public Vector<Jugador> getDatalist() {
		return datalist;
	}

	@Override
	public String getColumnName(int col){
		return columnNames[col];
	}


}
