package org.palomafp.clinicaveterinaria;

import java.util.Scanner;

/**
Clase que permite ejecutar y visualizar el programa.
@author Andrés Cuerva
@version 1.0
*/

public class App 
{

/**
Clase main que contiene el menú y las variables que se van a usar.
@param args Parámetros que se usan en el main.
*/
    public static void main( String[] args )
    {
     
        // Declaraciones
        CitaDAO citaDAO = new CitaDAO();

        /**
        Variable de tipo Scanner que sirve para poder pasar valores por teclado.
        */
        Scanner sc = new Scanner(System.in);
        /**
        Variable boolean que sirve para repetir el menú de forma constante hasta que el usuario decida salir.
        */
        boolean bucleMenu = true;
        /**
        Variable de tipo int que sirve para poder seleccionar las opciones del menú asignándole el valor mediante el Scanner.
        */
        int opcionesMenu;

        // Código
        do {
            // Menú hecho con prints
            System.out.println("======================================");
            System.out.println("CLINICA VETERINARIA");
            System.out.println("======================================");
            System.out.println("1. Mostrar cita aleatoria."); 
            System.out.println("2. Mostrar cita por indice."); 
            System.out.println("3. Mostrar todas las citas.");
            System.out.println("4. Salir del programa.");
            System.out.print("Seleccione una opción: ");

            // Asignacion de valor para la variable opcionesMenu mediante Scanner.
            opcionesMenu = sc.nextInt();

            //Switch que usa el valor de la variable opcionesMenu para poder moverse entre las distintas opciones del menú.
            switch (opcionesMenu) {

                case 1: // Cita Aleatoria
                    Cita citaRandom = citaDAO.getCitaRandom();
                    if (citaRandom != null) {
                        System.out.println("--- CITA RANDOM ---");
                        System.out.println(citaRandom);
                    } else {
                        System.err.println("No hay citas disponibles.");
                    }
                    break;

                case 2: // Cita por Índice
                    System.out.print("Introduce el indice de la cita (0-4): ");
                    int indice = sc.nextInt();

                    Cita citaSeleccionada = citaDAO.getCitaPorIndice(indice);

                    if (citaSeleccionada != null) {
                        System.out.println("--- CITA ENCONTRADA ---");
                        System.out.println(citaSeleccionada);
                    } else {
                        System.err.println("Error: No se encontró una cita con el índice: " + indice);
                    }
                    break;

                case 3: // Todas las citas
                    System.out.println("--- LISTADO COMPLETO ---");
                    // Aquí llamamos al toString() de CitaDAO
                    System.out.println(citaDAO);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    bucleMenu = false;
                    break;

                // Opción que se ejecuta por defecto en caso de que el valor introducido para la variable opcionesMenu sea distinto de los establecidos en los case.
                default:
                    System.err.println("Error: El valor introducido no es válido.");
                    break;
            }

        } while (bucleMenu);

        sc.close();
    }
}
