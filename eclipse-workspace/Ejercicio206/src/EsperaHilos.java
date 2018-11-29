
public class EsperaHilos extends Thread {
	public void run() {
		System.out.println("Soy el " + Thread.currentThread().getName() + " empezando.");
		try {
			this.sleep(3000);
			// También se puede hacer así y lo aplicará al hilo actual.
			//Thead.sleep(3000);
			System.out.println("Soy el " + Thread.currentThread().getName() + " acabando.");

		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrumpido.");
			return;
		}
		System.out.println(Thread.currentThread().getName() + " acabado.");
	}
}
