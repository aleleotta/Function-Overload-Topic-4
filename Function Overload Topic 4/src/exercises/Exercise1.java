package exercises;
import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		int a, b;
		double c, d;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Options:\n1 = 2 integers\n2 = 2 decimals");
		System.out.print("Introduce an option: ");
		option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.print("Introduce first integer number: ");
			a = sc.nextInt();
			System.out.print("Introduce second integer number: ");
			b = sc.nextInt();
			System.out.println("Result = " + sum(a, b));
			break;
		case 2:
			System.out.print("Introduce first decimal number: ");
			c = sc.nextDouble();
			System.out.print("Introduce second decimal number: ");
			d = sc.nextDouble();
			System.out.println("Result = " + sum(c, d));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
	
	static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static double sum(double a, double b) {
		double result = a + b;
		return result;
	}
}
/*Diseña dos funciones de nombre suma que hagan lo siguiente:
*La primera de las funciones recibirá dos argumentos de tipo entero y devolverá la suma de ambos.
*El valor a devolver también será entero.
*La segunda de las funciones recibirá dos argumentos de tipo double y devolverá la suma de ambos.
*El tipo a devolver debe ser también double.
*/