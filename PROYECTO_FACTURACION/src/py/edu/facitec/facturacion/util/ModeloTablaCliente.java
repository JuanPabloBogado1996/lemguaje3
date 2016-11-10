package py.edu.facitec.facturacion.util;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import py.edu.facitec.formulario.models.cliente;

public class ModeloTablaCliente extends AbstractTableModel {
	/**
	 * 
	 */

	private String[] columnas = {"codigo","Nombre","Apellido"};

	private Object [] [] filas= new Object[0][columnas.length];
	
	private void SetLista(List<cliente> clientes) {
		filas = new Object[clientes.size()][columnas.length];
		
		for (int i = 0; i < clientes.size(); i++) {
			filas[i][0] = clientes.get(i).getCodigo();
			filas[i][1] = clientes.get(i).getNombre();
			filas[i][2] = clientes.get(i).getApellido();
		}
	}
	
	public int getColumnCount() {

		return filas.length;
	}

	public int getRowCount() {

		return 0;
	}

	@Override
	public String getColumnName(int i) {
		return columnas[i];
	}
	
	public Object getValueAt(int f, int c) {
		return filas[f][c];
	}

}
