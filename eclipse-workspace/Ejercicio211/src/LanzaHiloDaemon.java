
public class LanzaHiloDaemon {

	public static void main(String[] args) {
		HiloDaemon hilo3s = new HiloDaemon(3);
		HiloDaemon hilo5s = new HiloDaemon(20);
		hilo3s.start();
		hilo5s.setDaemon(true);
		hilo5s.start();
		try {
			Thread.currentThread().sleep(4000);
			System.out.println("Soy el programa acabando");
		} catch (InterruptedException e) {

		}
	}

}
