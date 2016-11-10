package py.edu.facitec.facturacion.formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class FormularioProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblDescuento;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioProducto frame = new FormularioProducto();
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
	public FormularioProducto() {
		setForeground(new Color(147, 112, 219));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 422);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(new Color(147, 112, 219));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(132, 11, 46, 14);
		contentPane.add(lblCodigo);

		textField = new JTextField();
		textField.setBounds(169, 8, 116, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setBounds(10, 45, 56, 14);
		contentPane.add(lblProducto);

		textField_1 = new JTextField();
		textField_1.setBounds(57, 42, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 89, 46, 14);
		contentPane.add(lblPrecio);

		textField_2 = new JTextField();
		textField_2.setBounds(45, 86, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblPrecioUnitario = new JLabel("Precio unitario:");
		lblPrecioUnitario.setBounds(10, 133, 72, 14);
		contentPane.add(lblPrecioUnitario);

		textField_3 = new JTextField();
		textField_3.setBounds(92, 130, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblProveedor = new JLabel("Proveedor:");
		lblProveedor.setBounds(239, 45, 55, 14);
		contentPane.add(lblProveedor);

		textField_4 = new JTextField();
		textField_4.setBounds(304, 42, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblPrecioTotal = new JLabel("Precio total:");
		lblPrecioTotal.setBounds(10, 178, 72, 14);
		contentPane.add(lblPrecioTotal);

		textField_5 = new JTextField();
		textField_5.setBounds(72, 175, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblIva = new JLabel("I.V.A:");
		lblIva.setBounds(10, 221, 35, 14);
		contentPane.add(lblIva);

		textField_6 = new JTextField();
		textField_6.setBounds(45, 218, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		lblDescuento = new JLabel("Descuento:");
		lblDescuento.setBounds(10, 265, 72, 14);
		contentPane.add(lblDescuento);

		textField_7 = new JTextField();
		textField_7.setBounds(72, 262, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setForeground(Color.BLUE);
		btnImprimir.setBounds(154, 349, 89, 23);
		contentPane.add(btnImprimir);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setForeground(Color.BLUE);
		btnBorrar.setBounds(253, 349, 72, 23);
		contentPane.add(btnBorrar);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(Color.BLUE);
		btnSalir.setBounds(330, 349, 72, 23);
		contentPane.add(btnSalir);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(Color.BLUE);
		btnGuardar.setBounds(72, 349, 71, 23);
		contentPane.add(btnGuardar);
	}
}
