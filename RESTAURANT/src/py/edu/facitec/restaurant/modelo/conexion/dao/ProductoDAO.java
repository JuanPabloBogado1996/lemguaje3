package py.edu.facitec.restaurant.modelo.conexion.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import py.edu.facitec.restaurant.dto.ProductoDTO;
import py.edu.facitec.restaurant.modelo.conexion.Conexion;

public class ProductoDAO {
	private Connection c;
	private PreparedStatement sentencia;
	private ResultSet rs;
	private String sql;
	private ProductoDTO producto;
		
	public void insertar(ProductoDTO p){
		producto=p;
		c=Conexion.obtenerConexion();
		try {
			sql=null;
			sql="INSERT INTO producto(descripcion, precio) VALUES (?, ?);";
			sentencia=c.prepareStatement(sql);
			sentencia.setString(1, producto.getDescripcion());
			sentencia.setDouble(2, producto.getPrecio());
			sentencia.executeUpdate();
			desconectar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al Insertar. "+e.getMessage());
		}
		
		
	}
	private void desconectar() {
		try {
			if (rs !=null) {
				rs.close();
			}
			if (sentencia !=null) {
				sentencia.close();
			}
			if (c !=null) {
				c.close();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al desconectar"+e.getMessage());
		}

	}
}
