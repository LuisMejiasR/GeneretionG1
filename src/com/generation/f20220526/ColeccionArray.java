package com.generation.f20220526;

import java.util.Arrays;
import java.util.Iterator;

public class ColeccionArray {

	public static void main(String[] args) {
		// Array ESTATICOS, fijos
		String[] colores = {"red","blue","yellow","orange","black"};
		Integer[] numerosPares= {2,4,6,8,10,12};//{2,4,6,14,10,12};
		int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,0};
		
		//posicion inical es cero (0)
		System.out.println(colores[0]);
		System.out.println(numerosPares[0]);
		System.out.println(primerosNumeros[0]);
		
		//nombreArray[posicion]-> accediendo al elemento del arreglo en esa posicion
		System.out.println(numerosPares[3]);//8
		
		numerosPares[3] = 14;//modificando el elemto en esa posicion
		System.out.println(numerosPares[3]);//14
		
		//numerosPares[6] = 14;//Error fuera de indice, 
		//no podemos agregar por posicion si no existe un elemento
		
		System.out.println("tamaño array colores "+ colores.length);
		System.out.println("tamaño array numeros pares "+ numerosPares.length);
		
		System.out.println(colores.toString());
		System.out.println(numerosPares.toString());
		System.out.println(primerosNumeros.toString());
		
		//imprimir el contenido del arreglo
		System.out.println(Arrays.toString(colores));
		System.out.println(Arrays.toString(numerosPares));
		System.out.println(Arrays.toString(primerosNumeros));
		
		//recorrer un arreglo
		for (int i = 0; i < primerosNumeros.length; i++) {
			System.out.println(primerosNumeros[i]+" ");
		}
		System.out.println("\n");
		
		//foreach
		for (int elemento : primerosNumeros) {//{1,2,3,4,5,6,7,8,9,0};
			//int elemento=0;
			System.out.println(elemento);
		}
		
		for(String color : colores) {//{"red","blue","yellow","orange","black"};
			System.out.print(color+" ");
		}
		
		

	}

}
