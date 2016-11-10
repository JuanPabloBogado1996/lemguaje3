package py.edu.facitec.restaurant.dto;

public class ClientesDTO {
	private int codigo;
	private String nombreApellido;
	private String cedula;
	private int celular;
	private String direccion;
	
	
	
	public ClientesDTO() {
		
		this.codigo = 0;
		this.nombreApellido = "";
		this.cedula = "";
		this.celular = 0;
		this.direccion = "";
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNombreApellido() {
		return nombreApellido;
	}



	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public int getCelular() {
		return celular;
	}



	public void setCelular(int celular) {
		this.celular = celular;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	
}
