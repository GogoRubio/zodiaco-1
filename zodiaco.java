package prolog;

import java.awt.JobAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class zodiaco {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String nombre,apellido;
		int edad,noControl,dia,mes,año;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  Scanner sc = new Scanner(System.in);
				  
		System.out.println("Ingrese Nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Ingrese Apellidos");
		apellido = sc.nextLine();
		
		
		System.out.println("Ingrese Edad");
		edad = sc.nextInt(); 
		
		
		System.out.println("Ingrese No.Control");
		noControl= sc.nextInt(); 
		
		System.out.println("Ingrese dia");
		dia = sc.nextInt(); 
		
		System.out.println("Ingrese mes");
		mes = sc.nextInt(); 
		
		System.out.println("Ingrese año");
		año = sc.nextInt(); 



}}