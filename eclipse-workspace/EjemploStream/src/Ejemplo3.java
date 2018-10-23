import java.io.*;
import java.util.Arrays;
public class Ejemplo3 {
	public static void main(String[] args) throws IOException{
		ProcessBuilder pb = new ProcessBuilder("passwd");
		
		Process process = pb.start();
		
		OutputStream os = process.getOutputStream();
		
		os.write("asdf\n".getBytes());
		os.flush();
		os.write("asdf\n".getBytes());
		os.flush();
		os.write("asdf\n".getBytes());
		os.flush();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		
		//InputStream is = process.getErrorStream();
		//InputStreamReader isr = new InputStreamReader(is);
		String line;
		
		System.out.println("Linea de error");
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		
		InputStream is1 = process.getInputStream();
		InputStreamReader isr1 = new InputStreamReader(is1);
		BufferedReader br1 = new BufferedReader(isr1);
		
		System.out.println("Linea normal");
		while ((line=br.readLine())!=null) {
			System.out.println(line);
		}		
	}
}
