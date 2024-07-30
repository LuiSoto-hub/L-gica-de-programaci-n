package For;

import java.util.Scanner;

public class imparFor {

	public static void main(String[] args) {
		/*
		 * 11. Diseñar un programa que muestre el 
		 * producto de los 10 primeros números impares.
*/
		long producto=1;
		 for (int i=1; i<20; i+=2) {
			 producto=producto*i;
			 }
			 System.out.println("La multiplicación de los 10 primeros impares: " + producto);
		}
	

}
