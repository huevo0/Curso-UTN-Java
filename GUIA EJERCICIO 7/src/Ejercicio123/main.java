package Ejercicio123;

public class main {

			public static void main(String[] args) {
				
				Producto producto1 = new Producto();
				Producto producto2 = new Producto();
				Producto producto3 = new Producto();

				ItemCarrito item1 = new ItemCarrito();
				ItemCarrito item2 = new ItemCarrito();
				ItemCarrito item3 = new ItemCarrito();
				
				item1.setCantidad(1);	producto1.setNombre("Jabon en Polvo"); 	producto1.setPrecio(40);
				item2.setCantidad(3);  	producto2.setNombre("Esponjas"); 		producto2.setPrecio(10);
				item3.setCantidad(2);  	producto3.setNombre("Chocolates"); 		producto3.setPrecio(100);
				
				Carrito Compra = new Carrito();
				Compra.setI1(item1);
				Compra.setI1(item2);
				Compra.setI1(item3);
				Compra.setPrecioCarrito((item1.getCantidad() * producto1.getPrecio()) +  (item2.getCantidad() * producto2.getPrecio()) + (item3.getCantidad() * producto3.getPrecio()));
				Compra.setCantprod(item1.getCantidad() + item2.getCantidad() + item3.getCantidad());
				
				System.out.println("Nombre" + "\t\t\t" + "Cantidad" + "\t"+ "Precio");
				System.out.println(producto1.getNombre() + "\t\t" + item1.getCantidad() + "\t\t"+"$" + producto1.getPrecio());
				System.out.println(producto2.getNombre() + "\t\t" + item2.getCantidad() + "\t\t"+"$" + producto2.getPrecio());
				System.out.println(producto3.getNombre() + "\t\t" + item3.getCantidad() + "\t\t"+"$" + producto3.getPrecio());
				System.out.println("Precio.Carrito : " + Compra.getPrecioCarrito() );
				
				Descuento descuento1 = new DescuentoFijo();
				descuento1.setValorDesc(14.0);
				Descuento descuento2 = new DescuentoPorcentaje();
				descuento2.setValorDesc(0.3);
				System.out.println("Precio Carrito con Descuento Fijo: "+descuento1.valorFinal(Compra.getPrecioCarrito()));
				System.out.println("Precio Carrito con Descuento Porcentaje: "+descuento2.valorFinal(Compra.getPrecioCarrito()));
				Descuento descuento3 = new DescuentoPorcentajeConTope();
				descuento3.setValorDesc(1.2);
				System.out.println("Precio Carrito con Descuento Porcentaje Con Tope: "+descuento3.valorFinal(Compra.getPrecioCarrito()));
			}
		}



