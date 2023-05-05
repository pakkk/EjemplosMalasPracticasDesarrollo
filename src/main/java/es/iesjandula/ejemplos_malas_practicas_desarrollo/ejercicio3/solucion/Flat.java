package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio3.solucion;

/**
 * Programado todo al inglés (Clase Piso) exceptuando comentarios que muestren algún detalle particular del código
 * 
 * @author Paco Benítez
 */
public class Flat extends Property implements Comparable<Property>
{
	/** Attribute - Floors Number */
	private int floorsNumber ;
	/** Attribute - Neighbors number */
	private int neighborsNumber ;
	
	/**
	 * @param identifier  	  with the identifier
	 * @param roomsNumber 	  with the rooms number
	 * @param electricity 	  as true if this property has electricity
	 * @param water		  	  as true if this property has water
	 * @param floorsNumber	  with the floor number
	 * @param neighborsNumber with neighbors number
	 */
	public Flat(String identifier, int roomsNumber, boolean electricity, boolean water, int floorsNumber, int neighborsNumber)
	{
		// Super call
		super(identifier, roomsNumber, electricity, water) ;
		
		this.floorsNumber 	 = floorsNumber ;
		this.neighborsNumber = neighborsNumber ;
	}

	/**
	 * @return the floorsNumber
	 */
	public int getFloorsNumber()
	{
		return this.floorsNumber ;
	}

	/**
	 * @return the neighborsNumber
	 */
	public int getNeighborsNumber()
	{
		return this.neighborsNumber ;
	}

	/**
	 * @param floorsNumber the floorNumber to set
	 */
	public void setFloorsNumber(int floorsNumber)
	{
		this.floorsNumber = floorsNumber ;
	}

	/**
	 * @param neighborsNumber the neighborsNumber to set
	 */
	public void setNeighborsNumber(int neighborsNumber)
	{
		this.neighborsNumber = neighborsNumber ;
	}

	/**
	 * @return the String related to this object
	 */
	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder() ;
		
		stringBuilder.append(super.toString()) ; // Super call
		stringBuilder.append(Constants.FLAT_STR_PREFIX_AND_FLOORS_NUMBER) ;
		stringBuilder.append(this.floorsNumber) ;
		stringBuilder.append(Constants.FLAT_STR_NEIGHBORS_NUMBER) ;
		stringBuilder.append(this.neighborsNumber) ;
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
		else if (!super.equals(object)) // Super call
		{
			return false ;
		}
		else if (object == null)
		{
			return false ;
		}
		else if (!(object instanceof Flat))
		{
			return false ;
		}
		
		Flat other = (Flat) object ;

		if (this.floorsNumber != other.floorsNumber)
		{
			return false ;
		}
		else if (this.neighborsNumber != other.neighborsNumber)
		{
			return false ;
		}
		
		return true ;
	}
	
	/**
	 * @param flat with an input flat to be compared with this object
	 * @return 0 if the argument Flat is equal to this Flat; 
	 * < 0 if this Flat is less than the Flat argument; 
	 * > 0 if this Flat is greater than the Flat argument.
	 */
	public int compareTo(Flat flat)
	{
		// Super call
		int outcome = super.compareTo(flat) ;
		
		// Si se compararon los objetos en super y son iguales, tendré que comprobar si en esta clase hija siguen siendo iguales
		if (outcome == 0)
		{
			outcome = this.floorsNumber - flat.getFloorsNumber() ;
			
			if (outcome == 0)
			{
				outcome = this.neighborsNumber - flat.getNeighborsNumber() ;
			}
		}

		return outcome ;
	}
}
