package examen;

class Almacen {
	private int numeroEnAlmacen;
	private boolean numeroAlmacenado = true;
	public Almacen() {
		numeroAlmacenado = true;
	}
	

	public synchronized void produce(int valor) {
		try {
			while (!numeroAlmacenado) {

				wait();

			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		numeroEnAlmacen = valor;
		numeroAlmacenado = false;
		notifyAll();
	}
	
	public synchronized int consume() {
		try {
			while (numeroAlmacenado) {
				wait();

			}
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		numeroAlmacenado = true;
		notifyAll();
		return numeroEnAlmacen;

	}
}