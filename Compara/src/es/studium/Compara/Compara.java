package es.studium.Compara;

import java.util.Scanner;

public class Compara {



	public static void main(String[] args) {
		int num1, num2;
		num1=0;
		num2=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primero n�mero:");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		num2=teclado.nextInt();
		
		if(num1==num2)
		{
			System.out.println("Son iguales");
			
		}
		else if(num1<num2) 
		{
			System.out.println("El mayor es el segundo n�mero");
		}
		else 
		{
			System.out.println("El mayor es el primer n�mero");
		}
		
		teclado.close();
	}

}
