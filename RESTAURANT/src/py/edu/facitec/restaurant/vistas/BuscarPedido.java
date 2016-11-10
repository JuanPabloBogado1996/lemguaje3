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
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BuscarPedido extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;


	public BuscarPedido() {
		setTitle("BuscarPedido");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPedido = new JLabel("Pedido");
		lblPedido.setFont(new Font("Sitka Text", Font.PLAIN, 16));
		lblPedido.setBounds(175, 11, 105, 14);
		contentPane.add(lblPedido);
		
		JLabel label = new JLabel("Buscar");
		label.setBounds(10, 40, 46, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(66, 37, 260, 20);
		contentPane.add(textField);
		
		JButton button = new JButton("Nuevo");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransaccionPedido();
				
			}

			private void TransaccionPedido() {
				Transaccion nuevopedido= new Transaccion();
				nuevopedido.setVisible(true);
				
			}

			
		});
		button.setBounds(335, 36, 89, 23);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 414, 165);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Codigo", "Cliente", "Fecha", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		scrollPane.setRowHeaderView(panel);
	}
}
