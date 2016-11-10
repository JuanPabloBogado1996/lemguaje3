package py.edu.facitec.restaurant.dto;

public class ProductoDTO {
private int codigo;
private String descripcion;
private double precio;
public ProductoDTO() {
	
	this.codigo = 0;
	this.descripcion = "";
	this.precio = 0;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}



}
