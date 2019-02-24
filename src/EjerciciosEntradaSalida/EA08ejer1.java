
package EjerciciosEntradaSalida;
import java.util.Scanner;

public class EA08ejer1 {	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduzca tu nombre");
		String minombre; 
		minombre=teclado.nextLine();

		System.out.println("Introduzca su direccion");
		String midireccion;
		midireccion=teclado.nextLine();
		
		System.out.println("Introduzca su numero de telefono");
		String mitelefono;
		mitelefono=teclado.nextLine();
		
		System.out.println(minombre);
		System.out.println(midireccion);
		System.out.println(mitelefono);
		
		teclado.close();
		
	}

}
