public class HiloRestador extends Thread{
	private Contador contador;
	private int veces;
	private String nombre;
	public HiloRestador(String nombre,Contador cont,int n) {
		this.contador=cont;
		this.nombre = nombre;
		this.veces=n;
	}
	public void run() {
		for (int i=0;i<veces;i++) {
			contador.decrementa();		
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		contador.mostrarValor();
	}
}
