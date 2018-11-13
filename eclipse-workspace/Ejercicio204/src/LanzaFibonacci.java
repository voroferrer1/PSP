import java.util.Scanner;
public class LanzaFibonacci {
	public static void main(String args[]) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduce un numero para la longitud del Fibonacci:");
		int i = tcl.nextInt();
		Fibonacci fib = new Fibonacci(i);
		fib.start();
	}
}
