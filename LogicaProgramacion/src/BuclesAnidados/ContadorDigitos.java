package BuclesAnidados;

public class ContadorDigitos {

	public static void main(String[] args) {
		/*Necesitamos mostrar un contador con 
		 * 5 dígitos (X-X-X-X-X), que muestre 
		 * los números del 0-0-0-0-0 al 9-9-9-9-9, 
		 * con la particularidad que cada vez que 
		 * aparezca un 3 lo sustituya por una E.*/ 
		
		int contador=0, x1=0,x2=0;
		for(int i=0;i<=10;i++) {
			if(i==10) {
				i=1;
				x1=i;
			}
			if(i>10 && i<20)
			x1=i;
			System.out.println(x1+"-"+ i);
			
		}
	}

}
