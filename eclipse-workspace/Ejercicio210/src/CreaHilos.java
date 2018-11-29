
public class CreaHilos {
	public static void main(String args[]) {
		HiloEspera hilo1 = new HiloEspera();
		HiloEspera hilo2= new HiloEspera();
		hilo1.setName("hilo 1");
		hilo2.setName("hilo 2");
		hilo1.start();
		hilo2.start();
		try {
			Thread.currentThread().sleep(5000);
			Thread.currentThread().interrupt();
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido. ");
			return;
		}
		hilo1.interrupt();
		System.out.println("Fin de lanzahilos");
	}
}