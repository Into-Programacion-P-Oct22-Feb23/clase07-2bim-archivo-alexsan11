package escritura01;

import java.util.Scanner;


public class PruebaCrearArchivoTexto {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        boolean bandera = true;
        
        while (bandera){
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        
        entrada.nextLine();
        cadenaFinal = String.format("%s%s %s %d\n", cadenaFinal, nombre, 
                apellido, edad);
            System.out.println("Ingrese (s) para salir");
            String opcion = entrada.nextLine();
            
            if (opcion.equals("s")){
                bandera = false;
            }
        }
        
        CrearArchivoTexto.agregarRegistros(cadenaFinal);
        

    } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *************************************************************************/
