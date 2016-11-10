package py.edu.facitec.restaurant.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import py.edu.facitec.restaurant.dto.ClientesDTO;
import py.edu.facitec.restaurant.modelo.conexion.dao.ClienteDAO;
import py.edu.facitec.restaurant.vistas.AbmCliente;
import py.edu.facitec.restaurant.vistas.BuscarClientes;

public class ABMClienteControlador implements ActionListener {
	private ClientesDTO cliente;	
	private AbmCliente ventana;
	private ClienteDAO dao;
	private boolean modificar;

	/**
	 * @wbp.parser.entryPoint
	 */
	public ABMClienteControlador(AbmCliente v) {                
		this.ventana=v;
		ventana.getBtnGuardar().addActionListener(this);
		ventana.getBtnModificar().addActionListener(this);
		ventana.getbtnCancelar().addActionListener(this);

		modoInsertar();

	}
	private void modificar() {
		ventana.getTextFieldnombre().setEnabled(true);
		ventana.getTextFieldcelular().setEnabled(true);
		ventana.getTextFieldcin().setEnabled(true);
		ventana.getTextFieldcodigo().setEnabled(false);
		ventana.getGettextFielddireccion().setEnabled(true);
		ventana.getbtnCancelar().setEnabled(true);
		ventana.getBtnCerrar().setEnabled(true);
		ventana.getBtnEliminar().setEnabled(false);
		ventana.getBtnGuardar().setEnabled(true);
		ventana.getBtnModificar().setEnabled(false);
		ventana.getBtnNuevo().setEnabled(false);
		modificar = true;
	}

	public void cargar(int id){
		dao = new ClienteDAO();
		ClientesDTO cliente =  dao.obtenerById(id);
		if(cliente!= null){
			ventana.getTextFieldcodigo().setText(Integer.toString(cliente.getCodigo()));
			ventana.getTextFieldnombre().setText(cliente.getNombreApellido());
			ventana.getTextFieldcelular().setText(Integer.toString(cliente.getCelular()));
			ventana.getTextFieldcin().setText(cliente.getCedula());
			ventana.getGettextFielddireccion().setText(cliente.getDireccion());
			ventana.getTextFieldnombre().setEnabled(false);
			ventana.getTextFieldcelular().setEnabled(false);
			ventana.getTextFieldcin().setEnabled(false);
			ventana.getTextFieldcodigo().setEnabled(false);
			ventana.getGettextFielddireccion().setEnabled(false);
			ventana.getbtnCancelar().setEnabled(false);
			ventana.getBtnCerrar().setEnabled(true);
			ventana.getBtnEliminar().setEnabled(true);
			ventana.getBtnGuardar().setEnabled(false);
			ventana.getBtnModificar().setEnabled(true);
			ventana.getBtnNuevo().setEnabled(true);
		}else{
			JOptionPane.showMessageDialog(null, "No se ha encontrado el cliente!");
		}

	}

	private void guardar(){
		if (ventana.getTextFieldnombre().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Debes Completar el Nombre");
			ventana.getTextFieldnombre().requestFocus();
		}else if(ventana.getTextFieldcelular().getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "Debe Ingresar el Celular");
			ventana.getTextFieldcelular().requestFocus();
		}else {
			cliente=new ClientesDTO();
			
			cliente.setNombreApellido(ventana.getTextFieldnombre().getText());
			cliente.setCedula(ventana.getTextFieldcin().getText());
			cliente.setCelular(Integer.parseInt(ventana.getTextFieldcelular().getText()));
			cliente.setDireccion(ventana.getGettextFielddireccion().getText());
			dao=new ClienteDAO();
			if(modificar==false){
				dao.insertar(cliente);
				modoInsertar();
				JOptionPane.showMessageDialog(null, "Se ha guardado con exito!");
				
			}else{
				cliente.setCodigo(Integer.parseInt(ventana.getTextFieldcodigo().getText()));
				dao.actualizar(cliente);
			}
			ventana.getTextFieldnombre().requestFocus();
		}
		
	}
	private void modoInsertar() {
		ventana.getBtnModificar().setEnabled(false);
		ventana.getBtnEliminar().setEnabled(false);
		ventana.getTextFieldnombre().setText("");
		ventana.getTextFieldcin().setText("");
		ventana.getTextFieldcelular().setText("");
		ventana.getGettextFielddireccion().setText("");
		ventana.getTextFieldnombre().requestFocus();
		modificar=false;
	}



	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(ventana.getBtnGuardar())) {
			guardar();
		} 

		if (e.getSource().equals(ventana.getBtnModificar())) {
			
			modificar();
		}
		if (e.getSource().equals(ventana.getbtnCancelar())) {
			modoInsertar();


		}

	}



}
