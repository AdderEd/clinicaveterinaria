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
            System.out.println("1. Mostrar cita por indice.");
            System.out.println("2. Mostrar cita aleatoria.");
            System.out.println("3. Mostrar todas las citas.");
            System.out.println("4. Salir del programa,");

            // Asignacion de valor para la variable opcionesMenu mediante Scanner.
            opcionesMenu = sc.nextInt();

            //Switch que usa el valor de la variable opcionesMenu para poder moverse entre las distintas opciones del menú.
            switch (opcionesMenu) {

                case 1:
                    
                    System.out.println("Introduce el indice de la cita que quieres mostrar (1-5):");
                    int indice = sc.nextInt();

                    Cita cita = citaDAO.delCita(indice - 1);
                    if (cita != null) {
                        System.out.println("Cita encontrada:");
                        System.out.println(cita);
                    } else {
                        System.out.println("No se encontró una cita con ese índice.");
                    }

                    break;
            
                case 2:

                   Cita citaRandom = citaDAO.getCitaRandom();
                   System.out.println("Cita aleatoria:");
                   System.out.println(citaRandom);
                    break;

                case 3:

                    System.out.println(citaDAO.mostrarInformacion());
                    break;

                case 4:

                    System.out.println("¡Hasta pronto!");
                    bucleMenu = false;
                    break;

                // Opción que se ejecuta por defecto en caso de que el valor introducido para la variable opcionesMenu sea distinto de los establecidos en los case.
                default:

                    System.out.println("¡ERROR! El valor introducido no es válido.");
                    break;
            }

        } while (bucleMenu == true);

        sc.close();
    }
}