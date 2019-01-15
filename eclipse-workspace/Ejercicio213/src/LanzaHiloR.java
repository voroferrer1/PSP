
class LanzaHiloR extends Thread{
	
	private static int veces; 
	private static boolean flag = false;

	
	public LanzaHiloR() {
		if(!flag) {
			this.veces = 0;
			flag = true;
		}	
	}
	public void run() {
		if(veces < 10) {
			this.setName("Hilo " + veces);
			this.veces += 1;
			System.out.println("Soy el " + getName() +": y voy a llamar al hilo " + veces);			
			LanzaHiloR hilo = new LanzaHiloR();
			hilo.start();
		}else if(veces == 10) {
			this.setName("Hilo " + veces);
			System.out.println("Soy el " + getName());
		}
	}	
}
