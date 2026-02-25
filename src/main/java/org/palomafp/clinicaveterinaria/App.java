package org.palomafp.clinicaveterinaria;

public class App 
{
    public static void main( String[] args )
    {
        // Mostrar la información de la cita

        CitaDAO dao = new CitaDAO();

        System.out.println(dao.toString());
        
    }
}