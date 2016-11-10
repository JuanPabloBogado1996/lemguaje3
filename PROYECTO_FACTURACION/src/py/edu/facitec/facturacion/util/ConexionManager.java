package py.edu.facitec.facturacion.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 
 * @author F
 *esta clase sera el encargado de abrir la conexion a base de datos  y tambien cerrar la conexion
 * @param <Generated>
 */
@SuppressWarnings("")
public class ConexionManager {

	private static Connection conexion;
	public static Statement stm;


	//constantes
//	private static final String URL="jdbc:postgresql://localhost:5432/Restaurante";
//	private static final String USER="postgres";
//	private static final String PASWORD="12345";
;



	private static final String URL="jdbc:mysql://localhost:3306/Restaurant";
	private static final String USER="root";
	private static final String PASWORD="";


	public static Connection abrirConexion(){
		//este metodo se encarga de conectar con el driver
		try {
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("suceso en el Driver");

		} catch (Exception e) {

			System.out.println("error en el Driver");
			e.printStackTrace();
		}
		try {
			conexion = DriverManager.getConnection(URL , USER , PASWORD);
			stm = conexion.createStatement();//mediante esto ingresa ala base de datos
			System.out.println("Suceso en la conexion");
		} catch (SQLException e) {
			System.out.println("error en la conexion");
			e.printStackTrace();
		}

		return conexion;
	}

	public static void cerrarConexion(){

		if (conexion != null) {
			try {
				stm.close();
				conexion.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
}


	
