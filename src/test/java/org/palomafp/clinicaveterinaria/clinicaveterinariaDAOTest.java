package org.palomafp.clinicaveterinaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clinicaveterinariaDAOTest {

    @Test
    public void testCitaDAO() {
        Clinica clinica = new Clinica(1, "Clínica Veterinaria Paloma", "Calle Falsa 123", "555-1234");
        Veterinario veterinario = new Veterinario(1, "Dr. Juan Pérez", "12345678A", "555-5678", "juan@veterinaria.com",
                clinica);
        assertNotNull(veterinario);

        DuenyoMascota duenyo = new DuenyoMascota(1, "María López", "87654321B", "555-8765", "maria@correo.es");
        assertNotNull(duenyo);
    }

    @Test
    public void testGetCitaRandom() {
        CitaDAO dao = new CitaDAO();

        Cita cita = dao.getCitaRandom();

        assertNotNull(cita, "Devuelve una cita aleatoria si la lista no está vacío.");
    }

    @Test
    public void testGetCitaPorIndice() {
        CitaDAO dao = new CitaDAO();

        Cita cita = dao.getCitaPorIndice(0);
        assertNotNull(cita, "Devuelve una cita si el índice se corresponde con una.");

        assertNull(dao.getCitaPorIndice(-1), "Devuelve null si el índice es negativo.");

        assertNull(dao.getCitaPorIndice(100), "Devuelve null si el índice es mayor que la lista.");
    }

    @Test
    public void testAllCitas() {
        CitaDAO dao = new CitaDAO();

        assertNotNull(dao.getAllCitas(), "La lista de citas no puede ser null.");
        assertFalse(dao.getAllCitas().isEmpty(), "La lista debe tener citas.");
        assertEquals(5, dao.getAllCitas().size(), "Debe haber 5 citas en el DAO.");
    }
}