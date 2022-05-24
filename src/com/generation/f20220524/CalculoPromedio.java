package com.generation.f20220524;

public class CalculoPromedio {

	public static void main(String[] args) {
		// int cantidadNotas = 12;
		// arreglo notas
		Integer[] notas = { -20, -50, 67, -99, 10, -10, 18, 707, 58, 709, 33, 50 };

		// variable acumualdora
		int sumaNotas = 0;// 20
		int notasFueraDeRango = 0;

		// como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {// i=0
			// validar la nota (negativa o mayor a 100)
			if (notas[i] < 0 || notas[i] > 100) {
				System.out.println("la nota:" + notas[i] + " en la posicion " + (i + 1) + ", esta fuera de rango");
				notasFueraDeRango++;
			}

			sumaNotas = sumaNotas + notas[i];// accedemos a los valores notas[i]
		}

		if (notasFueraDeRango == 0) {// no hay notas fuera de rango

			// promedio-> suma todas las notas / cantidad de notas;
			float promedio = sumaNotas / notas.length;

			// PUNTO CRITICO
			// 0>=reprobado<50; 50>=Aprobado<=100
			if (promedio >= 50 && promedio <= 100) {

				System.out.println("Alumno aprobado");
				System.out.println("\nEl promedio es: " + promedio);
			} else if (promedio >= 0 && promedio < 50) {
				System.out.println("Alumno Reprobado");
				System.out.println("\nEl promedio es: " + promedio);
			} else {
				System.out.println("Error en el calculo del promedio");
			}
		} else {
			System.out.println("Favor revisar notas");
		}

	}
}
