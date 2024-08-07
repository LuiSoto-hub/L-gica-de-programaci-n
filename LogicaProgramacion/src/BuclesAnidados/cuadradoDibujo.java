package BuclesAnidados;

import java.util.Scanner;

public class cuadradoDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada= new Scanner(System.in);
		        int n; // tamaño del lado
		        int fila, col;
		        System.out.print ("Lado del cuadrado: ");
		        n = entrada.nextInt();
		        for (fila=1; fila<=n; fila++)
		        {
		            for (col=1; col<=n; col++) 
		                System.out.print ("* ");
		            System.out.println ("");
		            
		        }
		    }
		 

	}

