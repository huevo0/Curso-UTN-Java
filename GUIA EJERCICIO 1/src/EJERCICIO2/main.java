package EJERCICIO2;

public class main {
	
public static void main(String[] args) 
{
	
    double ingresos = 1112459.83;
    int superficie = 30;
    int energia = 3330;
    /*********************************************/
    if ( (ingresos <= 748382.07) && ( superficie <= 30) && (energia <= 3330) ) 
    {
        System.out.println("Categoría A");
    } 
    else if((ingresos <= 1112459.83) && (superficie <= 45) && (energia <= 5000) ) 
    {
        System.out.println("Categoría B");
    }
}
}
