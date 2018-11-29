
public class LanzaCreaHilos {
	public static void main(String args[]) {
		CreaHilos hilo3s = new CreaHilos(3);
		CreaHilos hilo5s = new CreaHilos(5);
		hilo3s.start();
		hilo5s.start();
		try {
		Thread.currentThread().sleep(4000);
		}catch (InterruptedException e){
			
		}
	}
	
}
