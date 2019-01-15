package TicTac;

public class HiloTac extends Thread {
	int veces;
	Reloj reloj;

	public HiloTac(String nombre, Reloj r, int n) {
		this.setName(nombre);
		this.veces = n;
		this.reloj = r;
	}

	public void run() {
		for (int i = 0; i < veces; i++) {
			try {
				
				reloj.tac();
				Thread.sleep(1000);
				reloj.tictacDado();				
			} catch (Exception e) {
				
			}
			
		}
	}
}
