package org.palomafp.clinicaveterinaria;

public class App 
{
    public static void main( String[] args )
    {
        // Llamar al método mostrarInformacion()
        clinicaveterinariaDAO dao = new clinicaveterinariaDAO();
        dao.mostrarInformacion(dao.clinica, dao.veterinario, dao.duenyoMascota, dao.mascota, dao.cita);
        
    }
}