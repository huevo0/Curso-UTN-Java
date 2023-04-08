package Ejercicio1;
import java.util.Scanner;
public class main {

	public class Ejercicio1 {

		public int[] ordenasce(int arr[]) {
			int q = arr.length;
			char x = 'a';
			int guarda = 0;
			for (int i = 0; i < q; i++) {
				for (int j = 1; j < q - i; j++) {
					if (arr[j - 1] > arr[j]) {
						guarda = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = guarda;
					}
				}
			}
			return arr;

		}

		public int[] ordendesce(int[] arr) {
			int q = arr.length;
			char x = 'a';
			int guarda = 0;
			for (int i = 0; i < q; i++) {
				for (int j = 1; j < q - i; j++) {
					if (arr[j - 1] < arr[j]) {
						guarda = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = guarda;
					}
				}
			}
			return arr;

		}

		public void main(String[] args) {
			int arr[] = new int[3];
			char x;
			Scanner scn = new Scanner(System.in);
			System.out.println("Ingrese 3 numeros enteros: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Numero" + (i + 1) + " : ");
				arr[i] = scn.nextInt();

			}
			System.out.println("Ingrese 'a' para ordenar de forma ascendente o 'd' para ordenar de forma descendente: ");
			x = scn.next().charAt(0);
			switch (x) {
			case 'a': {
				arr = ordenasce(arr);
				for (int l : arr) {
					System.out.println(l);
				}
			}
				break;

			case 'd': {
				arr = ordendesce(arr);
				for (int l : arr) {
					System.out.println(l);
				}
			}
				break;
			default:
				System.out.println("letra incorrecta");
			}

		}
	}
}