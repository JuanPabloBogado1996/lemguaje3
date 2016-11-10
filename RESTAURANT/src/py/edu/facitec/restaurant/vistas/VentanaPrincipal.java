package py.edu.facitec.restaurant.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("Restaurant ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistros = new JMenu("Registros");
		menuBar.add(mnRegistros);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verABMCliente ();
				
			}

			private void verABMCliente() {
				
					AbmCliente cliente = new AbmCliente(0);
					cliente.setVisible(true);
					
				
			}
		});
		mnRegistros.add(mntmClientes);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				verAbmProducto();
			}

			private void verAbmProducto() {
				AbmProducto producto = new AbmProducto();
				producto.setVisible(true);
				
			}
		});
		mnRegistros.add(mntmProductos);
		
		JMenu mnTransaccines = new JMenu("Transacciones");
		menuBar.add(mnTransaccines);
		
		JMenuItem mntmPedidos = new JMenuItem("Pedidos");
		mntmPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verTransaccionpedido ();
			}

			private void verTransaccionpedido() {
				Transaccion pedido = new Transaccion();
				pedido.setVisible(true);
				
			}
		});
		mnTransaccines.add(mntmPedidos);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenuItem mntmTotalPedidos = new JMenuItem("Total Pedidos");
		mnReportes.add(mntmTotalPedidos);
		
		JMenu mnBuscar = new JMenu("Buscar");
		menuBar.add(mnBuscar);
		
		JMenuItem mntmClientes_1 = new JMenuItem("Clientes");
		mntmClientes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarcliente();
				
			}

			private void buscarcliente() {
				BuscarClientes buscar1 = new BuscarClientes ();
				buscar1.setVisible(true);
			}
		});
		mnBuscar.add(mntmClientes_1);
		
		JMenuItem mntmPedido = new JMenuItem("Pedido");
		mntmPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarPedido();
				
			}

			private void BuscarPedido() {
				BuscarPedido buscar2= new BuscarPedido();
				buscar2.setVisible(true);
				
			}
		});
		mnBuscar.add(mntmPedido);
		
		JMenuItem mntmProducto = new JMenuItem("Producto");
		mntmProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarProducto();
				
			}

			private void buscarProducto() {
				BuscarProducto buscar3 = new BuscarProducto();
				buscar3.setVisible(true);
				
			}
		});
		mnBuscar.add(mntmProducto);
		
		JLabel label = new JLabel("");
		menuBar.add(label);
		contentPane =  new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnClientes = new JButton("Clientes");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarClientes bcl = new BuscarClientes();
				bcl.setVisible(true);
			}
		});
		toolBar.add(btnClientes);
		
		JButton btnPedido = new JButton("Pedido");
		toolBar.add(btnPedido);
	}

}
