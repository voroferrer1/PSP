public class LanzaHilos{
	public static void main(String args[]) {
		HiloConParametros hilo1 = new HiloConParametros("Hilo1",3);		
		HiloConParametros hilo2 = new HiloConParametros("Hilo2",4);	
		HiloConParametros hilo3 = new HiloConParametros("Hilo3",5);	
		try {			
			hilo1.start();
			hilo1.join();	
			hilo2.start();
			hilo2.join();
			hilo3.start();
			hilo3.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}		
		System.out.println("Fin del programa principal");
	}	
}