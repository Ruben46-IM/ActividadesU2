package com;
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mete un número y te diré si es par o impar");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
			
			
		}
		
		
		
		

	}

}
