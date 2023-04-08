package Ejercicio3;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;
import java.io.FileReader;
public class main {

	public static void main(String[] args) throws Throwable {
				String archivo1 = "C:\\Clase 4\\entrada.txt";
				String archivo2 = "C:\\Clase 4\\salida.txt";
				String resultado = "";
				Scanner scn = new Scanner(System.in);
				System.out.println("Ingrese el texto:");
				
				FileWriter entrada;
				try {
					entrada = new FileWriter (archivo1);
					entrada.write(scn.nextLine());
					entrada.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
				System.out.println("Ingrese 'c' para codificar o 'd' para decodificar: ");
				char x = scn.next().charAt(0);
				switch (x)
				{
				case 'c': 
				{	System.out.println("El texto de salida: " + codificar(resultado));
					System.out.println("El texto se codifico exitosamente");	}
				break;
				case 'd':
				{
					System.out.println("El texto de salida: " + decodificar(resultado));
					System.out.println("El texto se codifico exitosamente");
				}
				break;
				}
	}
				public static String codificar(String texto) throws IOException
				{
					String archivo1 = "C:\\Clase 4\\entrada.txt";
					String archivo2 = "C:\\Clase 4\\salida.txt";
					FileReader entrada = new FileReader(archivo1);
					int i;
					String textoentrada = "";
					while ((i=entrada.read())!= -1) {
						
						textoentrada += (char) i;
					}
					System.out.println("textoentrada" + textoentrada);
					String abecedario = "abcdefghijklmnopqrstuvwxyz";
					System.out.println("Ingrese el numero de desplazamiento: ");
					Scanner scn = new Scanner(System.in);
					int desp = scn.nextInt();
					char[] r= new char[textoentrada.length()];
					
					for (int indice=0 ; indice<textoentrada.length() ; indice++)
					{
						for (int otroindice=0 ; otroindice < abecedario.length() ; otroindice++)
						{
							if (textoentrada.charAt(indice) == abecedario.charAt(otroindice))
							{
								r[indice] = abecedario.charAt(otroindice + desp);
							}
						}
					}
					String resultado = "";
					for(char a : r) {
						
						resultado += a;
					}
					FileWriter salida = new FileWriter(archivo2);
					salida.write(resultado);
					salida.close();
					
					System.out.println("resultado es: " + resultado);
					
					return resultado;
				}
				
				public static String decodificar(String texto) throws IOException
				{
					String archivo1 = "C:\\Clase 4\\entrada.txt";
					String archivo2 = "C:\\Clase 4\\salida.txt";
					FileReader entrada = new FileReader(archivo1);
					int i;
					String textoentrada="";
					while ((i=entrada.read())!= -1) {
						
						textoentrada += (char) i;
					}
					String abecedario = "abcdefghijklmnopqrstuvwxyz";
					System.out.println("Ingrese el numero de desplazamiento: ");
					Scanner scn = new Scanner(System.in);
					int desp = scn.nextInt();
					char[] r= new char[textoentrada.length()];
					for (int indice=0 ; indice<textoentrada.length() ; indice++)
					{
						for (int otroindice=0 ; otroindice < abecedario.length() ; otroindice++)
						{
							if (textoentrada.charAt(indice) == abecedario.charAt(otroindice))
							{
								r[indice] = abecedario.charAt(otroindice - desp);
							}
						}
					}
					String resultado = "";
					for(char a : r) {
						resultado += a;
					}
					FileWriter salida = new FileWriter(archivo2);
					salida.write(resultado);
					salida.close();
					System.out.println("resultado es: " + resultado);
					
			
				return resultado;
				}
				}