package com.generation.f20220524;

public class CalculoPromedio {

	public static void main(String[] args) {
		//int cantidadNotas = 12;
		//arreglo notas
		Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};
		
		//variable acumualdora
		int sumaNotas = 0;//20
		
		//como recorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {//i=0
							
			sumaNotas = sumaNotas + notas[i];//accedemoa a los valores notas[i]
		}
		
		System.out.println("suma de notas: " + sumaNotas);
		
		//promedio-> suma todas las notas / cantidad de notas;
		float promedio = sumaNotas / notas.length;
		/* TODO validar el orden >= */
		//101
		
		//PUNTO CRITICO
		//0>=reprobado<50; 50>=Aprobado<=100
		if(promedio >= 50 && promedio <= 100) {
			System.out.println("Alumno aprobado");
		}else if(promedio >= 0 && promedio < 50) {
			System.out.println("Alumno Reprobado");
		}else {
			System.out.println("Error en el calculo del promedio");
		}
		
	}
}
