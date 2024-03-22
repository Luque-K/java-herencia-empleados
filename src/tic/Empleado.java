package tic;

import java.util.Scanner;

public class Empleado extends Persona {

	private double salario ;
	private String cargo ;
	
	
	
	
	public Empleado(String nombre, int edad, double salario, String cargo) {
		super(nombre, edad);
		this.salario = salario;
		this.cargo = cargo;
	}



@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", cargo=" + cargo + ", nombre=" + nombre + ", edad=" + edad + "]";
	}



	

		
		
		
	}
	
	
	

	 
		
	

