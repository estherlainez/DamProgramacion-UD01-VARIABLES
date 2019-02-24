package EjerciciosEntradaSalida;
import java.util.Scanner;
public class EA08ejer4 {


		public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner teclado = new Scanner (System.in);


		System.out.println("introduzca numero de horas");

		int numerodehoras;

		numerodehoras=teclado.nextInt();

		int dias;

		dias=numerodehoras/24;
		System.out.println(dias);


		int semanas;
		semanas=dias/7;
		

		int diasrestantes;
		diasrestantes=dias%7;
		System.out.println(diasrestantes);

		System.out.println(numerodehoras % 24);
		System.out.print(numerodehoras+""+semanas+""+dias+""+diasrestantes);
	}

}
