package org.palomafp.clinicaveterinaria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CitaDAO {

    private List<Cita> citas;

    // Objetos
    private Clinica clinica = new Clinica(1, "Clínica Veterinaria PalomaFP", "Calle Principal 123, Madrid",
            "914567890");

    // Veterinario sobreexplotado laboralmente
    private Veterinario veterinario = new Veterinario(1, "Dr. Carlos García", "12345678A", "612345678",
            "carlos@veterinaria.com", clinica);

    private DuenyoMascota duenyoMascota1 = new DuenyoMascota(1, "Juan Pérez", "87654321B", "687654321",
            "juan@email.com");
    private Mascota mascota1 = new Mascota(1, "Max", "Perro", "Golden Retriever", duenyoMascota1);

    private DuenyoMascota duenyoMascota2 = new DuenyoMascota(2, "María López", "12345678C", "612345679",
            "maria@correo.es");
    private Mascota mascota2 = new Mascota(2, "Luna", "Gato", "Siames", duenyoMascota2);

    private DuenyoMascota duenyoMascota3 = new DuenyoMascota(3, "Carlos Ruiz", "23456789D", "623456780",
            "carlos@ejemplo.com");
    private Mascota mascota3 = new Mascota(3, "Oreo", "Perro", "Bulldog", duenyoMascota3);

    private DuenyoMascota duenyoMascota4 = new DuenyoMascota(4, "Ana Fernández", "34567890E", "634567891",
            "ana@dominio.com");
    private Mascota mascota4 = new Mascota(4, "Coco", "Ave", "Periquito", duenyoMascota4);

    private DuenyoMascota duenyoMascota5 = new DuenyoMascota(5, "Luis Martínez", "45678901F", "645678902",
            "luis@correo.net");
    private Mascota mascota5 = new Mascota(5, "Nala", "Gato", "Maine Coon", duenyoMascota5);

    // Objetos principales
    private Cita cita1 = new Cita(1, new Date(), new Date(), veterinario, mascota1);
    private Cita cita2 = new Cita(2, new Date(), new Date(), veterinario, mascota2);
    private Cita cita3 = new Cita(3, new Date(), new Date(), veterinario, mascota3);
    private Cita cita4 = new Cita(4, new Date(), new Date(), veterinario, mascota4);
    private Cita cita5 = new Cita(5, new Date(), new Date(), veterinario, mascota5);

    public CitaDAO() {
        this.citas = new ArrayList<>();
        // Llenamos la lista con los objetos creados
        citas.add(cita1);
        citas.add(cita2);
        citas.add(cita3);
        citas.add(cita4);
        citas.add(cita5);
    }

    // Métodos
    public Cita getCitaRandom() {
        if (this.citas == null || this.citas.isEmpty()) {
            return null;
        }
        int indiceAleatorio = (int) (Math.random() * this.citas.size());
        return this.citas.get(indiceAleatorio);
    }

    public Cita getCitaPorIndice(int indice) {
        if (indice < 0 || indice >= this.citas.size()) {
            return null;
        }
        return this.citas.get(indice);
    }

    public List<Cita> getAllCitas() {
        return this.citas;
    }

    @Override
    public String toString() {
        String listado = "=== TODAS LAS CITAS ===\n";

        for (Cita c : citas) {
            // Aquí llamamos al toString de cada cita individual
            listado += c.toString() + "\n";
        }

        return listado;
    }

}