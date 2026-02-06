package org.palomafp.clinicaveterinaria;

import java.util.Date;

public class clinicaveterinariaDAO {
    
    // Objeto
    Clinica clinica = new Clinica(1, "Clínica Veterinaria PalomaFP", "Calle Principal 123, Madrid", "914567890");
    
    Veterinario veterinario = new Veterinario(1, "Dr. Carlos García", "12345678A", "612345678", "carlos@veterinaria.com", clinica);
    
    DuenyoMascota duenyoMascota = new DuenyoMascota(1, "Juan Pérez", "87654321B", "687654321", "juan@email.com");
    
    Mascota mascota = new Mascota(1, "Max", "Perro", "Golden Retriever", duenyoMascota);
    
    Cita cita = new Cita(1, new Date(), new Date(), veterinario, duenyoMascota);
    
    // Método para mostrar toda la información
    public void mostrarInformacion(Clinica clinica, Veterinario veterinario, DuenyoMascota duenyoMascota, Mascota mascota, Cita cita) {
        System.out.println("=== CLÍNICA ===");
        System.out.println("ID Clínica: " + clinica.getIdClinica());
        System.out.println("Nombre: " + clinica.getNombreClinica());
        System.out.println("Dirección: " + clinica.getDireccion());
        System.out.println("Teléfono: " + clinica.getTelefono());
        
        System.out.println("\n=== VETERINARIO ===");
        System.out.println("ID Veterinario: " + veterinario.getIdVeterinario());
        System.out.println("Nombre: " + veterinario.getNombre());
        System.out.println("DNI: " + veterinario.getDni());
        System.out.println("Teléfono: " + veterinario.getTelefono());
        System.out.println("Correo: " + veterinario.getCorreo());
        System.out.println("Clínica: " + veterinario.getClinica().getNombreClinica());
        
        System.out.println("\n=== DUEÑO MASCOTA ===");
        System.out.println("ID Dueño: " + duenyoMascota.getIdDuenyo());
        System.out.println("Nombre: " + duenyoMascota.getNombre());
        System.out.println("DNI: " + duenyoMascota.getDni());
        System.out.println("Teléfono: " + duenyoMascota.getTelefono());
        System.out.println("Correo: " + duenyoMascota.getCorreo());
        
        System.out.println("\n=== MASCOTA ===");
        System.out.println("ID Mascota: " + mascota.getIdMascota());
        System.out.println("Nombre: " + mascota.getNombre());
        System.out.println("Tipo Animal: " + mascota.getTipoAnimal());
        System.out.println("Raza: " + mascota.getRaza());
        System.out.println("Dueño: " + mascota.getDuenyo().getNombre());
        
        System.out.println("\n=== CITA ===");
        System.out.println("ID Cita: " + cita.getIdCita());
        System.out.println("Fecha: " + cita.getFecha());
        System.out.println("Hora: " + cita.getHora());
        System.out.println("Veterinario: " + cita.getVeterinario().getNombre());
        System.out.println("Cliente: " + cita.getCliente().getNombre());
    }

}
