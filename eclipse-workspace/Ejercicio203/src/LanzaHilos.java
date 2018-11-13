public class LanzaHilos{
	public static void main(String args[]) {
		HiloConParametros hilo1 = new HiloConParametros("Hilo1",3);		
		HiloConParametros hilo2 = new HiloConParametros("Hilo2",4);	
		HiloConParametros hilo3 = new HiloConParametros("Hilo3",5);	
		hilo1.start();
		hilo2.start();
		hilo3.start(); 
	}	
}

