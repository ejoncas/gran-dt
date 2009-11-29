package controlador;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import logica.Jugador;

public class JugadorTableModelP extends AbstractTableModel {

	private String [] columnNames = {"Jugador","Equipo", "Posicion", "Puntaje"};
	private Vector<Jugador> datalist = new Vector<Jugador>();


	public JugadorTableModelP() {

	}

	public JugadorTableModelP(Vector<Jugador> l) {
		datalist.addAll(l);
	}  

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
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
		switch (col) {
		case 0:
			return j.getApellido()+","+j.getNombre();
		case 1:
			return j.getEquipo();
		case 2:
			return j.getPosicion();
		case 3:
			return j.getPuntaje();
		default:
			return null;
		}
	}


	@Override
	public void setValueAt(Object p, int row, int col) {
		String puntaje = (String) p;
		if(col==3){
			try {
				getJugadorAt(row).setPuntaje(Integer.parseInt(puntaje));
			} catch (NumberFormatException e) {
				System.out.println("Solo se permiten formatos numericos");
				e.printStackTrace();
			}
		}
		fireTableDataChanged();
	}

	@Override
	public boolean isCellEditable(int row, int col){
		return col == 3;
	}

	public Vector<Jugador> getDatalist() {
		return datalist;
	}

	@Override
	public String getColumnName(int col){
		return columnNames[col];
	}


}
