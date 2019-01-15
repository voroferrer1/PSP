package sem;

import java.util.concurrent.Semaphore;

class Acumula {
	public static int acumulador = 0;
}

class Sumador extends Thread {
	private int cuenta;
	private Semaphore sem;

	Sumador(int hasta, int id, Semaphore sem) {
		this.cuenta = hasta;
		this.sem = sem;
	}
	public void sumar() {
		Acumula.acumulador++;
	}
	public void run() {
		for (int i = 0; i < cuenta; i++) {
			try {sem.acquire();} 
			catch (InterruptedException e) {e.printStackTrace();}
			sumar();
			sem.release();
		}
	}
}

public class SeccionCriticaSemaforos {
	private static Sumador sumadores[]; // Array de hilos
	private static Semaphore semaphore = new Semaphore(1);

	public static void main(String[] args) {
		int n_sum = 10;
		sumadores = new Sumador[n_sum];
		for (int i = 0; i < n_sum; i++) {
			sumadores[i] = new Sumador(10000000, i, semaphore);
			sumadores[i].start();
			try {
				sumadores[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Acumulador: " + Acumula.acumulador);
	}
}
