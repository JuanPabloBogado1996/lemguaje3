package py.edu.facitec.restaurant.modelo.conexion.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import py.edu.facitec.restaurant.dto.ClientesDTO;
import py.edu.facitec.restaurant.dto.ProductoDTO;
import py.edu.facitec.restaurant.modelo.conexion.Conexion;

public class ClienteDAO {
	private Connection c;
	private PreparedStatement sentencia;
	private ResultSet rs;
	private String sql;
	private ClientesDTO cliente;

	public void insertar(ClientesDTO cli){
		cliente=cli;
		c=Conexion.obtenerConexion();
		try {
			sql=null;
			sql="INSERT INTO cliente(nombre, ci, celular, direccion) VALUES (?, ?, ?, ?);";
			sentencia=c.prepareStatement(sql);
			sentencia.setString(1, cliente.getNombreApellido());
			sentencia.setString(2, cliente.getCedula());
			sentencia.setInt(3, cliente.getCelular());			
			sentencia.setString(4, cliente.getDireccion());
			sentencia.executeUpdate();
			desconectar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al Insertar. "+e.getMessage());
		}	
	}

	public ClientesDTO obtenerById(int id){
		c = Conexion.obtenerConexion();
		cliente = new ClientesDTO();
		try {
			sql = null;
			sql = "SELECT * FROM cliente WHERE id=?";
			sentencia=c.prepareStatement(sql);
			sentencia.setInt(1, id);
			rs = sentencia.executeQuery();
			if(rs.next()){
				cliente.setCodigo(rs.getInt("id"));
				cliente.setNombreApellido(rs.getString("nombre"));
				cliente.setCedula(rs.getString("ci"));
				cliente.setDireccion(rs.getString("direccion"));
				cliente.setCelular(rs.getInt("celular"));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al obtener cliente: "+e.getMessage());
		}
		desconectar();
		return cliente;
	}
	
	public void actualizar(ClientesDTO cli){
		c = Conexion.obtenerConexion();
		try {
			sql=null;
			sql="UPDATE  cliente SET nombre=?, ci=? , celular=?, direccion=? where id=?;";
			sentencia.setString(1, cli.getNombreApellido());
			sentencia.setString(2, cli.getCedula());
			sentencia.setInt(3, cli.getCelular());
			sentencia.setString(4, cli.getDireccion());
			sentencia.setInt(5, cli.getCodigo());
			sentencia.executeUpdate();
			
		} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "Error al actualiuzaer:"+e.getMessage());
		e.printStackTrace();
		
		}
		desconectar();
	}

	public List<ClientesDTO> listar() {
		List<ClientesDTO> lista=new ArrayList<ClientesDTO>();
		c = Conexion.obtenerConexion();
		sql="Select * from cliente order by id desc";
		try {
			sentencia= c.prepareStatement(sql);
			rs=sentencia.executeQuery();
			while(rs.next()){
				cliente=new ClientesDTO();
				cliente.setCodigo(rs.getInt("id"));
				cliente.setNombreApellido(rs.getString("nombre"));
				cliente.setCedula(rs.getString("ci"));
				cliente.setDireccion(rs.getString("direccion"));
				cliente.setCelular(rs.getInt("celular"));
				lista.add(cliente);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "error"+e.getMessage());

		}
		desconectar();
		return lista;
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
