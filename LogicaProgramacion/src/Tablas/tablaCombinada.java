package Tablas;

import java.util.Scanner;

public class tablaCombinada {

	public static void main(String[] args) {
// 6. Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la 
//forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
		   Scanner Entrada= new Scanner(System.in); 
		int a[], b[], c[];
	        int i,j;
	        a=new int[12];
	        b=new int[12];
	        // la tabla c tendrá que tener el doble de tamaño que a y b.
	        c = new int [24];
	      
	        System.out.println("Leyendo la tabla a");
	        for (i=0;i<12;i++){
	            System.out.print("número: ");
	            a[i]=Entrada.nextInt();
	        }
	        // leemos la tabla b
	        System.out.println("Leyendo la tabla b");
	        for (i=0;i<12;i++){
	            System.out.print("número: ");
	            b[i]=Entrada.nextInt();
	        }
	        
	        j=0;
	        for (i=0;i<12;i++){
	            c[j]=a[i];
	            j++; 
	            c[j]=b[i];
	            j++;
	        }
	        System.out.println("La tabla c queda: ");
	        for (j=0;j<24;j++) 
	            System.out.print(c[j]+"  ");
	        
	        System.out.println("");
	    
		
		
		
		
		
		
	}

}
