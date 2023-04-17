package Ejercicio123;

import java.util.ArrayList;
import java.util.List;


public class main {

			public static void main(String[] args) {
				
				Producto producto1 = new Producto("Jabon en Polvo" , 40, 1);
				Producto producto2 = new Producto("Esponjas" , 10, 3);
				Producto producto3 = new Producto("Chocolates" , 100, 2);
			
				Carrito Compra = new Carrito();
				Compra.agregoproducto(producto1);
				Compra.agregoproducto(producto2);
				Compra.agregoproducto(producto3);

				double precioCarrito = Compra.costoFinal();
				
				System.out.println("Nombre" + "\t\t\t" + "Cantidad" + "\t"+ "Precio");
				System.out.println(Compra.getProd1().getNombre() + "\t\t" + Compra.getProd1().getCantidad() + "\t\t"+"$" + Compra.getProd1().getPrecio());
				System.out.println(Compra.getProd2().getNombre() + "\t\t" + Compra.getProd2().getCantidad() + "\t\t"+"$" + Compra.getProd2().getPrecio());
				System.out.println(Compra.getProd3().getNombre() + "\t\t" + Compra.getProd3().getCantidad() + "\t\t"+"$" + Compra.getProd3().getPrecio());
				System.out.println("Precio.Carrito : " + Compra.costoFinal() );
				
				Descuento descuento1 = new DescuentoFijo();
				descuento1.setValorDesc(14.0);
				Descuento descuento2 = new DescuentoPorcentaje();
				descuento2.setValorDesc(0.3);
				System.out.println("Precio Carrito con Descuento Fijo: "+descuento1.valorFinal(Compra.costoFinal()));
				System.out.println("Precio Carrito con Descuento Porcentaje: "+descuento2.valorFinal(Compra.costoFinal()));
				Descuento descuento3 = new DescuentoPorcentajeConTope();
				descuento3.setValorDesc(1.2);
				System.out.println("Precio Carrito con Descuento Porcentaje Con Tope: "+descuento3.valorFinal(Compra.costoFinal()));
			}
		}




