package py.edu.facitec.restaurant.vistas;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import py.edu.facitec.restaurant.controlador.BuscarClienteControlador;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BuscarClientes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel modelo;

	/**
	 * Create the frame.
	 */
	public BuscarClientes() {
		setTitle("Buscar Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientes = new JLabel("Clientes");
		lblClientes.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblClientes.setBounds(146, 11, 90, 14);
		contentPane.add(lblClientes);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setBounds(10, 52, 46, 14);
		contentPane.add(lblBuscar);
		
		textField = new JTextField();
		textField.setBounds(66, 49, 260, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abmCliente();
			}

			private void abmCliente() {
				AbmCliente abm1 = new AbmCliente(0);
				abm1.setVisible(true);
				
			}
		});
		btnNuevo.setBounds(335, 48, 89, 23);
		contentPane.add(btnNuevo);
		
		scrollPane =new JScrollPane();
		scrollPane.setBounds(10,77,414,274);
		//crear Tabla
		String columna[]=new String[]{"Id","Nombre y Apellido","Celular"};
		modelo=new DefaultTableModel(null,columna);
		table=new JTable(modelo){
			public boolean isCellEditable(int rowIndex, int vColIndex){
				return false;// desabilita la edicion de las celdas
			}
		};
		  
		table.setModel(modelo);
		scrollPane.setViewportView(table);
		getContentPane().add(scrollPane);
		    
		
		BuscarClienteControlador controlador=new BuscarClienteControlador(this);
				controlador.cargarTabla();
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
	
	
}
