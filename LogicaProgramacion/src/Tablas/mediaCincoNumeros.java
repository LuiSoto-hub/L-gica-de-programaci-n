package Tablas;

import java.util.Scanner;

public class mediaCincoNumeros {

	public static void main(String[] args) {
		// 3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media 
		//de los negativos y contar el número de ceros.
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int negativo=0, positivo=0, ceros=0, np=1,nn=1;
      
        for(int i=0; i<5; i++) {//este for sirve para ir agregando los numeros de nuestro array en este caso son 5
        	System.out.println("Introduce un número:");
        numeros[i] = scanner.nextInt(); 
        if(numeros[i]==0) {
        	System.out.println("el numero es 0");
        	ceros++;
        }
        if (numeros[i]<0) {
        	System.out.println("el numero es negativo");
        	negativo=negativo+numeros[i];
        	nn++;
        }else {
        	System.out.println("el numero es positivo ");
        	positivo=positivo+numeros[i];
        np++;
        }
        }
        System.out.println("la media es (positivo) " +positivo/np);
        System.out.println("la media es (negativo) " +negativo/nn);
        System.out.println("ceros"+ceros);
        
        
	}

}
