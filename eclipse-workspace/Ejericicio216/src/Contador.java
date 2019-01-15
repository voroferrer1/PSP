
public class Contador {
	int contador;
	public Contador(int i) {
		this.contador=i;
	}
	public synchronized void incrementa() {
		this.contador++;
	}
	public synchronized void decrementa() {
		this.contador--;
	}
	public void mostrarValor() {
		System.out.print("\n"+contador);
	}
}
