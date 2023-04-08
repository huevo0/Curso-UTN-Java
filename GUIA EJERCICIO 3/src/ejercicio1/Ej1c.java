package ejercicio1;

public class Ej1c {
	public static void main(String[] args) 
	{
		int vector[]=new int[] {20,200,30,180,40,160};
		int x=150;
		int suma=0;
		for(int i : vector)
		{
			if(i > x)
			{
				suma=suma+i;
			}
		}
		System.out.println("La suma de los numeros mayores a x es: " + suma);
	}
}

