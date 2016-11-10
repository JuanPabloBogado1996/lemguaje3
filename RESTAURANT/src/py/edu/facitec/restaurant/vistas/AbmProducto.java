package py.edu.facitec.restaurant.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class AbmProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblPedido;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnGuardar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnCanselar;
	private JButton btnCerrar;

	/**
	 * Create the frame.
	 */
	public AbmProducto() {
		setTitle("AbmProducto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 697, 271);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Codigo");
		label.setBounds(10, 39, 46, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(91, 36, 79, 20);
		contentPane.add(textField);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(10, 82, 73, 14);
		contentPane.add(lblDescripcion);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(91, 79, 180, 20);
		contentPane.add(textField_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(10, 122, 46, 14);
		contentPane.add(lblPrecio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(91, 119, 79, 20);
		contentPane.add(textField_2);
		
		lblPedido = new JLabel("Producto");
		lblPedido.setFont(new Font("Abbess", Font.PLAIN, 18));
		lblPedido.setBounds(184, 11, 87, 26);
		contentPane.add(lblPedido);
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 174, 661, 47);
		contentPane.add(panel);
		
		btnNewButton = new JButton("Nuevo");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnNewButton);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnGuardar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnEliminar);
		
		btnCanselar = new JButton("Canselar");
		btnCanselar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnCanselar);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel.add(btnCerrar);
	}

}
