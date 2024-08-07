package BuclesAnidados;

public class dibujoCuadrado {

	public static void main(String[] args) {
		// 4. Dibuja un cuadrado de n elementos de lado utilizando *.
		
		int n=4, num=0;
		String elem="*";
		while(num<n) {
		System.out.println("");
		for(int i=0; i<n; i++) {
		System.out.print(elem);
		}
		num++;
		}
		
	}

}
