import java.util.Scanner;
import java.io.*;

class holaMundo3 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserta tu nombre:");
		String nombre = entrada.next();
		for (int i = 0; i <= 20; i++) {
			System.out.printf("Tu nombre es: %s\n", nombre);

		}
	}
}
