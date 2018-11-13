import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci extends Thread{
	int numero;
	public Fibonacci(int N){
		this.numero = N;
		
	}
	public void run() {
		int[] NFib=new int[numero];		
		NFib[0]=0;
		NFib[1]=1;		
		for(int i=2;i<numero;i++) {
			NFib[i]=NFib[i-1]+NFib[i-2];				
		}
		System.out.println(Arrays.toString(NFib));
	}
}
