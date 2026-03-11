package org.palomafp.clinicaveterinaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clinicaveterinariaDAOTest {
    @Test
    public void testCitaDAO() {
        Clinica clinica = new Clinica(1, "Clínica Veterinaria Paloma", "Calle Falsa 123", "555-1234");
        Veterinario veterinario = new Veterinario(1, "Dr. Juan Pérez", "12345678A", "555-5678", "juan@veterinaria.com", clinica);
        assertNotNull(veterinario);
        DuenyoMascota duenyo = new DuenyoMascota(1, "María López", "87654321B", "555-8765", "maria@correo.es");
        assertNotNull(duenyo);
    }   
}