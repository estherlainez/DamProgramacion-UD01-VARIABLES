package EjerciciosEntradaSalida;
import java.util.Scanner;
public class ampliacion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
	    double euro;
		double libra;
		double dolar;
		euro=teclado.nextDouble();
		dolar=euro * 1.16;
		libra=euro * 0.89;
		System.out.println("introduzca valor en euros");
		System.out.print(euro+"\t"+dolar+"\t"+libra);
	}

}
