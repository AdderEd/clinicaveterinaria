package org.palomafp.clinicaveterinaria;
import java.util.List;
import java.util.ArrayList;

/**
 * Clase Veterinario:
 * Representa un veterinario, su información personal y sus citas.
 *
 * @version 1.0
 * @author Adrián Stephano Alvarado Dávila
 */
public class Veterinario {
    // Identificador del veterinario
    private int idVeterinario;
    // Nombre del veterinario
    private String nombre;
    // DNI del veterinario
    private String dni;
    // Teléfono del veterinario
    private String telefono;
    // Correo electrónico del veterinario
    private String correo;
    // Citas asignadas al veterinario
    private List<Cita> citas;
    // Clínica asociada al veterinario
    private Clinica clinica;

    /**
     * Constructor de la clase Veterinario.
     *
     * @param idVeterinario identificador del veterinario.
     * @param nombre nombre del veterinario.
     * @param dni DNI del veterinario.
     * @param telefono teléfono del veterinario.
     * @param correo correo electrónico del veterinario.
     * @param clinica clínica asociada.
     */
    public Veterinario(int idVeterinario, String nombre, String dni, String telefono, String correo, Clinica clinica) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.clinica = clinica;
        this.citas = new ArrayList<>();
    }

    /**
     * Obtiene el id del veterinario.
     *
     * @return id del veterinario.
     */
    public int getIdVeterinario() {
        return idVeterinario;
    }

    /**
     * Escribe el id del veterinario.
     *
     * @param idVeterinario id del veterinario.
     */
    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    /**
     * Obtiene el nombre del veterinario.
     *
     * @return nombre del veterinario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Escribe el nombre del veterinario.
     *
     * @param nombre nombre del veterinario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI del veterinario.
     *
     * @return DNI del veterinario.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Escribe el DNI del veterinario.
     *
     * @param dni DNI del veterinario.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el teléfono del veterinario.
     *
     * @return teléfono del veterinario.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Escribe el teléfono del veterinario.
     *
     * @param telefono teléfono del veterinario.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo del veterinario.
     *
     * @return correo del veterinario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Escribe el correo del veterinario.
     *
     * @param correo correo del veterinario.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la lista de citas del veterinario.
     *
     * @return lista de citas.
     */
    public List<Cita> getCitas() {
        return citas;
    }

    /**
     * Escribe la lista de citas del veterinario.
     *
     * @param citas lista de citas.
     */
    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    /**
     * Obtiene la clínica asociada al veterinario.
     *
     * @return clínica asociada.
     */
    public Clinica getClinica() {
        return clinica;
    }

    /**
     * Escribe la clínica asociada al veterinario.
     *
     * @param clinica clínica asociada.
     */
    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }
}
