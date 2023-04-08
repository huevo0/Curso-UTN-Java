package ejercicio1;



public class Ej1a {
	public static void main(String[] args) 
	{
	String texto="cantidad de apariciones";
	char letra='i';
	int contador=0;
	for(int i=0 ; i<texto.length() ; i++)
	{ 
	if (texto.charAt(i) == letra)
	{
	contador++;
	}
	}
	System.out.println("La letra seleccionada aparece " + contador +" veces.");
	}
	}
