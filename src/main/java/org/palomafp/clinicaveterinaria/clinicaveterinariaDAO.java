package org.palomafp.clinicaveterinaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class clinicaveterinariaDAO {

    private List<Cita> citas = null;

    public clinicaveterinariaDAO() {
        this.citas = new ArrayList<>();

        // Instanciamos los objetos
        Clinica clinica1 = new Clinica(1, "Clínica Veterinaria PalomaFP", "Calle Principal 123, Madrid", "914567890");
        Veterinario veterinario1 = new Veterinario(1, "Dr. Carlos García", "12345678A", "612345678", "carlos@veterinaria.com", clinica1);
        DuenyoMascota duenyoMascota1 = new DuenyoMascota(1, "Juan Pérez", "87654321B", "687654321", "juan@email.com");
        Mascota mascota1 = new Mascota(1, "Max", "Perro", "Golden Retriever", duenyoMascota1);
        duenyoMascota1.getMascotas().add(mascota1);
        Cita cita1 = new Cita(1, new Date(), new Date(), veterinario1, duenyoMascota1);
        // Añadimos a la lista
        this.citas.add(cita1);

        // Instanciamos los objetos
        Clinica clinica2 = new Clinica(2, "Clínica Veterinaria PalomaFP", "Calle Principal 123, Madrid", "914567890");
        Veterinario veterinario2 = new Veterinario(1, "Dr. Indiana Jones", "6969697B", "733425679", "jones@veterinaria.com", clinica2);
        DuenyoMascota duenyoMascota2 = new DuenyoMascota(1, "Jonathan de Gama", "6767674C", "765123654", "jonathan@email.com");
        Mascota mascota2 = new Mascota(1, "Thor", "Perro", "San Bernardo", duenyoMascota2);
        Cita cita2 = new Cita(1, new Date(), new Date(), veterinario2, duenyoMascota2);
        duenyoMascota2.getMascotas().add(mascota2);
        // Añadimos a la lista
        this.citas.add(cita2);
    }

    // Métodos
    publico estatico vacio principal(Cuerda[] argumentos) {
        Sistema.fuera.imprimelinea(«Hola mundo»);
    }

}