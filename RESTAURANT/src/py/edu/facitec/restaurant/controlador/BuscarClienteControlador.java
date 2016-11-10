package py.edu.facitec.restaurant.controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import py.edu.facitec.restaurant.dto.ClientesDTO;
import py.edu.facitec.restaurant.modelo.conexion.dao.ClienteDAO;
import py.edu.facitec.restaurant.vistas.AbmCliente;
import py.edu.facitec.restaurant.vistas.BuscarClientes;

public class BuscarClienteControlador implements WindowListener, KeyListener {
	private BuscarClientes ventana;
	private ClienteDAO dao;


	public  BuscarClienteControlador(BuscarClientes v) {
		ventana=v;
		ventana.addWindowListener(this);
		ventana.getTable().addKeyListener(this);

	}

	public void cargarTabla() {
		while(ventana.getModelo().getRowCount()>0){
			ventana.getModelo().removeRow(0);
		}
		ventana.getTable().getColumnModel().getColumn(1).setPreferredWidth(100);
		dao=new ClienteDAO();
		Object[] fila= new Object[3];
		List<ClientesDTO> lista=new ArrayList<ClientesDTO>();
		lista=dao.listar();
		for (int i = 0; i < lista.size(); i++) {
			fila[0]=lista.get(i).getCodigo();
			fila[1]=lista.get(i).getNombreApellido();
			fila[2]=lista.get(i).getCelular();
			ventana.getModelo().addRow(fila);

		}

	}
	private void seleccionarFila() {
		int row =ventana.getTable().getSelectedRow();
		int id = (Integer.parseInt(ventana.getTable().getValueAt(row, 0).toString().trim()));
		AbmCliente vCliente = new AbmCliente(id);
		vCliente.setVisible(true);
	}

	public void windowActivated(WindowEvent arg0) {
		cargarTabla();

	}

	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		if(e.getSource().equals(ventana.getTable())){
			if(e.getKeyCode()==KeyEvent.VK_ENTER){
				seleccionarFila();
			}
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}


}
