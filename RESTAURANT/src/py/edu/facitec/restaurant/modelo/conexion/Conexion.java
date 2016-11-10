package py.edu.facitec.restaurant.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {
			
		public static Connection obtenerConexion(){
			Connection c=null;
			
			String host="localhost";
			String port="5432";
			String dbid="Restaurant";
			String user="postgres";
			String password="12345";
			String driverName="org.postgresql.Driver";
			
			String url=null;
			
			try {
				Class.forName(driverName);
				url="jdbc:postgresql://"+host+":"+port+"/"+dbid;
				c=DriverManager.getConnection(url,user,password);
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Error con el Driver de Conexion. "+e.getMessage());
				e.printStackTrace();
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, "Usuario o Clave Invalido. "+e.getMessage());
				e.printStackTrace();
			}
			
			
			return c;
		}
}

