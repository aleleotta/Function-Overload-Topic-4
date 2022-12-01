package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int a = 0;
		String b;
		int option;
		Scanner sc = new Scanner(System.in);
		System.out.println("Options:\n1 = Boolean integer.\n2 = Boolean string.");
		System.out.print("Introduce an option: "); 
		option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.print("Introduce 0 or 1: ");
			a = sc.nextInt();
			System.out.println(parseToBoolean(a));
			break;
		case 2:
			System.out.print("Introduce false or true: ");
			b = sc.next();
			System.out.println(parseToBoolean(b));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
	
	static boolean parseToBoolean(int a) {
		boolean b = false;
		if (a == 0) {
			b = false;
		} else if (a == 1) {
			b = true;
		} else {
			System.out.println("ERROR!");
		}
		return b;
	}
	
	static boolean parseToBoolean(String b) {
		boolean c = false;
		if (b == "true") {
			c = true;
		}
		return c;
	}
}
/*Diseña dos funciones de nombre parseToBoolean que hagan lo siguiente:
La primera de las funciones recibirá un argumento de tipo entero que devuelva false
 si el argumento es 0 y true si el argumento es 1.
La segunda de las funciones recibirá un argumento de tipo String que devuelva false
 si la cadena es igual a “false” y true si la cadena es igual a “true”.
*/