package Ejercicio1y2;

public class ItemCarrito {
	private int cantidad;
	public Producto prod;
	public Producto precio;
		
	public ItemCarrito(int cantidad, Producto prod, Producto precio) {
		super();
		this.cantidad = cantidad;
		this.prod = prod;
		this.precio = precio;
	}

	public ItemCarrito() {
	}

	public ItemCarrito(Producto prod) {
		super();
		this.prod = prod;
	}

	public ItemCarrito(int cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public ItemCarrito(int cantidad, Producto prod) {
		super();
		this.cantidad = cantidad;
		this.prod = prod;
	}

	public int getCantidad() {
		
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProd() {
		return prod;
	}

	public void setProd(Producto prod) {
		this.prod = prod;
	}

	
}
