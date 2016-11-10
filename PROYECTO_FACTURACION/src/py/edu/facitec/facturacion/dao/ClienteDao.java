
/**
 * esta clase sera el responsable por el ac cso en la tabla clientes
 */
package py.edu.facitec.facturacion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import py.edu.facitec.facturacion.util.ConexionManager;
import py.edu.facitec.formulario.models.cliente;

public class ClienteDao {

	public static   void guardarCliente(cliente cliente){
		String sql =" INSERT INTO tb_cliente( nombres, apellidos, direccion, genero, estado_civil, estado) "
				+ "VALUES('"+cliente.getNombre()+"', '"+cliente.getApellido()+"',"
				+ "'"+cliente.getDireccion()+"',"+cliente.getGenero()+","+cliente.getEstadoCivil()+", "
				+ ""+cliente.isEstado()+")";
		System.out.println(sql);

		ConexionManager.abrirConexion(); //abrir conexion

		try {
			ConexionManager.stm.execute(sql);//ejecutamos el SQL
		} catch (Exception e) {

			e.printStackTrace();
		}

		ConexionManager.cerrarConexion();//cerramos la conexion ala base de datos
	}
	//get recuperar 
	//set cargar
	public static cliente buscarClientePorId(int id){
		String sql= "select * from tb_cliente where codigo = "+id+" ";
		System.out.println(sql);

		ConexionManager.abrirConexion();
		cliente cliente = null;

		try {
			ResultSet rs = ConexionManager.stm.executeQuery(sql);
			if (rs.next()) {
				cliente = new cliente();//instancio mi clase, para crear objeto

				cliente.setCodigo(rs.getInt("codigo"));
				cliente.setNombre(rs.getString("nombres"));
				cliente.setApellido(rs.getString("apellidos"));
				cliente.setGenero(rs.getInt("genero"));
				cliente.setEstadoCivil(rs.getInt("estado_Civil"));
				cliente.setEstado(rs.getBoolean("estado"));
				cliente.setDireccion(rs.getString("direccion"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;

	}
	public static void modificarCliente(cliente cliente){
		String sql = "update tb_cliente set " 
				+"nombres= '"+cliente.getNombre()+"',"
				+"apellidos= '"+cliente.getApellido()+"', "
				+"direccion='"+cliente.getDireccion()+"', "
				+"genero = '"+cliente.getGenero()+"', "
				
				+"where codigo="+cliente.getCodigo()+" ";
				
				
	ConexionManager.abrirConexion();
		
		try {
			ConexionManager.stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	ConexionManager.cerrarConexion();
	}
	public static void eliminarClientePorCodigo(int codigo){
		String sql = "delete  from tb_cliente where codigo ="+codigo+" ";
		ConexionManager.abrirConexion();
		
		try {
			ConexionManager.stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConexionManager.cerrarConexion();
	}
}
