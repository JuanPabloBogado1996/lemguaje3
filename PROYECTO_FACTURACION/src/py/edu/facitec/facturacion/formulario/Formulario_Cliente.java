package py.edu.facitec.facturacion.formulario;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import py.edu.facitec.facturacion.dao.ClienteDao;
import py.edu.facitec.facturacion.util.ModeloTablaCliente;
import py.edu.facitec.formulario.models.cliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Formulario_Cliente extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField tfCodigo;
	private JTextField tfNombre;
	private JComboBox cbEstadoCivil;
	private JCheckBox chActivo;
	private JCheckBox chInactivo;
	private JRadioButton rdFemenino;
	private JRadioButton rdMasculino;
	private JTextPane tpDireccion;
	private JButton btnModificar;
	private JButton btnEliminar;

	private ButtonGroup grupoEstado;
	private JTextField tfApellido;
	private JTable tbclientes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Formulario_Cliente dialog = new Formulario_Cliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Formulario_Cliente() {
		setBounds(100, 100, 853, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(Color.DARK_GRAY);
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		grupoEstado = new ButtonGroup();
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(21, 11, 46, 14);
		contentPanel.add(lblCodigo);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(21, 37, 54, 14);
		contentPanel.add(lblNewLabel);

		tfCodigo = new JTextField();
		tfCodigo.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					recuperarClientePorCodigo(Integer.parseInt(tfCodigo.getText()));

				}
			}
			@Override
			public void keyTyped(KeyEvent e) {
				if (tfCodigo.getText().length() == 10) {
					e.consume();
					getToolkit().beep();
				}
			}
		});
		tfCodigo.setBackground(Color.LIGHT_GRAY);
		tfCodigo.setBounds(77, 8, 89, 20);
		contentPanel.add(tfCodigo);
		tfCodigo.setColumns(10);

		tfNombre = new JTextField();
		tfNombre.setForeground(Color.BLUE);
		tfNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfApellido.requestFocus();
				}
			}
		});
		tfNombre.setBackground(Color.LIGHT_GRAY);
		tfNombre.setBounds(87, 34, 308, 20);
		contentPanel.add(tfNombre);
		tfNombre.setColumns(10);

		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCliente();
			}
		});
		btnNewButton.setBounds(329, 7, 89, 23);
		contentPanel.add(btnNewButton);

		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(10, 65, 70, 14);
		contentPanel.add(lblEstadoCivil);

		cbEstadoCivil = new JComboBox<String>();
		cbEstadoCivil.setBackground(Color.BLUE);
		cbEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Soltero/a", "Casado/a", "Divorciado/a", "Viudo/a"}));
		cbEstadoCivil.setBounds(77, 62, 96, 20);
		contentPanel.add(cbEstadoCivil);

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(21, 111, 46, 14);
		grupoEstado.add(rdFemenino);
		contentPanel.add(lblGenero);

		rdFemenino = new JRadioButton("Femenino");
		rdFemenino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {


			}
		});
		rdFemenino.setBounds(77, 107, 109, 23);
		contentPanel.add(rdFemenino);

		rdMasculino = new JRadioButton("Masculino");
		rdMasculino.setBounds(181, 107, 109, 23);
		grupoEstado.add(rdMasculino);
		contentPanel.add(rdMasculino);

		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(21, 152, 70, 14);
		contentPanel.add(lblDireccion);

		tpDireccion = new JTextPane();
		tpDireccion.setForeground(Color.DARK_GRAY);
		tpDireccion.setBackground(Color.LIGHT_GRAY);
		tpDireccion.setBounds(87, 152, 308, 42);
		contentPanel.add(tpDireccion);

		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(42, 226, 518, 42);
		contentPanel.add(panel);

		JButton btnGuardar = new JButton("Guardar");

		btnGuardar.setFont(new Font("SansSerif", Font.ITALIC, 12));
		btnGuardar.setForeground(Color.BLUE);
		btnGuardar.setBackground(Color.LIGHT_GRAY);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarCliente();
			}
		});
		panel.add(btnGuardar);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarCliente();
			}
		});
		panel.add(btnModificar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				modificarCliente();
			}
		});
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminarClientePorCodigo();
			}
		});
		panel.add(btnEliminar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("SansSerif", Font.ITALIC, 12));
		btnCancelar.setForeground(Color.BLUE);
		panel.add(btnCancelar);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("SansSerif", Font.ITALIC, 12));
		btnCerrar.setForeground(Color.BLUE);
		panel.add(btnCerrar);

		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(21, 85, 46, 14);
		contentPanel.add(lblEstado);

		chActivo = new JCheckBox("Activo");
		chActivo.setBounds(77, 81, 89, 23);
		contentPanel.add(chActivo);

		chInactivo = new JCheckBox("Inactivo");
		chInactivo.setBounds(170, 81, 97, 23);
		contentPanel.add(chInactivo);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(319, 66, 55, 16);
		contentPanel.add(lblApellido);

		tfApellido = new JTextField();
		tfApellido.setBackground(Color.LIGHT_GRAY);
		tfApellido.setBounds(376, 66, 122, 28);
		contentPanel.add(tfApellido);
		tfApellido.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(586, 37, 219, 247);
		contentPanel.add(scrollPane);

		tbclientes = new JTable();
		scrollPane.setViewportView(tbclientes);

		ModeloTablaCliente ModeloTablaCliente = new ModeloTablaCliente();

		//estoy desabilitando algunos botones al iniciar la ventana
		inicializar();
	}

	private void guardarCliente() {
		if (tfNombre.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ingrese el nombre");
			tfNombre.setRequestFocusEnabled(true);
		}else if (tfApellido.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Ingrese apellido");
			tfApellido.requestFocus();
		}
		cliente cliente = new cliente();
		//importar el objeto  recuperar el atributo    de la caja texto
		//setear al atributo nombre el valor del campo de texto tfNombre
		cliente.setNombre(tfNombre.getText());
		cliente.setApellido(tfApellido.getText());
		cliente.setEstadoCivil(cbEstadoCivil.getSelectedIndex());
		cliente.setDireccion(tpDireccion.getText());
		//1= femenino
		//2= masculino
		if (rdFemenino.isSelected()) {
			cliente.setGenero(1);

		}else {
			cliente.setGenero(2);
		}
		//le pasamos el objeto
		ClienteDao.guardarCliente(cliente);
		inicializar();
	}

	private void buscarCliente(){
		cliente cliente = new cliente();
		if (tfCodigo.getText().isEmpty() || tfCodigo.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Ingrese un codigo para buscar", "Aviso", 1);
			tfCodigo.requestFocus();//gana el foco
		}else{
			//convierte el codigo a int
			int id =Integer.parseInt(tfCodigo.getText());
			cliente =  ClienteDao.buscarClientePorId(id);

			if (cliente != null) {
				tfNombre.setText(cliente.getNombre());
				tfApellido.setText(cliente.getApellido());
				tpDireccion.setText(cliente.getDireccion());

				cbEstadoCivil.setSelectedIndex(cliente.getEstadoCivil());

				if (cliente.getGenero() == 1) {
					rdFemenino.setSelected(true);
				}else if(cliente.getGenero() == 2){
					rdMasculino.setSelected(true);
				}
				cbEstadoCivil.setSelectedIndex(cliente.getEstadoCivil());
				tpDireccion.setText(cliente.getDireccion());
			}else{
				JOptionPane.showMessageDialog(null, "No se ha encontrado un cliente con este codigo");
			}
		}
	}

	public void inicializar(){
		btnModificar.setEnabled(false);
		btnEliminar.setEnabled(false);

		//para que las ventanas esten vacias despues de cada accion
		tfCodigo.setText("");
		tfNombre.setText("");
		tfApellido.setText("");
		cbEstadoCivil.setSelectedIndex(0);
		rdFemenino.setSelected(false);
		tpDireccion.setText("");
		chActivo.setSelected(false);
	}

	private void recuperarClientePorCodigo(int codigo) {
		cliente c = ClienteDao.buscarClientePorId(codigo);
		if (c != null) {//si es distinto a NULO

			tfNombre.setText(c.getNombre());
			tfApellido.setText(c.getApellido());
			tpDireccion.setText(c.getDireccion());
			cbEstadoCivil.setSelectedIndex(c.getEstadoCivil());

			if (c.getGenero() == 1) {
				rdMasculino.setSelected(true);
			}else {
				rdFemenino.setSelected(true);
			}

			chActivo.setSelected(c.isEstado());
			rdFemenino.setSelected(true);
			tpDireccion.setText("");
			chActivo.setSelected(false);

			btnModificar.setEnabled(true);
			btnEliminar.setEnabled(true);
		}else {
			JOptionPane.showMessageDialog(this, "No existe este codigo en cliente", "aviso", 1);
			limpiarCampos();
		}
	}

	private void  limpiarCampos() {
		tfCodigo.selectAll();//selecciona todo el texto
		tfCodigo.requestFocus(); //gana el foco
		tfNombre.setText("");
		tfApellido.setText("");
		tpDireccion.setText("");

		cbEstadoCivil.setSelectedIndex(0);//que se posisione primero
		chActivo.setSelected(false);

		if (rdFemenino.isSelected()) {//preguntamos si esta seleccionado
			rdFemenino.setSelected(false);
		}

		if (rdMasculino.isSelected()) {
			rdMasculino.setSelected(false);
		}
	}

	private void modificarCliente() {

		cliente cliente = new cliente();

		cliente.setCodigo(Integer.parseInt(tfCodigo.getText()));
		cliente.setApellido(tfApellido.getText());
		cliente.setDireccion(tpDireccion.getText());
		cliente.setEstadoCivil(cbEstadoCivil.getSelectedIndex());

		if (rdFemenino.isSelected()) {
			cliente.setGenero(1);
		}else {
			cliente.setGenero(2);
		}

		if (chActivo.isSelected()) {
			cliente.setEstado(true);
		}else {
			cliente.setEstado(false);
		}
		ClienteDao.modificarCliente(cliente);//le pasamos el cliente cargado
	}

	//un metodo es para que el programa ejecuta para hacer una funcion 
	private void eliminarClientePorCodigo() {
		if (tfCodigo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Debes digitar el codigo cliente", "aviso", 3);
			tfCodigo.requestFocus();
		}else {
			int si = JOptionPane.showConfirmDialog(this, "Estas seguro que deseas eliminar el registro","Aviso", JOptionPane.YES_NO_OPTION);
			if (si == 0) {
				int clienteId = Integer.parseInt(tfCodigo.getText());
				ClienteDao.eliminarClientePorCodigo(clienteId);
				limpiarCampos();
			}else {
				limpiarCampos();
			}
		}
	}
} 
