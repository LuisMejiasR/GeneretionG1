package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		//capturar el ingreso por consola
		Scanner sc = new Scanner(System.in);
		
		// validar la mayoria de edad,
		//establecer punto critico -> 18 años
		
		int mayoriaEdad = 18;
		
		//solicitar el ingreso de edad
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();//captutando el ingreso por consola
		String nombre= sc.nextLine();
		if(edad >= mayoriaEdad) {
			System.out.println("Usted es mayor de edad");
			
			System.out.println("Ingrese saldo");
			Integer saldo = sc.nextInt();
			
			
			
		}else {
			System.out.println("No esta permitido su ingreso");
		}
		/* 
		 * Solicitar todos los string
		 * nombre, apellido, direccion
		 * Solicitar los numero
		 * edad, numeroDireccion
		 * Saldo ($) 50000 minimo en bolsillo, 
		 * 
		 * Validar
		 * Mayoria de edad, 
		 * el saldo, no puede realizar apuestas
		 * 
		 * preguntar y validar: cuanto apostara, minimo apuesta $10000
		 *
		 */
		
		

	}

}
