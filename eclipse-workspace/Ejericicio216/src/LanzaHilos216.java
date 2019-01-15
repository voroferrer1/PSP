
public class LanzaHilos216 {
	public static void main(String args[]) {
		Contador cont = new Contador(100);
		HiloSumador hilo1 = new HiloSumador("",cont ,100);
		HiloRestador hilo2 = new HiloRestador("", cont, 100);
		hilo1.start();
		hilo2.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cont.mostrarValor();
		}
}
