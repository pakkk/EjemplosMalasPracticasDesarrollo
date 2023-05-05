package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio3.solucion;

/**
 * Programado todo al inglés (Clase Chalé) exceptuando comentarios que muestren algún detalle particular del código
 * 
 * @author Paco Benítez
 */
public class Chalet extends Property implements Comparable<Property>
{
	/** Attribute - Swimming Pool */
	private boolean swimmingPool ;
	
	/** Attribute - Park */
	private boolean park ;

	/**
	 * @param identifier   with the identifier
	 * @param roomsNumber  with the rooms number
	 * @param electricity  as true if this property has electricity
	 * @param water		   as true if this property has water
	 * @param swimmingPool as true if this chalet has a swimming pool
	 * @param park		   as true if this chalet has a park
	 */
	public Chalet(String identifier, int roomsNumber, boolean electricity, boolean water, boolean swimmingPool, boolean park)
	{	
		// Super call
		super(identifier, roomsNumber, electricity, water) ;
		
		this.swimmingPool = swimmingPool ;
		this.park 		  = park ;
	}

	/**
	 * @return the swimmingPool
	 */
	public boolean isSwimmingPool()
	{
		return this.swimmingPool ;
	}

	/**
	 * @return the park
	 */
	public boolean isPark()
	{
		return this.park ;
	}

	/**
	 * @param swimmingPool the swimmingPool to set
	 */
	public void setSwimmingPool(boolean swimmingPool)
	{
		this.swimmingPool = swimmingPool ;
	}

	/**
	 * @param park the park to set
	 */
	public void setPark(boolean park)
	{
		this.park = park ;
	}
	
	/**
	 * @return the String related to this object
	 */
	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder() ;
		
		stringBuilder.append(super.toString()) ; // Super call
		stringBuilder.append(Constants.CHALET_STR_PREFIX_AND_SWIMMING_POOL) ;
		stringBuilder.append(this.swimmingPool) ;
		stringBuilder.append(Constants.CHALET_STR_PARK) ;
		stringBuilder.append(this.park) ;
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
		else if (!super.equals(object))
		{
			return false ;
		}
		else if (object == null)
		{
			return false ;
		}
		else if (!(object instanceof Chalet))
		{
			return false ;
		}
		
		Chalet other = (Chalet) object ;

		if (this.swimmingPool != other.swimmingPool)
		{
			return false ;
		}
		else if (this.park != other.park)
		{
			return false ;
		}
		
		return true ;
	}
	
	/**
	 * @param chalet with an input chalet to be compared with this object
	 * @return 0 if the argument Chalet is equal to this Chalet; 
	 * < 0 if this Chalet is less than the Chalet argument; 
	 * > 0 if this Chalet is greater than the Chalet argument.
	 */
	public int compareTo(Chalet chalet)
	{
		// Super call
		int outcome = super.compareTo(chalet) ;
		
		// Si se compararon los objetos en super y son iguales, tendré que comprobar si en esta clase hija siguen siendo iguales
		if (outcome == 0)
		{
			// Comparamos los valores de la piscina
			outcome = this.compareToSwimmingPool(chalet) ;
			
			if (outcome == 0)
			{
				// Comparamos los valores del parque
				outcome = this.compareToPark(chalet) ;
			}
		}

		return outcome ;
	}
	
	/**
	 * @param chalet with an input chalet to be compared with this object
	 * @return 0 if the argument Chalet is equal to this Chalet; 
	 * < 0 if this Chalet is less than the Chalet argument; 
	 * > 0 if this Chalet is greater than the Chalet argument.
	 */
	private int compareToSwimmingPool(Chalet chalet)
	{
		int outcome = 0 ;
			
		// Considero que si los dos objetos son iguales, el outcome = 0
		if (this.swimmingPool == chalet.isSwimmingPool())
		{
			outcome = 0 ;
		}
		// Si este objeto (this) no tiene piscina (false) y el objeto como parámetro de entrada sí (true), entonces este objeto (this) será más pequeño
		else if (!this.swimmingPool && chalet.isSwimmingPool())
		{
			outcome = -1 ;
		}
		// Si este objeto (this) tiene piscina (true) y el objeto como parámetro de entrada no (false), entonces este objeto (this) será más grande
		else if (this.swimmingPool && !chalet.isSwimmingPool())
		{
			outcome = 1 ;
		}
		
		return outcome ;
	}
	
	/**
	 * @param chalet with an input chalet to be compared with this object
	 * @return 0 if the argument Chalet is equal to this Chalet; 
	 * < 0 if this Chalet is less than the Chalet argument; 
	 * > 0 if this Chalet is greater than the Chalet argument.
	 */
	private int compareToPark(Chalet chalet)
	{
		int outcome = 0 ;
		
		// Considero que si los dos objetos son iguales, el outcome = 0
		if (this.park == chalet.isPark())
		{
			outcome = 0 ;
		}
		// Si este objeto (this) no tiene piscina (false) y el objeto como parámetro de entrada sí (true), entonces este objeto (this) será más pequeño
		else if (!this.park && chalet.isPark())
		{
			outcome = -1 ;
		}
		// Si este objeto (this) tiene piscina (true) y el objeto como parámetro de entrada no (false), entonces este objeto (this) será más grande
		else if (this.park && !chalet.isPark())
		{
			outcome = 1 ;
		}
		
		return outcome ;
	}
}
