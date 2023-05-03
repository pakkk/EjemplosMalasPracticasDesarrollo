package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio2.solucion_paco;

/**
 * @author Paco Benítez
 */
public class Company // extends Employee --> Quitamos esta herencia ya que no tiene sentido
{
	/** Attribute - Name */
	private String name ;
	
	/** Attribute - CIF */
	private String cif ;
	
	/** Attribute - Address */
	private String address ;
		
	/**
	 * @param name	  with the name
	 * @param cif	  with the CIF
	 * @param address with the address
	 */
	public Company(String name, String cif, String address)
	{
		this.name 	 = name ;
		this.cif 	 = cif ;
		this.address = address ;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name ;
	}
	
	/**
	 * @return the cif
	 */
	public String getCif()
	{
		return this.cif ;
	}

	/**
	 * @return the address
	 */
	public String getAddress()
	{
		return this.address ;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name ;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif)
	{
		this.cif = cif ;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address)
	{
		this.address = address ;
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
		Company other = (Company) object ;
		
		if ((this.address == null && other.address != null) || (this.address != null && !this.address.equals(other.address)))
		{
			return false ;
		}
		else if ((this.cif == null && other.cif != null) || (this.cif != null && !this.cif.equals(other.cif)))
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
		
		stringBuilder.append(Constants.COMPANY_STR_PREFIX_AND_NAME) ;
		stringBuilder.append(this.name) ;
		stringBuilder.append(Constants.COMPANY_STR_CIF) ;
		stringBuilder.append(this.cif) ;
		stringBuilder.append(Constants.COMPANY_STR_ADDRESS) ;
		stringBuilder.append(this.address) ;
		stringBuilder.append(Constants.STR_CLOSE_BRACKET) ;
		
		return stringBuilder.toString() ;
	}

	/**
	 * Print greetings
	 */
	public void greetings()
	{
		System.out.println("Hi, there! We are the company " + this.name + " and our address is: " + this.address + " (" + this.cif + ")") ;
	}
}
