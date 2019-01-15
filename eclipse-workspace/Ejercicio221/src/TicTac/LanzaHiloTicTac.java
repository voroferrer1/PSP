package TicTac;

public class LanzaHiloTicTac {
	public static void main(String[] args) {
		// Objeto compartido
		Reloj r = new Reloj();
		HiloTic tic = new HiloTic("Tic", r, 6000);		
		HiloTac tac = new HiloTac("Tac", r, 6000);
		tic.start();
		tac.start();

	}
}
