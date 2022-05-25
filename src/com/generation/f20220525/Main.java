package com.generation.f20220525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("********************** Inicio **********************\n");
		//Definicion de Variables
		int inferior;
		int superior;
		int numero;
		int suma = 0;
		int contador = 0;
		int igualLimite = 0;
		boolean esLimite = false;

		//Ingreso de limites
		System.out.print("Introduce el límite superior: ");
		superior = scanner.nextInt();

		do {
			System.out.print("Introduce el límite inferior: ");
			inferior = scanner.nextInt();

			if (inferior > superior) {
				System.out.println(
						"Error, el límite inferior debe ser menor que el superior.\n");
			}
		} while (inferior > superior);
		System.out.println("***************************************************\n");
		// Ingreso de números
		do {
			System.out.println("Introduce un número, o 0 para salir");
			numero = scanner.nextInt();

			if (numero != 0) {
				//Suma números dentro del rango
				if (numero > inferior && numero < superior) {
					suma += numero;
				} else if (numero <= inferior || numero >= superior) {
					//cantidad de números fuera del rango
					contador++;
				}
				if (numero == inferior || numero == superior) {
					//cantidad de números igual a algun limite
					esLimite = true;
					igualLimite++;
				}
			}
		} while (numero != 0);//si es cero, sale del Do While

		// Al introducir 0, termina y mostramos resultados
		System.out.println("********************** Resultados **********************");
		System.out.println("La suma de los números introducidos en el rango [" + inferior + " - " + superior
				+ "] es de " + suma);
		System.out.println("Se han introducido un total de " + contador + " números fuera del rango ");
		if (esLimite) {
			System.out.println(igualLimite +
					" números introducidos iguales con alguno de los límites del rango");
		} else {
			System.out.println("No existen números igual a los límites del rango");
		}
		System.out.println("********************** Fin ***************************************");
		
		scanner.close();//cierre del Scanner
	}

}
