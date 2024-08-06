package IF;

public class cambiovaribela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int variable= 35;
    int variable2=20;
    int aux;
    System.out.println("variable inicio"+ variable);
    System.out.println("variable2 "+ variable2);
     System.out.println("");
     //20    /20
     aux=variable2;
     //35          //35 
     variable2=variable;
     //20       20
     variable=aux;
     
         System.out.println("variable final"+ variable);
         System.out.println("variable2 "+ variable2);
     
     }

}
