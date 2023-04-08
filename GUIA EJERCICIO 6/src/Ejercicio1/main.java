package Ejercicio1;

import java.util.*;

public class main {

	public static void main(String[] args) {
		char c='a';
		System.out.println("################## CALCULADORA ##################");
		System.out.println("(ingrese 'c' para finalizar");

		System.out.println("Ingrese numero: ");
		Scanner scn = new Scanner(System.in);
		double num1 = scn.nextDouble();
		double resultado=0;
		double total=0;
		int i=0;
		metodos operaciones = new metodos();
		while(c != 'c') {
			
			System.out.println("Operador: ");
			c = scn.next().charAt(0);
			switch (c) {
				case '+': { resultado = operaciones.getSumar(num1);
							num1 = resultado;
							System.out.println(resultado);	}
				break;
				case '-': { resultado = operaciones.getRestar(num1);
							num1 = resultado;
							System.out.println(resultado);	}
				break;
				case '*': { resultado = operaciones.getMultiplicar(num1);
							num1 = resultado;
							System.out.println(resultado);	}
				break;
				case '/': { resultado = operaciones.getDividir(num1);
							num1 = resultado;
							System.out.println(resultado);	}
				break;
				}
				
		}
		System.out.println("################## FIN DEL PROGRAGAMA ##################");

	}	
	
}
