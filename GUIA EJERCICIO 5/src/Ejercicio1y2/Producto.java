package Ejercicio1y2;

public class Producto {
	private String nombre;
	private double precio;
	public Producto(String nombre, double precio) {
		super();
		nombre = nombre;
		precio = precio;
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
}			
	
