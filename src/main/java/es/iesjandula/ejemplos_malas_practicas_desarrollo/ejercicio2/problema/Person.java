package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio2.problema;

import java.util.List;

public class Person
{
	protected String dni ;
	protected String name;
	protected int age;
	protected String address;
	protected List<Person> children ;
	
	public void createChildren(String dni1, String name1, int age1, String address1)
	{
		Person person = new Person() ;
		
		person.dni     = dni1 ;
		person.name    = name1 ;
		person.age     = age1 ;
		person.address = address1 ;
		
		children.add(person) ;
	}
}
