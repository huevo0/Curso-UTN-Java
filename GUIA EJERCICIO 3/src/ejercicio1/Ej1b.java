package ejercicio1;

public class Ej1b {
	public static void main(String[] args)
	{
		int arr[]= new int[] {7,1,5,6,8,4,2,3,9};
		char x= 'a';
		int guarda=0;
		System.out.println("arr desordenado es: ");
		for (int k : arr)
		{
			System.out.print(k);
		}
		switch(x) 
		{	case('a'):
		{
			for(int i=0 ; i < arr.length ; i++ )
			{
				for(int j=1 ; j < (arr.length)-i ; j++)
				{
					if(arr[j-1] > arr[j])
					{
						guarda=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=guarda;
					}
				}
			}
			System.out.println("");
			System.out.println("arr ordenado ascendente es: ");
					for (int k : arr)
					{
						System.out.print(k);
					}
		}
		break;
		case('d'):
		{
			for(int i=0 ; i < arr.length ; i++ )
			{
				for(int j=1 ; j < (arr.length)-i ; j++)
				{
					if(arr[j-1] < arr[j])
					{
						guarda=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=guarda;
					}
				}
			}
			System.out.println("");
			System.out.println("arr ordenado descendente es: ");
			for (int k : arr)
			{
				System.out.print(k);
			}
		}
		break;
		default:System.out.println(""); 
		System.out.println("ingreso letra incorrecta");
		}
	}
}



