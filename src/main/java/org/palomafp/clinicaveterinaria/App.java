package org.palomafp.clinicaveterinaria;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
     
        // Declaraciones

        CitaDAO citaDAO = new CitaDAO();

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

                default:

                    System.out.println("¡ERROR! El valor introducido no es válido.");
                    break;
            }

        } while (bucleMenu == true);

        sc.close();
    }
}