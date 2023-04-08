package Ejercicio1y2;

public class Carrito {
	ItemCarrito i1;
	ItemCarrito i2;
	ItemCarrito i3;
	private double PrecioCarrito;
	private double Cantprod;

	public Carrito(ItemCarrito item1, ItemCarrito item2, ItemCarrito item3, double precioCarrito, double Cantprod) {
		super();
		this.i1 = item1;
		this.i2 = item2;
		this.i3 = item3;
		this.PrecioCarrito = precioCarrito;
		this.Cantprod = Cantprod;
	}

	public Carrito() {}

	public ItemCarrito getI1() {
			return i1;}

	public void setI1(ItemCarrito i1) {
				this.i1 = i1;}

	public ItemCarrito getI2() {
		return i2;
	}

	public void setI2(ItemCarrito i2) {
		this.i2 = i2;
	}

	public ItemCarrito getI3() {
					return i3;}

	public void setI3(ItemCarrito i3) {
						this.i3 = i3;}

	public double getPrecioCarrito() {
		return PrecioCarrito;
	}

	public void setPrecioCarrito(double precioCarrito) {
							PrecioCarrito = precioCarrito;}

	public double getCantprod() {
		return Cantprod;
	}

	public void setCantprod(double cantprod) {
		Cantprod = cantprod;
	}

}
