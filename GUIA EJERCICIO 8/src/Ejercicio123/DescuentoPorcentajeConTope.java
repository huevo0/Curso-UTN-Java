package Ejercicio123;

public class DescuentoPorcentajeConTope extends Descuento {
	@Override
	public double valorFinal(double valorInicial) {
		if (this.getValorDesc()< 1) 
		{		return valorInicial - (valorInicial *	this.getValorDesc());		}
		else { return valorInicial - (0.9 *	this.getValorDesc());	}
		
	}
}
