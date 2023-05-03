package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio2.solucion_paco;

/**
 * @author Paco Benítez
 */
public class Department
{
	/** Attribute - Department Identifier */
	public int identifier ;
	
	/** Attribute - Department Name */
	public String name ;

	/**
	 * @param identifier with the identifier
	 * @param name		 with the name
	 */
	public Department(int identifier, String name)
	{
		this.identifier = identifier ;
		this.name 		= name ;
	}

	/**
	 * @return the identifier
	 */
	public int getIdentifier()
	{
		return this.identifier ;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name ;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(int identifier)
	{
		this.identifier = identifier;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
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
		Department other = (Department) object ;
		
		if (this.identifier != other.identifier)
		{
			return false ;
		}
		else if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name)))
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
		
		stringBuilder.append(Constants.DEPARTMENT_STR_PREFIX_AND_IDENTIFIER) ;
		stringBuilder.append(this.identifier) ;
		stringBuilder.append(Constants.DEPARTMENT_STR_NAME) ;
		stringBuilder.append(this.name) ;
		stringBuilder.append(Constants.STR_CLOSE_BRACKET) ;
		
		return stringBuilder.toString() ;
	}

	/**
	 * Print the department information
	 */
	public void sayWhereYouWork()
	{
		System.out.println("Working in the department id: " + this.identifier + " and name: " + this.name);		
	}
}