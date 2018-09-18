import java.util.Scanner;
import java.io.*;
class holaMundo3{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserta tu nombre:");
		String nombre= entrada.next();
		try{		
			BufferedWriter ficheroSalida = new BufferedWriter(new FileWriter(new File("fichero.txt")));
			for(int i=0; i<=20; i++){
				System.out.printf("Tu nombre es: %s\n",nombre);		
				ficheroSalida.write("Hola "+ nombre);	
				ficheroSalida.newLine();
		        } ;
			
			ficheroSalida.close();
			
		}
		catch (IOException errorDeFichero){	
			System.out.println("Ha habido problemas: " +errorDeFichero.getMessage() );
                };
	}
}
