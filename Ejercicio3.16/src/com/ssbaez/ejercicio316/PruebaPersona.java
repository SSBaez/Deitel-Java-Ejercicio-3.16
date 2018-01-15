package com.ssbaez.ejercicio316;

import java.util.Scanner;

public class PruebaPersona {
	
	public static void main(String[] args){
		
		String name;
		String lastName;
		int    day;
		int    month;
		int    year;
		
		Scanner input = new Scanner(System.in);
		FrecuenciasCardiacas frecc = new FrecuenciasCardiacas("John", "Doe", 27, 10, 1975);
		
		System.out.println("Persona 1");
		System.out.printf("Nombre: %s %s", frecc.getName(), frecc.getLastName());
		frecc.edadPersona();
		frecc.frecMaxPersona();
		frecc.frecEspPersona();
		
		System.out.println("\n\nIngrese Datos de Persona 2");
		System.out.print("Nombre: ");
		name = input.nextLine();
		frecc.setName(name);
		System.out.print("Apellido: ");
		lastName = input.nextLine();
		frecc.setLastName(lastName);
		System.out.println("Fecha de Nacimiento (DD/MM/YYYY)");
		System.out.print("Dia: ");
		day = input.nextInt();
		frecc.setDay(day);
		System.out.print("Mes: ");
		month = input.nextInt();
		frecc.setDay(month);
		System.out.print("Agno: ");
		year = input.nextInt();
		frecc.setYear(year);
		
		System.out.println("\nPersona 2");
		System.out.printf("Nombre: %s %s", frecc.getName(), frecc.getLastName());
		frecc.edadPersona();
		frecc.frecMaxPersona();
		frecc.frecEspPersona();
		
		
		
	}

}
