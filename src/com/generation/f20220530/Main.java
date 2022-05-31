package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

import com.generation.f20220531.Cliente;

public class Main {

	public static void main(String[] args) {
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		
		// instancia de una clase
		Alumno alumno = new Alumno(); 
		Alumno alumno2 = new Alumno("Leonardo","Utreras",26,"G1");
		
		listaAlumnos.add(alumno);
		listaAlumnos.add(alumno2);
		
		
		alumno.setNombre("Diana");
		
		System.out.println(alumno.getNombre());//null
		System.out.println(alumno2.getNombre());
		
		//setter
		alumno.setNombre("Israel");
		System.out.println(alumno.getNombre());
		
		System.out.println(alumno2.toString());
		
		for (int i = 0; i < listaAlumnos.size(); i++) {
			System.out.println(listaAlumnos.get(i).getNombre());
			System.out.println(listaAlumnos.get(i).getApellido());
			System.out.println(listaAlumnos.get(i).toString());
		}
		
		for (Alumno objetoAlumno : listaAlumnos) {
			/*System.out.println(objetoAlumno.getNombre());
			System.out.println(objetoAlumno.getCurso());*/
			System.out.println(objetoAlumno.toString());
		}
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Ignacio");//asigno
		//get. consultar el dato
		System.out.println(cliente.getNombre());
	}

}
