package es.studium.ComparaT2;

import java.util.Scanner;

public class ComparaT2 {


	public static void main(String[] args) {
		String cadena1;
		String cadena2;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena1=teclado.next();

		System.out.println("Dame otra cadena");
		cadena2=teclado.next();
		if(cadena1.length()==cadena2.length())
		{
			System.out.println("Son iguales");
		}
		else if(cadena1.length()<cadena2.length())
		{
			System.out.println("La cadena 1 es la m�s peque�a");
		}
		else 
		{
			System.out.println("La cadena2 es la m�s peque�a");
		}
		teclado.close();
	}
}
