package EjerciciosEntradaSalida;
import java.util.Scanner;
public class ampliacion2 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("introduzca a�o nacimiento");
		int variable;
		int a�onacimiento;
		a�onacimiento=teclado.nextInt();
		
		int edad;		
		int a�oactual = 2018;
		edad=a�oactual - a�onacimiento;
		
		System.out.println(a�oactual);
		System.out.println(a�onacimiento);
		System.out.print(edad);
	}
}
