/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList011 {

    public static void main(String[] args) {
      
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);

    }

    public static ArrayList<String> obtenerDatos() {
        ArrayList<String> arreglo2 = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String pais;
        String opcion;
        String cadena = "";
        while (bandera) {
            System.out.println("Ingrese nombre de paises");
            pais = entrada.nextLine();
            arreglo2.add(pais);

            System.out.println("Ingrese (s) para salir");
            opcion = entrada.nextLine();

            if (opcion.equals("s")) {
                bandera = false;

            }

        }

        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String> a) {

        String cadenaFinal = "";
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
            cadenaFinal = String.format("%s%s", cadenaFinal, a.get(i));
        }
        return cadenaFinal;
    }
}
