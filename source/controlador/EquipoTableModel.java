package controlador;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import logica.Equipo;

public class EquipoTableModel extends AbstractTableModel {

	private String [] columnNames = {"Nombre Equipo","Puntaje"};
	private Vector<Equipo> datalist = new Vector<Equipo>();


	public EquipoTableModel() {

	}

	public EquipoTableModel(Vector<Equipo> l) {
		datalist.addAll(l);
	}  

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		return this.datalist.size();
	}

	public Equipo getEquipoAt(int row){
		return datalist.get(row);
	}

	public Equipo removeEquipoAt(int row){
		Equipo j = datalist.remove(row);
		fireTableDataChanged();
		return j;
	}

	public void addEquipo(Equipo w) {
		datalist.add(w);
		fireTableDataChanged();
	}

	public void addEquipoList(Vector<Equipo> l) {
		datalist.addAll(l);
		fireTableDataChanged();
	}


	public Object getValueAt(int row, int col) {
		Equipo j = datalist.get(row);
		switch (col) {
		case 0:
			return j.getNombre();
		case 1:
			return j.getPuntajeacum();
		default:
			return null;
		}
	}


	public Vector<Equipo> getDatalist() {
		return datalist;
	}

	@Override
	public String getColumnName(int col){
		return columnNames[col];
	}

}
