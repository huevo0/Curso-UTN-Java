package ar.edu.utn.ap4.java.GUIA_EJERCICIO_9;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {	
	 
		ArrayList <Persona> Listado = new ArrayList<Persona>();
	 		System.out.println("Ingreso de datos Persona");
		char salida='s';

		while(salida == 's') {
		 
		 Persona p = new Persona();
		 System.out.println("Nombre: ");
		 Scanner scn = new Scanner(System.in);
		 String nombre = scn.next();
		  p.setNombre(nombre);
		 System.out.println("Apellido: ");
		 String apellido = scn.next();
		 p.setApellido(apellido);
		 
		 System.out.println("Fecha de Nacimiento: ");
		 String fecha = scn.next();
		 p.setFechaNac(fecha);
		 Listado.add(p);
		 System.out.println("Desea cargar otra persona? teclee s o n.");
		 salida = scn.next().charAt(0);
		 System.out.println("salida: "+salida);
	
		 
		}
	  
		for(Persona l: Listado) {
			System.out.println(l);
		}
	}
}
