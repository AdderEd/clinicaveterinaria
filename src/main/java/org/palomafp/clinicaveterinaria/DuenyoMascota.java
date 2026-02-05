package org.palomafp.clinicaveterinaria;
import java.util.List;
import java.util.ArrayList;

public class DuenyoMascota {
    private int idDuenyo;
    private String nombre;
    private String dni;
    private String telefono;
    private String correo;
    private List<Mascota> mascotas;
    private Cita cita;

    public DuenyoMascota() {
        this.mascotas = new ArrayList<>();
    }

    public int getIdDuenyo() {
        return idDuenyo;
    }

    public void setIdDuenyo(int idDuenyo) {
        this.idDuenyo = idDuenyo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
}
