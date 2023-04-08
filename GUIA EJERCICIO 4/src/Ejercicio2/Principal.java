package Ejercicio2;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Principal {

	public static void main(String[] args) {


		double resultado=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Ingresar numeros separados por un espacio: ");
		String numeros = scn.nextLine();

		FileWriter archivo;
		try {
			archivo = new FileWriter ("C:\\Clase 4\\archivo.txt");
			archivo.write(numeros);
			archivo.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


		System.out.println("Ingrese 's' para sumatoria o 'm' para multiplicarlos: ");
		char opera;
		opera = scn.next().charAt(0);
		switch(opera)
		{
			case 's':
			{ 	try {
					System.out.println("Sumatoria es: "+ Sumatoria(resultado));} 
				catch (IOException e) {	e.printStackTrace();}}
			break;
			case 'm':
			{	try {
					System.out.println("Multiplicacion es: " + Multiplicacion(resultado));}
				catch (NumberFormatException e) {e.printStackTrace();	} 
				catch (IOException e) {	e.printStackTrace();	} 
			}	
			break;
		}
}

	public static double Sumatoria(double resultado) throws IOException {
		FileReader archivo = new FileReader ("C:\\Clase 4\\archivo.txt");
		String contenido = "";
		int c;
		
		while((c=archivo.read()) != -1)
		{				
			contenido += (char) c;
		}
		System.out.println("Contenido del Archivo: " + contenido);
		for (String a : contenido.split(" ")) {
			int numero = Integer.parseInt(a);
			resultado = resultado + numero;
		}
		return resultado;
	}

	public static double Multiplicacion (double resultado) throws IOException
	{
		FileReader archivo = new FileReader ("C:\\Clase 4\\archivo.txt");
		String contenido = "";
		int c;
		while((c=archivo.read()) != -1)
		{				
			contenido += (char) c;
		}
		System.out.println("Contenido del Archivo: " + contenido);
		resultado=1;
		for (String a : contenido.split(" ")) {
			
			double numero = Double.parseDouble(a);
			resultado *= numero;
		
		}
		return resultado;
	}
}