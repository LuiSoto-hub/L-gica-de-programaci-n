package BuclesAnidados;

public class BucleAnidado3 {

	public static void main(String[] args) {
		/*3. Diseña una aplicación que muestre las tablas
		 *  de multiplicar del 1 al 10.*/ 
		int num=1, tab=1;
		System.out.println("____________________________");			
		for(num=1; num<=10; num++) {
			for(tab=1; tab<=10; tab++) {
				System.out.println(num+"*"+tab+"="+num*tab);

			}
			System.out.println("____________________________");			
		}
	}

}
