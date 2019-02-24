package EjerciciosEntradaSalida;
import java.util.Scanner;
public class ampliacion2 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		System.out.println("introduzca año nacimiento");
		int variable;
		int añonacimiento;
		añonacimiento=teclado.nextInt();
		
		int edad;		
		int añoactual = 2018;
		edad=añoactual - añonacimiento;
		
		System.out.println(añoactual);
		System.out.println(añonacimiento);
		System.out.print(edad);
	}
}
