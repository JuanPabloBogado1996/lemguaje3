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
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BuscarProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public BuscarProducto() {
		setTitle("Buscar Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 401);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientes = new JLabel("Producto");
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
				abmProducto ();
				
			}

			private void abmProducto() {
				AbmProducto nuevoProducto = new AbmProducto();
				nuevoProducto.setVisible(true);
				
			}
		});
		btnNuevo.setBounds(335, 48, 89, 23);
		contentPane.add(btnNuevo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 414, 274);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Precio", "Descripcion", "Precio"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 10, 10);
		contentPane.add(panel);
	}
}
