
public class LanzaHiloR extends Thread{
	
	private static int veces; 
	private static boolean flag = false;
	private static int siguiente;
	
	public LanzaHiloR() {
		if(!flag) {
			this.veces = 10;
			flag = true;
		}else {
			this.veces=siguiente;
		}		
	}
	public void run() {
		if(veces > 0) {
			this.setName("Hilo " + veces);
			this.siguiente = veces - 1;
			System.out.println("Soy el " + getName() +": y voy a llamar al hilo " + siguiente);			
			LanzaHiloR hilo = new LanzaHiloR();
			hilo.start();
		}else if(veces == 0) {
			this.setName("Hilo " + veces);
			System.out.println("Soy el " + getName());
		}
	}
	
}
