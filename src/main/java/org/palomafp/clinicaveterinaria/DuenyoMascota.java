package org.palomafp.clinicaveterinaria;
import java.util.List;
import java.util.ArrayList;

/**
 * Clase DuenyoMascota:
 * Representa la información del dueño de una o varias mascotas.
 *
 * @version 1.0
 * @author Adrián Stephano Alvarado Dávila
 */
public class DuenyoMascota {
    // Identificador del dueño
    private int idDuenyo;
    // Nombre del dueño
    private String nombre;
    // DNI del dueño
    private String dni;
    // Teléfono del dueño
    private String telefono;
    // Correo electrónico del dueño
    private String correo;
    // Mascotas asociadas al dueño
    private List<Mascota> mascotas;
    // Cita actual vinculada al dueño (puede ser null)
    private Cita cita;

    /**
     * Constructor de la clase DuenyoMascota.
     *
     * @param idDuenyo identificador del dueño.
     * @param nombre nombre del dueño.
     * @param dni DNI del dueño.
     * @param telefono teléfono del dueño.
     * @param correo correo electrónico del dueño.
     */
    public DuenyoMascota(int idDuenyo, String nombre, String dni, String telefono, String correo) {
        this.idDuenyo = idDuenyo;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.mascotas = new ArrayList<>();
    }

    /**
     * Obtiene el id del dueño.
     *
     * @return id del dueño.
     */
    public int getIdDuenyo() {
        return idDuenyo;
    }

    /**
     * Escribe el id del dueño.
     *
     * @param idDuenyo id del dueño.
     */
    public void setIdDuenyo(int idDuenyo) {
        this.idDuenyo = idDuenyo;
    }

    /**
     * Obtiene el nombre del dueño.
     *
     * @return nombre del dueño.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Escribe el nombre del dueño.
     *
     * @param nombre nombre del dueño.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI del dueño.
     *
     * @return DNI del dueño.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Escribe el DNI del dueño.
     *
     * @param dni DNI del dueño.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el teléfono del dueño.
     *
     * @return teléfono del dueño.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Escribe el teléfono del dueño.
     *
     * @param telefono teléfono del dueño.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo del dueño.
     *
     * @return correo del dueño.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Escribe el correo del dueño.
     *
     * @param correo correo del dueño.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene las mascotas del dueño.
     *
     * @return lista de mascotas.
     */
    public List<Mascota> getMascotas() {
        return mascotas;
    }

    /**
     * Escribe las mascotas del dueño.
     *
     * @param mascotas lista de mascotas.
     */
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    /**
     * Obtiene la cita asociada al dueño.
     *
     * @return cita asociada.
     */
    public Cita getCita() {
        return cita;
    }

    /**
     * Escribe la cita asociada al dueño.
     *
     * @param cita cita asociada.
     */
    public void setCita(Cita cita) {
        this.cita = cita;
    }
}
