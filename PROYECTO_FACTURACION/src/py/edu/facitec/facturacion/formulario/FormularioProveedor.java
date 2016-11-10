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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Font;

public class FormularioProveedor extends JFrame {

	private JPanel contentPane;
	private JTextField tfCodigo;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField tfContacto;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioProveedor frame = new FormularioProveedor();
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
	public FormularioProveedor() {
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 451);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFormularioDeProveedores = new JLabel("Formulario de Proveedores");
		lblFormularioDeProveedores.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblFormularioDeProveedores.setBounds(315, 0, 179, 25);
		contentPane.add(lblFormularioDeProveedores);

		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 30, 46, 14);
		contentPane.add(lblCodigo);

		tfCodigo = new JTextField();
		tfCodigo.setForeground(Color.LIGHT_GRAY);
		tfCodigo.setBounds(50, 27, 86, 20);
		contentPane.add(tfCodigo);
		tfCodigo.setColumns(10);

		JLabel lblCompaia = new JLabel("Compa\u00F1ia:");
		lblCompaia.setBounds(256, 30, 56, 14);
		contentPane.add(lblCompaia);

		textField_1 = new JTextField();
		textField_1.setBounds(338, 52, 35, -8);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(307, 27, 202, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblContacto = new JLabel("Contacto:");
		lblContacto.setBounds(10, 75, 56, 14);
		contentPane.add(lblContacto);

		tfContacto = new JTextField();
		tfContacto.setBounds(62, 72, 121, 20);
		contentPane.add(tfContacto);
		tfContacto.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(Color.BLUE);
		btnBuscar.setBounds(134, 26, 73, 23);
		contentPane.add(btnBuscar);

		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setBounds(10, 108, 46, 14);
		contentPane.add(lblCargo);

		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(10, 144, 46, 14);
		contentPane.add(lblCiudad);

		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 182, 56, 14);
		contentPane.add(lblDireccion);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 215, 46, 14);
		contentPane.add(lblTelefono);

		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(10, 252, 46, 14);
		contentPane.add(lblCelular);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 295, 46, 14);
		contentPane.add(lblEmail);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vendedor", "Proveedor", "Levantador de pedidos", "Secretario"}));
		comboBox.setForeground(Color.BLUE);
		comboBox.setBounds(50, 105, 157, 20);
		contentPane.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLUE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Curuguaty", "Yasy Ca\u00F1y", "Katuete", "Saltos de Guaira"}));
		comboBox_1.setBounds(62, 141, 145, 20);
		contentPane.add(comboBox_1);

		textField_4 = new JTextField();
		textField_4.setBounds(62, 179, 157, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBounds(62, 212, 99, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(50, 249, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(50, 292, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblFormasDePago = new JLabel("Formas de pago:");
		lblFormasDePago.setBounds(463, 75, 86, 14);
		contentPane.add(lblFormasDePago);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta de credito", "Giro"}));
		comboBox_2.setBounds(548, 72, 104, 20);
		contentPane.add(comboBox_2);

		JLabel lblPais = new JLabel("Pais:");
		lblPais.setBounds(486, 163, 35, 14);
		contentPane.add(lblPais);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Paraguay", "Brasil", "Bolivia", "Argentina"}));
		comboBox_3.setBounds(513, 160, 104, 20);
		contentPane.add(comboBox_3);

		JRadioButton rdbtnActivo = new JRadioButton("Activo");
		rdbtnActivo.setBounds(525, 243, 73, 23);
		contentPane.add(rdbtnActivo);

		JRadioButton rdbtnInactivo = new JRadioButton("Inactivo");
		rdbtnInactivo.setBounds(613, 243, 79, 23);
		contentPane.add(rdbtnInactivo);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(338, 378, 79, 23);
		contentPane.add(btnAceptar);

		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(420, 378, 79, 23);
		contentPane.add(btnModificar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(509, 378, 89, 23);
		contentPane.add(btnCancelar);
	}
}
