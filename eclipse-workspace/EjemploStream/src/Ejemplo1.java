import java.util.*;
import java.io.*;
public class Ejemplo1 {
	public static void main(String args[]) throws IOException{
		ProcessBuilder pb = new ProcessBuilder("java","HolaMundo1");
		//Iniciar el proceso
		pb.directory(new File("/home/vorper/PSP/eclipse-workspace/HolaMundo1/bin"));
		Process process = pb.start();
		
		
		InputStream is = process.getInputStream();//Coge la salida
		InputStreamReader isr = new InputStreamReader(is);//Lee la salida que se ha cogido
		BufferedReader br = new BufferedReader(isr);//Usa el buffer para 
		String line;
		System.out.println("Salida del proceso " +Arrays.toString(args)+ ":");
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
	
}
