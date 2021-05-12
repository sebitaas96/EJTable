package basico;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ModeloPropio extends AbstractTableModel {
	private List<String> cabeceras = Arrays.asList("ID", "NOMBRE", "PAIS");
	private List<Ciudad> datos = new ArrayList<Ciudad>();

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datos.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return cabeceras.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Object valor = null;

		if (columnIndex == 0) {
			valor = datos.get(rowIndex).getIdCiudad();
		} else if (columnIndex == 1) {
			valor = datos.get(rowIndex).getNombre();
		} else if (columnIndex == 2) {
			valor = datos.get(rowIndex).getPais();
		}

		return valor;
	}

	public Ciudad getValueRow(int rowIndex) {

		return datos.get(rowIndex);

	}
	
	public void rellenarDatos(List<Ciudad> listaCiudades) {
		datos= listaCiudades;
		fireTableDataChanged();
	}

}
