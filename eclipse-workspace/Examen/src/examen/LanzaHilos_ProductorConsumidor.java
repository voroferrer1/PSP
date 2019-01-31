package examen;

public class LanzaHilos_ProductorConsumidor {
	public static void main(String[] args) {
		Almacen almacen = new Almacen();
		Productor p1 = new Productor(almacen, 1, 4);
		p1.start();
		Consumidor c1 = new Consumidor(almacen, 1, 4);
		c1.start();
		try {		
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("***Fin de LanzaHilos***");
		System.exit(-1);
	}
}
