package exercises;
import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		int a, b, c;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Options:\n1 = Numbers below said number will sum.\n2 = Sets an interval between 2 numbers and sums all numbers inside the interval.");
		System.out.print("Introduce an option: ");
		option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.print("Introduce a number: ");
			a = sc.nextInt();
			System.out.println("Result = " + sumInt(a));
			break;
		case 2:
			System.out.print("Introduce first number: ");
			b = sc.nextInt();
			System.out.print("Introduce second number: ");
			c = sc.nextInt();
			System.out.println("Result = " + sumInt(b, c));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
	
	static int sumInt(int a) {
		int result = 0;
		for (int i = 0; i <= a; i++) {
			result += i ;
		}
		return result;
	}
	
	static int sumInt(int b, int c) {
		int result = 0;
		for (int i = b + 1; i < c; i++) {
			result += i ;
		}
		return result;
	}
}
/*Diseña dos funciones de nombre sumaEnteros que hagan lo siguiente:
La primera de las funciones recibirá un argumento (numero) de tipo entero y devolverá la suma de todos los números desde
 1 hasta numero. El valor a devolver debe ser entero.
La segunda de las funciones recibirá dos argumentos (num1 y num2) de tipo entero
 y devolverá la suma de todos los números comprendidos entre los dos números (num1 y num2).
  El tipo a devolver debe ser entero.
*/