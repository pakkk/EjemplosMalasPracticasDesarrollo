package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio2.problema;

public class Employee extends Person
{
	private String phoneNumber;
	private String email;
	private int departmentId ;
	private String departmentName ;
	private Supervisor supervisor ;
	
	public void sayWhereYouWork()
	{
		this.sayHello() ;
		System.out.println("Working in the department id: " + departmentId + " and name: " + departmentName);
	} 
	
	public void sayHello()
	{
		System.out.println("Hi, my name is " + name + " and my id is: " + dni);
	}
}
