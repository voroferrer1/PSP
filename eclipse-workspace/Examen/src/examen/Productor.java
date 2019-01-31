package examen;

class Productor extends Thread {
	private Almacen almacen;
	private int id;
	private int iteraciones;

	public Productor(Almacen a, int n, int veces) {
		almacen = a;
		id = n;
		iteraciones=veces;
		this.setName("Productor"+id);
		
	}

	public void run() {		
		for (int i = 0; i < iteraciones; i++) {
			almacen.produce(i);
			System.out.println(getName()+ " produce el valor " + i); 		

		}
	}
}