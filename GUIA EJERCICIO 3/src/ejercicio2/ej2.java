package ejercicio2;

public class ej2 {
	public static void main(String[] args) 
	{
		char abece[]=new char[26];
		char a='a';
		char codificado[]=new char[20];
		int cod=0;
		for (int i=0 ; i<abece.length ; i++) 
		{ 	
			abece[i]=a;
			a++;
		}
		String texto1= "hola que tal";
		for(int indice=0 ; indice<texto1.length() ; indice++)
		{ 
			int otroindice=0;
			for(char c : abece)
			{ 	
				char compara=texto1.charAt(indice);
				if (compara == c)
				{
					codificado[cod]=abece[otroindice+2];
				}
				otroindice++;
			}
			cod++;
		}
		System.out.println ("Codificacion de 'hola que tal' 2 desplazamiento: ");
		for(char d : codificado)
		{ 
			System.out.print (d);
		}
		int ideco=0;
		char decode[]=new char[20];
		for(int indice=0 ; indice<texto1.length() ; indice++)
		{	
			int otroindice=0;
			for(char c : abece)
			{
				char compara=codificado[indice];
				if (compara == c)
				{
					decode[ideco]=abece[otroindice-2];
				}
				otroindice++;
			}
			ideco++;
		}
		System.out.println (" ");
		System.out.println ("Decodificacion de 'hola que tal': ");
		for(char e : decode)
		{	
			System.out.print (e);
		}
	}
}


