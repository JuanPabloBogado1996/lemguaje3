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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Transaccion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaccion frame = new Transaccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transaccion() {
		setTitle("Transacciones");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 497);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPedidos = new JLabel("Pedidos");
		lblPedidos.setFont(new Font("Lucida Handwriting", Font.PLAIN, 15));
		lblPedidos.setBounds(174, 11, 98, 14);
		contentPane.add(lblPedidos);
		
		JLabel lblNro = new JLabel("Nro:");
		lblNro.setBounds(10, 37, 46, 14);
		contentPane.add(lblNro);
		
		textField = new JTextField();
		textField.setBounds(51, 34, 40, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(260, 36, 46, 14);
		contentPane.add(lblFecha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(308, 34, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setBounds(10, 83, 46, 14);
		contentPane.add(lblCliente);
		
		textField_2 = new JTextField();
		textField_2.setBounds(51, 80, 40, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 80, 229, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(340, 79, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblMesa = new JLabel("Mesa:");
		lblMesa.setBounds(10, 127, 46, 14);
		contentPane.add(lblMesa);
		
		textField_4 = new JTextField();
		textField_4.setBounds(51, 124, 40, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 168, 23, 23);
		contentPane.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setBounds(36, 169, 40, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(82, 169, 111, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(197, 169, 33, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(233, 169, 60, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(308, 168, 89, 23);
		contentPane.add(btnAgregar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 198, 414, 165);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"codigo", "descripcion", "cantidad", "precio", "total"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(247, 398, 46, 14);
		contentPane.add(lblTotal);
		
		textField_9 = new JTextField();
		textField_9.setBounds(288, 395, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(183, 423, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(288, 423, 89, 23);
		contentPane.add(btnCancelar);
	}
}
