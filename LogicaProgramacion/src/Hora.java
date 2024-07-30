import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		// 20. Pedir una hora de la forma hora, minutos y segundos,
		//y mostrar la hora en el segundo siguiente.
		int hora, min, segundos;
		Scanner entrada= new Scanner(System.in);
		System.out.println("agrega la hora ");
		hora= entrada.nextInt();
		System.out.println("agrega la min ");
		min= entrada.nextInt();
		System.out.println("agrega la seg ");
		segundos= entrada.nextInt();
		if(segundos>=60)
		segundos=0+1;
		else
			segundos=segundos+1;
		System.out.println("la seg " +segundos);
		
	}

}
