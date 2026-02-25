package org.palomafp.clinicaveterinaria;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

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
            System.out.println("1. Mostrar cita aleatoria."); 
            System.out.println("2. Mostrar cita por indice."); 
            System.out.println("3. Mostrar todas las citas.");
            System.out.println("4. Salir del programa.");
            System.out.print("Seleccione una opción: ");

            opcionesMenu = sc.nextInt();

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

                default:
                    System.err.println("Error: El valor introducido no es válido.");
                    break;
            }

        } while (bucleMenu);

        sc.close();
    }
}
