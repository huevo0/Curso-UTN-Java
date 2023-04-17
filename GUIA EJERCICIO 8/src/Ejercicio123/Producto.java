package Ejercicio123;

public class Producto {
	private String nombre;
	private double precio;
	private double cantidad;
	
	public Producto(String nombre, double precio, double cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Producto() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double preciototal() {
		double preciototal = this.precio * this.cantidad;
		return preciototal;
		
	}
}			
	
