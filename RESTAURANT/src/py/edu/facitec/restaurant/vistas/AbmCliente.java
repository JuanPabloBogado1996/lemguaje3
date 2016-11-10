package py.edu.facitec.restaurant.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import py.edu.facitec.restaurant.controlador.ABMClienteControlador;

import java.awt.Color;

public class AbmCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldcodigo;
	private JTable table;
	private JTextField textFieldnombre;
	private JTextField textFieldcin;
	private JTextField textFieldcelular;
	private JButton btnNuevo;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCancelar;
	private JButton btnCerrar;
	private JTextField gettextFielddireccion;
	private int id;
/**
	 * Create the frame.
	 */
	public AbmCliente(int i) {
		id = 0;
		id = i;
		setTitle("AbmCliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100,715, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setBackground(Color.GREEN);
		lblClientes.setFont(new Font("Abbess", Font.BOLD | Font.ITALIC, 18));
		lblClientes.setBounds(161, 11, 93, 14);
		contentPane.add(lblClientes);
		
		JLabel lblBuscar = new JLabel("Codigo:");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblBuscar.setBounds(10, 46, 93, 17);
		contentPane.add(lblBuscar);
		
		textFieldcodigo = new JTextField();
		textFieldcodigo.setBounds(136, 47, 79, 20);
		contentPane.add(textFieldcodigo);
		textFieldcodigo.setColumns(10);
		
		table = new JTable();
		table.setBounds(38, 215, 344, -87);
		contentPane.add(table);
		
		JLabel lblNombreYApellido = new JLabel("Nombre:");
		lblNombreYApellido.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNombreYApellido.setBounds(10, 78, 106, 14);
		contentPane.add(lblNombreYApellido);
		
		textFieldnombre = new JTextField();
		textFieldnombre.setColumns(10);
		textFieldnombre.setBounds(136, 78, 196, 20);
		contentPane.add(textFieldnombre);
		
		JLabel lblCin = new JLabel("C.I.N:");
		lblCin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCin.setBounds(10, 111, 106, 14);
		contentPane.add(lblCin);
		
		textFieldcin = new JTextField();
		textFieldcin.setColumns(10);
		textFieldcin.setBounds(136, 108, 93, 20);
		contentPane.add(textFieldcin);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblCelular.setBounds(10, 142, 106, 14);
		contentPane.add(lblCelular);
		
		textFieldcelular = new JTextField();
		textFieldcelular.setColumns(10);
		textFieldcelular.setBounds(136, 142, 111, 20);
		contentPane.add(textFieldcelular);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblDireccion.setBounds(10, 173, 106, 14);
		contentPane.add(lblDireccion);
		
		gettextFielddireccion = new JTextField();
		gettextFielddireccion.setBounds(136, 173, 196, 20);
		contentPane.add(gettextFielddireccion);
		gettextFielddireccion.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setForeground(Color.DARK_GRAY);
		panel.setBounds(10, 215, 683, 41);
		contentPane.add(panel);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnNuevo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnEliminar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnCancelar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnCerrar);
		
		//creamos la ventana de ABMClientesControlador
		ABMClienteControlador controlador=new ABMClienteControlador(this);
		if(id!=0){
			controlador.cargar(id);
		}
		
	}

	public JTextField getTextFieldcodigo() {
		return textFieldcodigo;
	}

	public void setTextFieldcodigo(JTextField textFieldcodigo) {
		this.textFieldcodigo = textFieldcodigo;
	}

	public JTextField getTextFieldnombre() {
		return textFieldnombre;
	}

	public void setTextFieldnombre(JTextField textFieldnombre) {
		this.textFieldnombre = textFieldnombre;
	}

	public JTextField getTextFieldcin() {
		return textFieldcin;
	}

	public void setTextFieldcin(JTextField textFieldcin) {
		this.textFieldcin = textFieldcin;
	}

	public JTextField getTextFieldcelular() {
		return textFieldcelular;
	}

	public void setTextFieldcelular(JTextField textFieldcelular) {
		this.textFieldcelular = textFieldcelular;
	}
	public JButton getBtnNuevo() {
		return btnNuevo;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	public JButton getBtnModificar() {
		return btnModificar;
	}
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	public JButton getbtnCancelar() {
		return btnCancelar;
	}
	public JButton getBtnCerrar() {
		return btnCerrar;
	}

	public JTextField getGettextFielddireccion() {
		return gettextFielddireccion;
	}

	public void setGettextFielddireccion(JTextField gettextFielddireccion) {
		this.gettextFielddireccion = gettextFielddireccion;
	}
	
	
}
