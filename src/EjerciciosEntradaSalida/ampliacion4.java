package EjerciciosEntradaSalida;
import java.util.Scanner;
public class ampliacion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		
		int metroscuadradoshab1;
		int largohab1;
		int anchohab1;
		int preciohab1;
		System.out.println("HABITACION 1");
		largohab1=teclado.nextInt();
		anchohab1=teclado.nextInt();
		System.out.println("introduzca largo de la habitacion 1");
		System.out.println("introduzca ancho de la habitacion 1");
	    System.out.println(metroscuadradoshab1=largohab1 * anchohab1);
	    System.out.println(preciohab1=metroscuadradoshab1 * 30);
	    System.out.println("la hanitacion 1 cuesta  "+ preciohab1+"  euros");
	    
	    int metroscuadradoshab2;
		int largohab2;
		int anchohab2;
		int preciohab2;
		System.out.println("HABITACION 2");
		largohab2=teclado.nextInt();
		anchohab2=teclado.nextInt();
		System.out.println("Introduzca largo de la habitacion 2");
		System.out.println("Introduzca ancho de la habitacion 2");
		System.out.println(metroscuadradoshab2=largohab2 * anchohab2);
		System.out.println(preciohab2=metroscuadradoshab2 * 30);
		System.out.println("la habitacion 2 cuesta  "+ preciohab2+"  euros");
		
        int metroscuadradoshab3;
		int largohab3;
		int anchohab3;
		int preciohab3;
		System.out.println("HABITACION 3");
		largohab3=teclado.nextInt();
		anchohab3=teclado.nextInt();
		System.out.println("introduzca largo de la habitacion 3");
		System.out.println("introduzca ancho de la habitacion 3");
	    System.out.println(metroscuadradoshab3=largohab3 * anchohab3);
	    System.out.println(preciohab3=metroscuadradoshab3 * 30);
	    System.out.println("la hanitacion 3 cuesta"+ preciohab3);
		
	    int preciototal;
	    System.out.println(preciototal=preciohab1 + preciohab2 + preciohab3);
	    System.out.println("El precio total de su presupuesto asciende a"+ preciototal+"  euros");;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
