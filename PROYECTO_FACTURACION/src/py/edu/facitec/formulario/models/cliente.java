package py.edu.facitec.formulario.models;
/**
 * 
 * @author Fernando Villalba
 *Esta clase es una representacion de la entidad cliente
 */
public class cliente {
	//atributos 
	private int codigo;
	private String nombre;
	private String apellido;
	private String direccion;
	private int genero;
	private int estadoCivil;
	private boolean estado;

	//constructores por defecto
	public cliente() {
		super();
		this.codigo = 0;
		this.nombre = "";
		this.apellido = "";
		this.direccion = "";
		this.genero = 0;
		this.estadoCivil = 0;
		this.estado = false;
	}

	//constructor por parametos
	public cliente(int codigo, String nombre, String apellido, String direccion, int genero, int estadoCivil,
			boolean estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.estado = estado;
	}

	//metodos Getter y Setter
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public int getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}



}
