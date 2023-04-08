package Ejercicio1;

import java.util.Scanner;

public class metodos {
		private double sumar;
		private double restar;
		private double multiplicar;
		private double dividir;
		
		
		
	
	
	public metodos() {		}
	public metodos(double sumar, double restar, double multiplicar, double dividir) {
			super();
			this.sumar = sumar;
			this.restar = restar;
			this.multiplicar = multiplicar;
			this.dividir = dividir;
		}
	public double getSumar (double num1) {
		double num2;
		System.out.println("num1 " + num1);	
		System.out.println("Ingrese numero: ");
		Scanner scn = new Scanner(System.in);
		num2 = scn.nextDouble();
		return num1 + num2;
	}
	public double getRestar (double num1) {
		double num2;
		System.out.println("Ingrese numero: ");
		Scanner scn = new Scanner(System.in);
		num2 = scn.nextDouble();
		return num1 - num2;
	
	}
	public double getMultiplicar (double num1) {
		double num2;
		System.out.println("Ingrese numero: ");
		Scanner scn = new Scanner(System.in);
		num2 = scn.nextDouble();
		return num1 * num2;
	}
	public double getDividir (double num1) {
		double num2;
		System.out.println("Ingrese numero: ");
		Scanner scn = new Scanner(System.in);
		num2 = scn.nextDouble();
		return num1 / num2;
	}
	
	
}
