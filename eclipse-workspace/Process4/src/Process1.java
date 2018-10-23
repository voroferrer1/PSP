import java.io.*;

public class Process1 {
	public static void main(String[] args) throws IOException{
		Process p = new ProcessBuilder().start();
		
		//Escritura
		OutputStream os = p.getOutputStream();
		os.write("18-10-2018".getBytes());
		//Vaciado del buffer de salida
		os.flush();
		
		
		//Lectura
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1)
			System.out.print((char)c);
		is.close();
		
		//Comprobación de error
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de salida: "+ exitVal);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
		
}
