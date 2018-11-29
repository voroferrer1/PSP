public class HiloConParametros extends Thread {
	
	int numero;
	public HiloConParametros(String nombre,int numero) {
				this.setName(nombre);
				this.numero = numero;
	}	
	public void run() {
		for(int i=0;i<numero;i++) {
			System.out.println(getName());
		}
	}
	
}

