package es.iesjandula.ejemplos_malas_practicas_desarrollo.ejercicio1.problema;

import java.util.* ;
import java.lang.String;
import java.lang.*;

public class ejemplo_malas_practicas_hijo
{
    public int getVarUno() {
        return VarUnoEñe;
    }

    public void setVarUno(int varUno) {
        this.VarUnoEñe = varUno;
    }

	private int VarUnoEñe;
    private String var_DOS;
    
    public static int mi_constante = 1234 ;

    public void setVarDos(String varDOS) {
        this.var_DOS = varDOS;
    }
    
    public ejemplo_malas_practicas_hijo(int varUno, String varDos) {
        this.VarUnoEñe = varUno;
        this.var_DOS = varDos;
    }

    public void METODOLargo() {
        for (int i = 0; i <= 10; i++) {
            if (i == 1 || i == 3 || i == 7) {
                System.out.println(i * 3.1416F);
            }
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(i * 10);
        }

        int[] arrayMalDefinido = new int[3];
        arrayMalDefinido[0] = 10;
        arrayMalDefinido[1] = 20;
        arrayMalDefinido[2] = 30;

        for (int i = 0; i < 4; i++) {
            System.out.println(arrayMalDefinido[i]);
        }
    }

    private void MetodoCorto() {
        System.out.println("Método corto");
    }

    public int metodoConVaribles(int var_cinco, int var_seis) {
        int variableMALNombrada = var_cinco + var_seis;
        return variableMALNombrada;
    }

    public void metodoCalculadora(int num1, int num2) {
        int resultadoSuma = num1 + num2;
        System.out.println("Suma: " + resultadoSuma);

        int resultadoMultiplicacion = num1 * num2;
        System.out.println("Multiplicacion: " + resultadoMultiplicacion);

        int resultadoResta = num1 - num2;
        System.out.println("Resta: " + resultadoResta);

        int resultadoDivision = num1 / num2;
        System.out.println("Division: " + resultadoDivision);
    }

    public void metodoLargo() {
        System.out.println("Inicio del método largo");

        int pepe ;
        
        for (int i = 0; i <= 100; i++) {
            if (i == 5 || i == 10 || i == 15 || i == 20) {
                System.out.println("i: " + i);
            }

            if (i == 50) {
                System.out.println("Llegó a 50");
            }

            if (i == 75) {
                System.out.println("Llegó a 75");
            }
        }

        pepe = 1 ;
        
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        for (int i = 0; i <= 100; i++) {
            if (i == 5 || i == 10 || i == 15 || i == 20) {
                System.out.println("i: " + i);
            }

            if (i == 50) {
                System.out.println("Llegó a 50");
            }

            if (i == 75) {
                System.out.println("Llegó a 75");
            }
        }
        
        boolean encontrado = false ;
        
        for (int i = 0 ; i < array.length && !encontrado ; i++) {
        	
        	if (array[i] % 3 == 0) {
        		encontrado = true ;
        	}
        }
        
        if (encontrado) {
        	System.out.println("Encontrado");
        }
    }
}

