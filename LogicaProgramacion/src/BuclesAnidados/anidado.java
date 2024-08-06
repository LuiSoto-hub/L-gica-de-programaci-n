		/*
		 *  1. Realiza detenidamente una traza al siguiente programa 
		 *  y muestra cual seria la salida por pantalla:
		 *   PROGRAMA ej_1
		 *   VARIABLES
		 *   suma, i, j: ENTERO
		 *   COMIENZO
		 *   PARA i <- 1 HASTA 4
		 *   PARA j <- 3 HASTA 0 INC -1
		 *   suma <- i*10+j
		 *    escribir (suma)
		 *    FIN PARA
		 *    FIN PARA
 FIN*/ 
package BuclesAnidados;

public class anidado {

	public static void main(String[] args) {
		int suma=0;
		for (int i=1; i<4; i++) { 
		for(int j=3;j>0; j--) {//  PARA j <- 3 HASTA 0 INC -1. para saber el cual es el operador de comparacion hay que usar la logica de hacer funcionar el for, usamos el mayor ">" preguntamos si 3 es mayor a 0 haremos fucnionar el for    
			suma=i*10+j;
					System.out.println("suma" +suma);
			
			
		}
		}

	}

}
