package org.palomafp.clinicaveterinaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CitaDAO {

    private List<Cita> citas = null;

    public CitaDAO() {
        this.citas = new ArrayList<>();
    }

    // Objetos
    Clinica clinica = new Clinica(1, "Clínica Veterinaria PalomaFP", "Calle Principal 123, Madrid", "914567890");
    
    // Veterinario sobreexplotado laboralmente
    Veterinario veterinario = new Veterinario(1, "Dr. Carlos García", "12345678A", "612345678", "carlos@veterinaria.com", clinica);
    
    DuenyoMascota duenyoMascota1 = new DuenyoMascota(1, "Juan Pérez", "87654321B", "687654321", "juan@email.com");
    Mascota mascota1 = new Mascota(1, "Max", "Perro", "Golden Retriever", duenyoMascota1);

    DuenyoMascota duenyoMascota2 = new DuenyoMascota(2, "María López", "12345678C", "612345679", "maria@correo.es");
    Mascota mascota2 = new Mascota(2, "Luna", "Gato", "Siames", duenyoMascota2);

    DuenyoMascota duenyoMascota3 = new DuenyoMascota(3, "Carlos Ruiz", "23456789D", "623456780", "carlos@ejemplo.com");
    Mascota mascota3 = new Mascota(3, "Oreo", "Perro", "Bulldog", duenyoMascota3);

    DuenyoMascota duenyoMascota4 = new DuenyoMascota(4, "Ana Fernández", "34567890E", "634567891", "ana@dominio.com");
    Mascota mascota4 = new Mascota(4, "Coco", "Ave", "Periquito", duenyoMascota4);

    DuenyoMascota duenyoMascota5 = new DuenyoMascota(5, "Luis Martínez", "45678901F", "645678902", "luis@correo.net");
    Mascota mascota5 = new Mascota(5, "Nala", "Gato", "Maine Coon", duenyoMascota5);
    
    // Objetos principales
    Cita cita1 = new Cita(1, new Date(), new Date(), veterinario, mascota1);
    Cita cita2 = new Cita(2, new Date(), new Date(), veterinario, mascota2);
    Cita cita3 = new Cita(3, new Date(), new Date(), veterinario, mascota3);
    Cita cita4 = new Cita(4, new Date(), new Date(), veterinario, mascota4);
    Cita cita5 = new Cita(5, new Date(), new Date(), veterinario, mascota5);
    
    // Métodos

    public getCitaRandom() {

        return this.citas.get(0);
    }

    public getAllCitas() {

        return this.citas;
    }

    public delCita(int num) {

        this.citas(num) = null;

        return this.citas(num);
    }

    @Override
    public String toString() {
        return "Cita" + "\n" +
                "Fecha: " + cita1.getFecha() + "\n" +
                "Hora: " + cita1.getHora() + "\n" +
                "Veterinario: " + cita1.getVeterinario().getNombre() + "\n" +
                "Mascota: " + cita2.getMascota().getNombre() + "\n";
    }

}