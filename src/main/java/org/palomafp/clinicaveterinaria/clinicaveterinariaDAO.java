package org.palomafp.clinicaveterinaria;

public class clinicaveterinariaDAO {
    
    // Objeto

    DuenyoMascota duenyo1 = new DuenyoMascota(1, "Juan Pérez", "12345678A", "600123456", "juan@email.com");

    public void mostrarDuenyoMascota() {
        System.out.println("=== INFORMACIÓN DEL DUEÑO ===");
        System.out.println("ID Dueño: " + duenyo1.getIdDuenyo());
        System.out.println("Nombre: " + duenyo1.getNombre());
        System.out.println("DNI: " + duenyo1.getDni());
        System.out.println("Teléfono: " + duenyo1.getTelefono());
        System.out.println("Correo: " + duenyo1.getCorreo());
    }

}
