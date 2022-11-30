package exercises;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		int a, b;
		double c, d, e;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Options:\n1 = 2 integers\n2 = 3 decimals");
		System.out.print("Introduce an option: ");
		option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.print("Introduce first integer number: ");
			a = sc.nextInt();
			System.out.print("Introduce second integer number: ");
			b = sc.nextInt();
			System.out.println("Result = " + average(a, b));
			break;
		case 2:
			System.out.print("Introduce first decimal number: ");
			c = sc.nextInt();
			System.out.print("Introduce second decimal number: ");
			d = sc.nextInt();
			System.out.print("Introduce third decimal number: ");
			e = sc.nextInt();
			System.out.println("Result = " + average(c, d, e));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
	
	static int average(int a, int b) {
		int result = (a + b) / 2;
		return result;
	}
	
	static double average(double c, double d, double e) {
		double result = (c + d + e) / 3;
		return result;
	}
}
/*Diseña dos funciones de nombre media que hagan lo siguiente:
      La primera de las funciones recibirá dos argumentos de tipo entero y devolverá la media de ambos.
          El valor a devolver debe ser double.
      La segunda de las funciones recibirá tres argumentos de tipo entero y devolverá la media de los tres.
          El tipo a devolver debe ser double.
*/