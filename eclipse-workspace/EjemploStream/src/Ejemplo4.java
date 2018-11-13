import java.io.*;

public class Ejemplo4 {
	public static void main(String[] args) throws IOException {

		ProcessBuilder proceso = new ProcessBuilder("java", "holaMundo2");
		proceso.directory(new File("/home/vorper/PSP/eclipse-workspace/HolaMundo/bin"));
		Process pr = proceso.start();
		// Recoge la salida del proceso hijo
		// InputStream is= pr.getInputStream();

		// Implementacion de buffered reader resumida, en una línea
		BufferedReader bre = new BufferedReader(new InputStreamReader(pr.getErrorStream()));

		String line;

		// Muestra salida de error
		System.out.println("Linea de Error");
		while ((line = bre.readLine()) != null) {
			System.out.println(line);

		}
		BufferedReader brs = new BufferedReader(new InputStreamReader(pr.getInputStream()));
//De salir bien aqui escribirá lo que envia el proceso hijo a su salida estandar 
		System.out.println("Linea normal");
		while ((line = brs.readLine()) != null) {
			System.out.println(line);
		}

	}
}