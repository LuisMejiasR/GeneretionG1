package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {

	public static void main(String[] args) {
		// ArrayList DINAMICOS
		// instancia de clase , definicion de arreglo
		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();

		// agregar un elemento a la lista
		colores.add("rojo");
		colores.add("azul");
		colores.add("azul");

		// si existe un elemento en esa posicion lo desplaza
		// a la derecha
		colores.add(2, "verde");

		// imprimir el contenido
		System.out.println(colores);

		// acceder a un elemento
		System.out.println(colores.get(2));

		// tamaño del arreglo size()
		System.out.println(colores.size());

		// modificar un elemento
		colores.set(1, "Negro");
		System.out.println(colores);

		// quitar un elemento arreglo.remove(posicion)
		colores.remove(1);
		System.out.println(colores);

		// recorrer el arreglo
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		System.out.println("**********");
		for (String color : colores) {
			System.out.println(color);
		}

		//ordenar el arreglo ascendentemente
		Collections.sort(colores);
		System.out.println(colores);
		
		// quitar todos los elementos
		colores.clear();
		System.out.println(colores);
		
		
		numerosPares.add(14);
		numerosPares.add(2);
		numerosPares.add(8);
		numerosPares.add(6);
		numerosPares.add(10);
		numerosPares.add(20);
		System.out.print(numerosPares+" ");
		
		System.out.println();
		Collections.sort(numerosPares);
		System.out.print(numerosPares+" ");
		
		System.out.println();
		//reverse no ordena descendentemente
		Collections.reverse(numerosPares);
		System.out.print(numerosPares+" ");
		
		
	}
	

}
