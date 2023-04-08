package Ejercicio1y2;

public class DescuentoFijo extends Descuento {
	@Override
	public double valorFinal(double valorInicial) {
		return valorInicial - this.getValorDesc();
	}
}


