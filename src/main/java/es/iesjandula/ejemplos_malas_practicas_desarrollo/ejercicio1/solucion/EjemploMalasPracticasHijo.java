package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio1.solucion;

import es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio1.utils.Constants;

/**
 * @author Paco Benítez
 */
public class EjemploMalasPracticasHijo
{
	/** Attribute - varUnoEnhe */
	private int varUnoEnhe ;
	
	/** Attribute - varDos */
	private String varDos ;
	
	/**
	 * @param varUno with the input parameter uno
	 * @param varDos with the input parameter varDos
	 */
    public EjemploMalasPracticasHijo(int varUno, String varDos)
    {
        this.varUnoEnhe = varUno ;
        this.varDos     = varDos ;
    }
	
    /**
     * @return the varUno
     */
    public int getVarUno()
    {
        return this.varUnoEnhe ;
    }
    
    /**
     * @return the varUnoEnhe
     */
    public int getVarUnoEnhe()
    {
    	return this.varUnoEnhe ;
    }

	/**
	 * @param varUnoEnhe the varUnoEnhe to set
	 */
	public void setVarUnoEnhe(int varUnoEnhe)
	{
		this.varUnoEnhe = varUnoEnhe ;
	}

	/**
	 * @return the varDos
	 */
	public String getVarDos()
	{
		return this.varDos ;
	}

	/**
     * @param varDos with the parameter varDos
     */
    public void setVarDos(String varDos)
    {
        this.varDos = varDos;
    }

    /**
     * This is a longer method
     */
    public void metodoLargo1()
    {
        for (int i = 0 ; i <= Constants.INT_10 ; i++)
        {
            if (i == 1 || i == Constants.INT_3 || i == Constants.INT_7)
            {
                System.out.println(i * Constants.FLOAT_PI) ;
            }
        }

        for (int i = 0 ; i <= Constants.INT_5 ; i++)
        {
            System.out.println(i * Constants.INT_10) ;
        }

        int[] arrayMalDefinido 			  = new int[Constants.INT_3] ;
        arrayMalDefinido[0]     		  = Constants.INT_10 ;
        arrayMalDefinido[1]     		  = Constants.INT_20 ;
        arrayMalDefinido[Constants.INT_2] = Constants.INT_30 ;

        for (int i = 0; i < Constants.INT_4; i++)
        {
            System.out.println(arrayMalDefinido[i]) ;
        }
    }

    /**
     * This is a deprecated method - metodoCorto
     */
    @Deprecated
    private void metodoCorto()
    {
        System.out.println("Método corto") ;
    }

    /**
     * 
     * @param varCinco with the parameter varCinco
     * @param varSeis  with the parameter varSeis
     * @return the addition between varCinco and varSeis
     */
    public int metodoConVaribles(int varCinco, int varSeis)
    {
        return varCinco + varSeis ;
    }

    /**
     * @param num1 with the parameter num1
     * @param num2 with the parameter num2
     */
    public void metodoCalculadora(int num1, int num2)
    {
        int resultadoSuma 			= num1 + num2 ;
        System.out.println("Suma: " + resultadoSuma) ;

        int resultadoMultiplicacion = num1 * num2;
        System.out.println("Multiplicacion: " + resultadoMultiplicacion) ;

        int resultadoResta 			= num1 - num2 ;
        System.out.println("Resta: " + resultadoResta) ;

        int resultadoDivision 		= num1 / num2 ;
        System.out.println("Division: " + resultadoDivision) ;
    }

    /**
     * This is a longer method
     */
    public void metodoLargo2()
    {
    	// Calling to submethod 1
        this.metodoLargo2Submethod1() ;

        // Unused variable
        int pepe = 1 ;
        
        int[] array 		   = new int[5] ;
        array[0] 			   = Constants.INT_10 ;
        array[1] 			   = Constants.INT_20 ;
        array[Constants.INT_2] = Constants.INT_30 ;
        array[Constants.INT_3] = Constants.INT_40 ;
        array[Constants.INT_4] = Constants.INT_50 ;
        
    	// Calling to submethod 1
        this.metodoLargo2Submethod1() ;
        
        // Calling to submethod 2
        this.metodoLargo2Submethod2(array) ;
    }

    /**
     * MetodoLargo2 - Submethod 1
     */
	private void metodoLargo2Submethod1()
	{
		System.out.println("Inicio del método largo") ;
        
        for (int i = 0 ; i <= Constants.INT_100 ; i++)
        {
            if (i == Constants.INT_5 || i == Constants.INT_10 || i == Constants.INT_15 || i == Constants.INT_20)
            {
                System.out.println("i: " + i) ;
            }

            if (i == Constants.INT_50)
            {
                System.out.println("Llegó a 50") ;
            }

            if (i == Constants.INT_75)
            {
                System.out.println("Llegó a 75") ;
            }
        }
	}
	
	/**
	 * MetodoLargo2 - Submethod 2
	 * @param array with the input array as parameter
	 */
	private void metodoLargo2Submethod2(int[] array)
	{        
        boolean encontrado = false ;
        
        int i = 0 ;

        while (i < array.length && !encontrado)
        {
        	encontrado = array[i] % 3 == 0 ;
        	
        	i++ ;
        }
        
        if (encontrado)
        {
        	System.out.println("Encontrado") ;
        }		
	}
}

