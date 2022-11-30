package exercises;
import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		int a = 0;
		String b;
		int option;
		Scanner sc = new Scanner(System.in);
		sc.close();
	}
	
	static boolean parseToBoolean(int a) {
		boolean b = false;
		if (a == 0) {
			b = false;
		} else if (a == 1) {
			b = true;
		}
		return b;
	}
}
/*Diseña dos funciones de nombre parseToBoolean que hagan lo siguiente:
La primera de las funciones recibirá un argumento de tipo entero que devuelva false
 si el argumento es 0 y true si el argumento es 1.
La segunda de las funciones recibirá un argumento de tipo String que devuelva false
 si la cadena es igual a “false” y true si la cadena es igual a “true”.
*/