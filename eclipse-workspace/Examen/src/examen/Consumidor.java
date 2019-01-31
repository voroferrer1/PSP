package examen;


class Consumidor extends Thread {
	private Almacen almacen;
	private int id;
	private int iteraciones;
	
	public Consumidor(Almacen a, int n,int veces) {
		almacen = a;
		this.id = n;
		iteraciones = veces;
	}	
	public void run() {
		int valor=0;
		for (int i = 0; i < iteraciones; i++) {
			valor=almacen.consume();
			System.out.println("Consumidor " + id + " en iteración "+ i+" consume el valor " + valor);
			
			
		}
	}
}