package org.palomafp.clinicaveterinaria;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
     
        // Declaraciones

        Scanner sc = new Scanner(System.in);
        boolean bucleMenu = true;
        int opcionesMenu;

        // Código

        do {
            
            System.out.println("======================================");
            System.out.println("CLINICA VETERINARIA");
            System.out.println("======================================");
            System.out.println("1. Mostrar cita por indice.");
            System.out.println("2. Mostrar cita aleatoria.");
            System.out.println("3. Mostrar todas las citas.");
            System.out.println("4. Salir del programa,");

            opcionesMenu = sc.nextInt();

            switch (opcionesMenu) {

                case 1:
                    
                    break;
            
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    System.out.println("¡Hasta pronto!");
                    bucleMenu = false;
                    break;

                default:

                    System.out.println("¡ERROR! El valor introducido no es válido.");
                    break;
            }

        } while (bucleMenu == true);

        sc.close();
    }
}