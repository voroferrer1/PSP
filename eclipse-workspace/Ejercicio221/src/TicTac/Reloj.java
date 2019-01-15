package TicTac;

public class Reloj {
	boolean tictac;
	public Reloj() {
		 tictac=false;
	}
	public synchronized void tic() {
		try {
			while (tictac) {
				wait();
			}
			System.out.println("TIC");

		} catch (Exception e) {

		}
	}

	public synchronized void tac() {
		try {
			while (!tictac) {
				wait();
			}
			System.out.println("TAC");

		} catch (Exception e) {

		}
	}

	public synchronized void tictacDado() {		 
		tictac= !tictac;
		notifyAll();
	}

}
