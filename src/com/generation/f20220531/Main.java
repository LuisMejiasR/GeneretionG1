package com.generation.f20220531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		// instancia de cliente
		Cliente cliente = new Cliente();
		cliente.setId(1234);
		cliente.setNombre("Donato");
		cliente.setRut("123456789-0");
		
		//excepciones
		Cliente clienteDatosDinamicos = new Cliente();
		
		System.out.println("Ingrese el id de Cliente");
		//Integer id = sc.nextInt();
		String idString = sc.nextLine();
		
		try {
			Integer id = Integer.parseInt(idString);
			clienteDatosDinamicos.setId(id);
		} catch (Exception e) {
			System.out.println("No puede ingresar un letra como identificador");
		}
		
		sc.nextLine();
		
		
		
		System.out.println("Ingrese el nombre de Cliente");
		String nombre = sc.nextLine();
		clienteDatosDinamicos.setNombre(nombre);
		
		//rut
		System.out.println("Ingrese el rut de Cliente");
		String rut = sc.nextLine();
		clienteDatosDinamicos.setRut(rut);
		//correo
		System.out.println("Ingrese el correo de Cliente");
		String correo = sc.nextLine();
		clienteDatosDinamicos.setCorreo(correo);
		
		
		
		
		
		
		//arreglo de clientes
		
		
		
	}

}
