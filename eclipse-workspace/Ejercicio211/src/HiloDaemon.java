
public class HiloDaemon extends Thread{
	int milisegundos;
	public HiloDaemon(int i) {
		this.milisegundos = i*1000;		
	}
	public void run() {
		System.out.println("Soy el " + Thread.currentThread().getName() + " empezando.");
		try {
			this.sleep(milisegundos);
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
