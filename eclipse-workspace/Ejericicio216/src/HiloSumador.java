
public class HiloSumador extends Thread {
	private Contador contador;
	private int veces;
	private String nombre;
	public HiloSumador(String nombre,Contador cont,int n) {
		this.contador=cont;
		this.nombre = nombre;
		this.veces=n;
	}
	public void run() {
		try {
		for (int i=0;i<veces;i++) {
			contador.incrementa();	
			this.sleep(100);
			
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contador.mostrarValor();
	}
}
