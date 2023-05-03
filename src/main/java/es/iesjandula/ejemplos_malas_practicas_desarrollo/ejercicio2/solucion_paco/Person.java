package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio2.solucion_paco;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paco Benítez
 */
public class Person
{
	/** Attribute - DNI */
	private String dni ;
	
	/** Attribute - Name */
	private String name ;
	
	/** Attribute - Age */
	private int age ;
	
	/** Attribute - Address */
	private String address ;
	
	/** Attribute - Children list */
	private List<Person> children ;
		
	/**
	 * @param dni	  with the DNI
	 * @param name	  with the name
	 * @param age	  with the age
	 * @param address with the address
	 */
	public Person(String dni, String name, int age, String address)
	{
		this.dni 	  = dni ;
		this.name 	  = name ;
		this.age 	  = age ;
		this.address  = address ;
	
		// Si tengo un método más abajo que me añade hijos, simplemente aquí inicializo el array
		this.children = new ArrayList<Person>() ;
	}

	/**
	 * @return the dni
	 */
	public String getDni()
	{
		return this.dni ;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name ;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return this.age ;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return this.address ;
	}

	/**
	 * @return the children
	 */
	public List<Person> getChildren()
	{
		return this.children ;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni)
	{
		this.dni = dni ;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name ;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age ;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address ;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(List<Person> children)
	{
		this.children = children ;
	}
	
	/**
	 * @param object with the object
	 * @return true if both objects are equals
	 */
	@Override
	public boolean equals(Object object)
	{
		if (this == object)
		{
			return true ;
		}
		else if (object == null)
		{
			return false ;
		}
		else if (! (object instanceof Company))
		{
			return false ;
		}
		
		// Modularizo el método para que sea más legible el código
		return this.equalsInternal(object) ;
	}
	
	/**
	 * @param object with the object
	 * @return true if both objects are equals
	 */
	private boolean equalsInternal(Object object)
	{
		Person other = (Person) object ;
		
		if ((this.dni == null && other.dni != null) || (this.dni != null && !this.dni.equals(other.dni)))
		{
			return false ;
		}
		else if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name)))
		{
			return false ;
		}
		else if (this.age != other.age)
		{
				return false ;
		}
		else if ((this.address == null && other.address != null) || (this.address != null && !this.address.equals(other.address)))
		{
				return false ;
		}

		return true ;
	}
	
	/**
	 * @return the String related to this object
	 */
	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder() ;
		
		stringBuilder.append(Constants.PERSON_STR_PREFIX_AND_DNI) ;
		stringBuilder.append(this.dni) ;
		stringBuilder.append(Constants.PERSON_STR_NAME) ;
		stringBuilder.append(this.name) ;
		stringBuilder.append(Constants.PERSON_STR_AGE) ;
		stringBuilder.append(this.age) ;
		stringBuilder.append(Constants.PERSON_STR_ADDRESS) ;
		stringBuilder.append(this.address) ;
		stringBuilder.append(Constants.STR_CLOSE_BRACKET) ;
		
		return stringBuilder.toString() ;
	}

	/**
	 * @param childInfo with the child information
	 */
	public void createChildren(Person childInfo) // Si están enviado todos los parámetros, será mejor pasar directamente la instancia
	{	
		this.children.add(childInfo) ;
	}
	
	/**
	 * Print hello
	 */
	public void sayHello()
	{
		System.out.println("Hi, my name is " + this.name + " and my id is: " + this.dni) ;
	}
}
