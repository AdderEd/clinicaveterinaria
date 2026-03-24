package org.palomafp.clinicaveterinaria;
import java.util.List;
import java.util.ArrayList;

/**
 * Clase Clinica:
 * Representa los datos de una clínica veterinaria y su lista de veterinarios.
 *
 * @version 1.0
 * @author Adrián Stephano Alvarado Dávila
 */
public class Clinica {
    // Identificador de la clínica
    private int idClinica;
    // Nombre de la clínica
    private String nombreClinica;
    // Dirección de la clínica
    private String direccion;
    // Teléfono de contacto de la clínica
    private String telefono;
    // Lista de veterinarios que trabajan en la clínica
    private List<Veterinario> veterinarios;

    /**
     * Constructor de la clase Clinica.
     *
     * @param idClinica identificador de la clínica.
     * @param nombreClinica nombre de la clínica.
     * @param direccion dirección de la clínica.
     * @param telefono teléfono de la clínica.
     */
    public Clinica(int idClinica, String nombreClinica, String direccion, String telefono) {
        this.idClinica = idClinica;
        this.nombreClinica = nombreClinica;
        this.direccion = direccion;
        this.telefono = telefono;
        this.veterinarios = new ArrayList<>();
    }

    /**
     * Obtiene el id de la clínica.
     *
     * @return id de la clínica.
     */
    public int getIdClinica() {
        return idClinica;
    }

    /**
     * Escribe el id de la clínica.
     *
     * @param idClinica identificador de la clínica.
     */
    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    /**
     * Obtiene el nombre de la clínica.
     *
     * @return nombre de la clínica.
     */
    public String getNombreClinica() {
        return nombreClinica;
    }

    /**
     * Escribe el nombre de la clínica.
     *
     * @param nombreClinica nombre de la clínica.
     */
    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    /**
     * Obtiene la dirección de la clínica.
     *
     * @return dirección de la clínica.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Escribe la dirección de la clínica.
     *
     * @param direccion dirección de la clínica.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el teléfono de la clínica.
     *
     * @return teléfono de la clínica.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Escribe el teléfono de la clínica.
     *
     * @param telefono teléfono de la clínica.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la lista de veterinarios de la clínica.
     *
     * @return lista de veterinarios.
     */
    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    /**
     * Escribe la lista de veterinarios de la clínica.
     *
     * @param veterinarios lista de veterinarios.
     */
    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }
}
