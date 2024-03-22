package tic;

public class Persona {

	

	protected String nombre ;
	protected int edad ;
	
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	


	

	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
public void responderpreguntas() {
		
		
		System.out.println( "1. Cual es la diferencia entre una clase `Persona` y una clase `Empleado` en terminos de atributos y metodos?");
		
		System.out.println("La clase Perona es la super calse de empleado, por lo cual empleado tiene los mismos atributos que persona mas los que se le agregen");
		System.out.println("");
		System.out.println("  2. Como se establece la relacion de herencia entre `Empleado` y `Persona` en Java?");
		System.out.println("Al heredar de la super clase persona , Empleado lleva sus mismos atributos ");
		System.out.println("");
		System.out.println("  3. Que es un constructor en Java y cual es su proposito?");
		System.out.println("Un constructor crea los atributos y pone sus valores en defecto");
		System.out.println("");
		System.out.println (" 4. Por que es util utilizar la herencia en la programacion orientada a objetos?");
		System.out.println("Para no tener que declarar otra vez los atributos que se utilizaran en distintas clases");
		System.out.println("");
		System.out.println ("  5. Como se llama el proceso de crear un objeto a partir de una clase en Java?");
		System.out.println("el nombre es instanciar");
		
		}
	
	

}
