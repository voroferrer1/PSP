package runtimeProcess;
import java.io.*;
import java.util.*;

public class Runprocess {
	public static void main(String[] args) throws IOException { // Se recoge un proceso con el string args
		if (args.length <= 0) { // Si no hay proceso se devuelve -1
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		ProcessBuilder pb = new ProcessBuilder(args); // Se crea un objeto proceso
		try {
			Process process = pb.start(); // Se ejecuta el proceso
			int retorno = process.waitFor(); // Si funciona devuelve 0, sino otro valor
			System.out.println("La ejecución de " + Arrays.toString(args) + " devuelve " + retorno);
		} catch (IOException ex) { // Se prepara para posibles errores
			System.err.println("Excepción de E/S");
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finalizó de forma incorrecta");

		}
	}
}