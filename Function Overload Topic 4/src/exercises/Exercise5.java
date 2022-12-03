package exercises;
import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		int option, a, b, c, d, e, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select an option: ");
		option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.print("Introduce a number: ");
			a = sc.nextInt();
			System.out.println(randomNumbers(a));
			break;
		case 2:
			System.out.print("Introduce the quantity of digits to print: ");
			b = sc.nextInt();
			System.out.print("Introduce the maximum value: ");
			c = sc.nextInt();
			System.out.println(randomNumbers(b, c));
			break;
		case 3:
			System.out.print("Introduce the quantity of digits to print: ");
			d = sc.nextInt();
			System.out.print("Introduce the minimum value: ");
			e = sc.nextInt();
			System.out.print("Introduce the maximum value: ");
			f = sc.nextInt();
			System.out.println(randomNumbers(d , e, f));
			break;
		default:
			System.out.println("ERROR!");
		}
		sc.close();
	}
	static int randomNumbers(int a){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= a ; i++) {
			n = (int)(Math.random() * 2);
			System.out.print(n);
		}
		sc.close();
		return n;
	}
	static int randomNumbers(int b, int c){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= b ; i++) {
			n = (int)(Math.random() * c + 1);
			System.out.print(n);
		}
		sc.close();
		return n;
	}
	static int randomNumbers(int d, int e, int f){
		int n = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 2; i <= d ; i++) {
			n = (int)(Math.random() * (f - e + 1) + e);
			System.out.print(n);
		}
		sc.close();
		return n;
	}
}
/*Diseña tres funciones de nombre numerosAleatorios que hagan lo siguiente:
a) La primera de las funciones recibirá un argumento de tipo entero que indicará la cantidad de números aleatorios a generar.
   Esta función generará números aleatorios comprendidos entre 0 y 1 y los mostrará por pantalla.
b) La segunda de las funciones recibirá dos argumentos de tipo entero: 
   El primero indica la cantidad de números aleatorios a generar.
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