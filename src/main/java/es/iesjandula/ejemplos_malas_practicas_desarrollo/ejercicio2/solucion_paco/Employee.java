package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio2.solucion_paco;

/**
 * @author Paco Benítez
 */
public class Employee extends Person
{
	/** Attribute - Phone number */
	private String phoneNumber ;
	
	/** Attribute - Email */
	private String email ;
	
	/** Attribute - Department */
	private Department department ;
	
	/** Attribute - Supervisor */
	private Employee supervisor ;
		
	/**
	 * @param dni	  	  with the DNI
	 * @param name	  	  with the name
	 * @param age	  	  with the age
	 * @param address 	  with the address
	 * @param phoneNumber with the phone number
	 * @param email		  with the email
	 * @param department  with the department
	 * @param supervisor  with the supervisor
	 */
	public Employee(String dni, String name, int age, String address, String phoneNumber, String email, Department department, Employee supervisor)
	{
		// Super call
		super(dni, name, age, address) ;
		
		this.phoneNumber = phoneNumber ;
		this.email 		 = email ;
		this.department  = department ;
		this.supervisor  = supervisor ;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber()
	{
		return this.phoneNumber ;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return this.email ;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment()
	{
		return this.department ;
	}

	/**
	 * @return the supervisor
	 */
	public Employee getSupervisor()
	{
		return this.supervisor ;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber ;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email ;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department)
	{
		this.department = department ;
	}

	/**
	 * @param supervisor the supervisor to set
	 */
	public void setSupervisor(Employee supervisor)
	{
		this.supervisor = supervisor ;
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
		Employee other = (Employee) object ;
		
		if ((this.phoneNumber == null && other.phoneNumber != null) || (this.phoneNumber != null && !this.phoneNumber.equals(other.phoneNumber)))
		{
			return false ;
		}
		else if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email)))
		{
			return false ;
		}
		else if ((this.department == null && other.department != null) || (this.department != null && !this.department.equals(other.department)))
		{
				return false ;
		}
		else if ((this.supervisor == null && other.supervisor != null) || (this.supervisor != null && !this.supervisor.equals(other.supervisor)))
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
		
		stringBuilder.append(Constants.EMPLOYEE_STR_PREFIX_AND_PHONE_NUMBER) ;
		stringBuilder.append(this.phoneNumber) ;
		stringBuilder.append(Constants.EMPLOYEE_STR_EMAIL) ;
		stringBuilder.append(this.email) ;
		stringBuilder.append(Constants.EMPLOYEE_STR_DEPARTMENT) ;
		stringBuilder.append(this.department) ;
		stringBuilder.append(Constants.EMPLOYEE_STR_SUPERVISOR) ;
		stringBuilder.append(this.supervisor) ;
		stringBuilder.append(Constants.STR_CLOSE_BRACKET) ;
		
		return stringBuilder.toString() ;
	}
	
	/**
	 * Print hello and the department information
	 */
	public void sayWhereYouWork()
	{
		this.sayHello() ;
		this.department.sayWhereYouWork() ;
	} 
	
	// El método sayHello lo he movido a Person ya que solo estoy usando atributos del mismo y no de Employee
}
