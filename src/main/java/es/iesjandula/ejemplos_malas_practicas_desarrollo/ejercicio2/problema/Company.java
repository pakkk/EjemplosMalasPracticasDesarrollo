package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio2.problema;

public class Company extends Employee
{
	protected String name ;
	protected String cif ;
	protected String address ;
	
	public void greetings()
	{
		System.out.println("Hi, there! We are the company " + name + " and our address is: " + address + " (" + cif + ")");
	}
}
