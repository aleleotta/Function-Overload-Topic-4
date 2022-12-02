package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int option, a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option: ");
		option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.print("Introduce a number: ");
			a = sc.nextInt();
			System.out.println(randomNumbers(a));
		case 2:
		case 3:
		default:
		}
		sc.close();
	}
	static int randomNumbers(int a){
		int numbers;
		Scanner sc = new Scanner(System.in);
		numbers = sc.nextInt();
		for(int i = 0; i <= numbers ; i++) {
			numbers = (int)(Math.random() * 1);
			System.out.println(numbers);
		}
		sc.close();
		return numbers;
	}
	static int randomNumbers(){}
	static int randomNumbers(){}
}
/*Diseña tres funciones de nombre numerosAleatorios que hagan lo siguiente:
a) La primera de las funciones recibirá un argumento de tipo entero que indicará la cantidad de números aleatorios a generar.
   Esta función generará números aleatorios comprendidos entre 0 y 1 y los mostrará por pantalla.
b) La segunda de las funciones recibirá dos argumentos de tipo entero: 
   El primero indica la cantidad de números aleatorios a generar
   El segundo indica el valor máximo que tomará el número aleatorio.
   Los números aleatorios generados deben estar entre 0 y el valor máximo introducido por parámetro.
   En este caso los números aleatorios deben ser enteros. Los números aleatorios generados deben mostrarse por pantalla.
c) La tercera de las funciones recibirá tres argumentos de tipo entero: 
   El primero indica la cantidad de números aleatorios a generar
   El segundo indica el valor mínimo que tomará el número aleatorio. 
   El tercero indica el valor máximo que tomará el número aleatorio.
   Los números aleatorios generados deben estar entre el valor mínimo y el valor máximo introducidos por parámetro.
   En este caso los números aleatorios deben ser enteros. Los números aleatorios generados deben mostrarse por pantalla.
*/