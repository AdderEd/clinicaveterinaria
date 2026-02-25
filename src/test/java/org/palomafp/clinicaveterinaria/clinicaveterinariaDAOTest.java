package org.palomafp.clinicaveterinaria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class clinicaveterinariaDAOTest {
    @Test
    void testMostrarInformacion() {
        CitaDAO dao = new CitaDAO();
        String info = dao.mostrarInformacion();
        assertNotNull(info, "La información no puede ser nula");
        assertFalse(info.isEmpty(), "La información no puede estar vacía");
        // comprobamos que algunos datos esperados aparecen en el texto
        assertTrue(info.contains("Clínica"));
        assertTrue(info.contains("Veterinario de guardia"));
        assertTrue(info.contains("Cita ID"));
        assertTrue(info.contains("Mascota"));
        assertTrue(info.contains("Dueño"));
    }
}
