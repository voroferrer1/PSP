import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RunTimeProcess2  {
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		Runtime runtime = Runtime.getRuntime();
		
		try {
			Process process = runtime.exec(args,null,new File("/home/serpop/psp/RunTimeProcess/bin/"));
			Scanner tcl = new Scanner(System.in);
			System.out.println("Pulsa ej2 tecla para destruir");
			tcl.nextLine();
			process.destroy();
		} catch (IOException ex) {
			System.err.println("Excepción de E/S");
			System.exit(-1);

		}
	}
}
