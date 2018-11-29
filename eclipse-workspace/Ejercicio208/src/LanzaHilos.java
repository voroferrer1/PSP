public class LanzaHilos {

	public static void main(String[] args) {
		System.out.println("Soy el hilo princpal");
		CreaHilos hilo1 = new CreaHilos(3);
		CreaHilos hilo2 = new CreaHilos(5);
		hilo1.run();
		hilo2.run();		
		System.out.println("Acabe");
	}
}
