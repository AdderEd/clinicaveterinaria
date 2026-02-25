package org.palomafp.clinicaveterinaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class clinicaveterinariaDAO {

    private List<Cita> citas = null;

    public clinicaveterinariaDAO() {
        this.citas = new ArrayList<>();
    }

    // Objetos
    Clinica clinica = new Clinica(1, "Clínica Veterinaria PalomaFP", "Calle Principal 123, Madrid", "914567890");
    Veterinario veterinario = new Veterinario(1, "Dr. Carlos García", "12345678A", "612345678", "carlos@veterinaria.com", clinica);
    DuenyoMascota duenyoMascota = new DuenyoMascota(1, "Juan Pérez", "87654321B", "687654321", "juan@email.com");
    Mascota mascota = new Mascota(1, "Max", "Perro", "Golden Retriever", duenyoMascota);
    Cita cita = new Cita(1, new Date(), new Date(), veterinario, duenyoMascota);
    
    // Métodos
    public String mostrarInformacion() {
    return "Información de la Clínica Veterinaria:\n" +
           clinica.toString() + "\n" +
           "Veterinario:\n" + veterinario.toString() + "\n" +
           "Dueño de Mascota:\n" + duenyoMascota.toString() + "\n" +
           "Mascota:\n" + mascota.toString() + "\n" +
           "Cita:\n" + cita.toString() + "\n";
    }

}