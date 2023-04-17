package Ejercicio123;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Carrito {
	
	private Producto prod1 , prod2 , prod3;
	private Date Fecha;
	
	public Carrito(Producto prod1, Producto prod2, Producto prod3, Date fecha) {
		super();
		this.prod1 = prod1;
		this.prod2 = prod2;
		this.prod3 = prod3;
		Fecha = fecha;
	}
	
	public Carrito() {
		super();
	}
	
	public Producto getProd1() {
		return prod1;
	}

	public void setProd1(Producto prod1) {
		this.prod1 = prod1;
	}

	public Producto getProd2() {
		return prod2;
	}

	public void setProd2(Producto prod2) {
		this.prod2 = prod2;
	}

	public Producto getProd3() {
		return prod3;
	}

	public void setProd3(Producto prod3) {
		this.prod3 = prod3;
	}

	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	public void agregoproducto (Producto prod) {
		if(this.prod1==null) {
			this.prod1=prod;
		}else if (this.prod2==null) {
					this.prod2=prod;
			}else {this.prod3=prod;		}
	
	}
	
	public double costoFinal() {
		double costoFinal=0;
		if(this.prod1!=null) {
			costoFinal = costoFinal + this.prod1.preciototal();
		}
		if(this.prod2!=null) {
			costoFinal = costoFinal + this.prod2.preciototal();
		}
		if(this.prod3!=null) {
			costoFinal = costoFinal + this.prod3.preciototal();
		}
		return costoFinal;
		
	}
	
	
	
}
