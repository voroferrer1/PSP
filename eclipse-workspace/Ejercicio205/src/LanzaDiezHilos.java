import java.util.Scanner;

public class LanzaDiezHilos {
	public static void main(String args[]) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduce el numero de hilos que quieres crear :");
		int i = tcl.nextInt();
		DiezHilos[] hilos;
		for(int x=0;x<i;x++) {
			//DiezHilos nuevo = new DiezHilos(x);
			//hilos[x] = nuevo;
		}
	}
}
