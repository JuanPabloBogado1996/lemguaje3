package py.edu.facitec.formulario.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import py.edu.facitec.facturacion.dao.ClienteDao;
import py.edu.facitec.facturacion.formulario.FormularioProducto;
import py.edu.facitec.facturacion.formulario.FormularioProveedor;
import py.edu.facitec.facturacion.formulario.Formulario_Cliente;
import py.edu.facitec.formulario.models.cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.awt.Color;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//le decimos que termine el proceso y libere memoria para el sistema operativo
		setExtendedState(MAXIMIZED_BOTH);//le decimos que ocupe toda la pantalla
		setBounds(100, 100, 621, 744);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnRegistros = new JMenu("Registros");
		mnRegistros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnRegistros);

		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verformulariocliente();
			}
		});
		mnRegistros.add(mntmCliente);

		JMenuItem mntmProveedor = new JMenuItem("Proveedor");
		mntmProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verFormularioProveedor();

			}
		});
		mnRegistros.add(mntmProveedor);

		JMenuItem mntmProducto = new JMenuItem("Producto");
		mntmProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verFormularioProducto();

			}
		});
		mnRegistros.add(mntmProducto);

		JMenu mnMovimientos = new JMenu("Movimientos");
		menuBar.add(mnMovimientos);

		JMenuItem mntmControlDeStock = new JMenuItem("Control de stock");
		mnMovimientos.add(mntmControlDeStock);

		JMenuItem mntmInformeDeVenta = new JMenuItem("Informe de venta");
		mnMovimientos.add(mntmInformeDeVenta);

		JMenuItem mntmInformeDeEstado = new JMenuItem("Informe de estado");
		mnMovimientos.add(mntmInformeDeEstado);

		JMenu mnInformes = new JMenu("Informes");
		menuBar.add(mnInformes);

		JMenu mnAcerca = new JMenu("Acerca");
		menuBar.add(mnAcerca);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	private void verformulariocliente() {

		Formulario_Cliente frmcliente= new Formulario_Cliente(); //instanciar la clase
		frmcliente.setVisible(true);//visible para el usuario

	}

	private void verFormularioProveedor() {
		FormularioProveedor proveedor= new FormularioProveedor();
		proveedor.setVisible(true);


	}
	private void verFormularioProducto() {
		FormularioProducto frmProducto= new FormularioProducto();
		frmProducto.setVisible(true);
	}



}
