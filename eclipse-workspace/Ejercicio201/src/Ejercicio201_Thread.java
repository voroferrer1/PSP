public class Ejercicio201_Thread{
	public static void main(String args[]) {
		HelloThread hilo = new HelloThread();//Se crea un nuevo hilo de ejecución
			hilo.start();
		System.out.println("Hola desde el hilo principal");
		System.out.println("Proceso acabado");
	}
}
