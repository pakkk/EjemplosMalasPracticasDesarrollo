package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio3.solucion;

/**
 * Programado todo al inglés (Clase Inmueble) exceptuando comentarios que muestren algún detalle particular del código
 * 
 * @author Paco Benítez
 *
 */
public class Property implements Comparable<Property>
{
	/** Attribute - Identifier */
	private String identifier ;
	
	/** Attribute - Rooms number */
	private int roomsNumber ;
	
	/** Attribute - Electricity */
	private boolean electricity ;
	
	/** Attribute - Water */
	private boolean water ;
	
	/**
	 * @param identifier  with the identifier
	 * @param roomsNumber with the rooms number
	 * @param electricity as true if this property has electricity
	 * @param water		  as true if this property has water
	 */
	public Property(String identifier, int roomsNumber, boolean electricity, boolean water)
	{
		this.identifier  = identifier ;
		this.roomsNumber = roomsNumber ;
		this.electricity = electricity ;
		this.water 		 = water ;
	}
	
	/**
	 * @return the identifier
	 */
	public String getIdentifier()
	{
		return this.identifier ;
	}

	/**
	 * @return the roomsNumber
	 */
	public int getRoomsNumber()
	{
		return this.roomsNumber ;
	}

	/**
	 * @return the electricity
	 */
	public boolean isElectricity()
	{
		return this.electricity ;
	}

	/**
	 * @return the water
	 */
	public boolean isWater()
	{
		return this.water ;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(String identifier)
	{
		this.identifier = identifier ;
	}

	/**
	 * @param roomsNumber the roomsNumber to set
	 */
	public void setRoomsNumber(int roomsNumber)
	{
		this.roomsNumber = roomsNumber ;
	}

	/**
	 * @param electricity the electricity to set
	 */
	public void setElectricity(boolean electricity)
	{
		this.electricity = electricity ;
	}
	
	/**
	 * @param water the water to set
	 */
	public void setWater(boolean water)
	{
		this.water = water ;
	}
	
	/**
	 * @return the String related to this object
	 */
	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder() ;
		
		stringBuilder.append(Constants.PROPERTY_STR_PREFIX_AND_IDENTIFIER) ;
		stringBuilder.append(this.identifier) ;
		stringBuilder.append(Constants.PROPERTY_STR_ROOMS_NUMBER) ;
		stringBuilder.append(this.roomsNumber) ;
		stringBuilder.append(Constants.PROPERTY_STR_ELECTRICITY) ;
		stringBuilder.append(this.electricity) ;
		stringBuilder.append(Constants.PROPERTY_STR_WATER) ;
		stringBuilder.append(this.water) ;
		stringBuilder.append(Constants.STR_CLOSE_BRACKET) ;
		
		return stringBuilder.toString() ;
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
		else if (!(object instanceof Property))
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
		Property other = (Property) object ;
		
		if ((this.identifier == null && other.identifier != null) || (this.identifier != null && !this.identifier.equals(other.identifier)))
		{
			return false ;
		}
		else if (this.roomsNumber != other.roomsNumber)
		{
				return false ;
		}
		else if (this.electricity != other.electricity)
		{
				return false ;
		}
		else if (this.water != other.water)
		{
				return false ;
		}

		return true ;
	}
	
	/**
	 * @param property with an input property to be compared with this object
	 * @return 0 if the argument Property is equal to this Property; 
	 * < 0 if this Property is less than the Property argument; 
	 * > 0 if this Property is greater than the Property argument.
	 */
	public int compareTo(Property property)
	{
		int outcome = 0 ;
		
		// Considero que solo existen identificadores únicos, por lo que solo comparo por este campo
		if (this.identifier != null && property.getIdentifier() != null) // Hago esta comparación para evitar NullPointers
		{
			outcome = this.identifier.compareTo(property.getIdentifier()) ;
		}
		// Considero que si sucede que el identificador de esta clase es null, este objeto será más pequeño que el otro
		else if (this.identifier == null)
		{
			outcome = -1 ;
		}
		// Si entro por aquí es porque el objeto de entrada "property" es null, luego considero que this es mayor que el objeto "property"
		else
		{
			outcome = 1 ;
		}

		return outcome ;
	}
}
