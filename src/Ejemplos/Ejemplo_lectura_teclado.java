package Ejemplos;
import java.util.Scanner;//Indico a mi programa que voy a usar la 
//libreria Scanner para leer desde teclado
public class Ejemplo_lectura_teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//aqui preparo mi programa para leer desde teclado. solo 1 vez en el programa		
		Scanner teclado = new Scanner (System.in);
		//crear la variable que me representa 
			//el buffer del teclado.
			//usar esta linea cuando quiera leer datos desde el teclado
		

		//voy a leer un dato desde el teclado
		//si es string
		System.out.println("Introduzca tu nombre");
		String minombre; //creo una variable de tipo string
		minombre=teclado.nextLine();//le asigno el valor escrito por teclado
		
		//si es un entero
		System.out.println("Introduzca un entero");
		int numero;//creo una variable de tipo entero
		numero=teclado.nextInt();//le asigno el valor entero del teclado
		
		//si es un double
		System.out.println("Introduzca un numero decimal");
		double decimal;
		decimal=teclado.nextDouble();//le asigno el valor decimal del teclado
		System.out.println("mi nombre es:");
		System.out.println(minombre);
		System.out.println("El numero leido por teclado es:"+numero);
		
		
	}

}
