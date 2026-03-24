package org.palomafp.clinicaveterinaria;
/**
 * Clase Mascota:
 * Representa los datos de una mascota y su dueño asociado.
 *
 * @version 1.0
 * @author Adrián Stephano Alvarado Dávila
 */
public class Mascota {
    // Identificador de la mascota
    private int idMascota;
    // Nombre de la mascota
    private String nombre;
    // Tipo de animal (perro, gato, ave...)
    private String tipoAnimal;
    // Raza de la mascota
    private String raza;
    // Dueño de la mascota
    private DuenyoMascota duenyo;

    /**
     * Constructor de la clase Mascota.
     *
     * @param idMascota identificador de la mascota.
     * @param nombre nombre de la mascota.
     * @param tipoAnimal tipo de animal.
     * @param raza raza de la mascota.
     * @param duenyo dueño de la mascota.
     */
    public Mascota(int idMascota, String nombre, String tipoAnimal, String raza, DuenyoMascota duenyo) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.duenyo = duenyo;
    }

    /**
     * Obtiene el identificador de la mascota.
     *
     * @return id de la mascota.
     */
    public int getIdMascota() {
        return idMascota;
    }

    /**
     * Escribe el identificador de la mascota.
     *
     * @param idMascota id de la mascota.
     */
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    /**
     * Obtiene el nombre de la mascota.
     *
     * @return nombre de la mascota.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Escribe el nombre de la mascota.
     *
     * @param nombre nombre de la mascota.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de animal.
     *
     * @return tipo de animal.
     */
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    /**
     * Escribe el tipo de animal.
     *
     * @param tipoAnimal tipo de animal.
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    /**
     * Obtiene la raza de la mascota.
     *
     * @return raza de la mascota.
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Escribe la raza de la mascota.
     *
     * @param raza raza de la mascota.
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * Obtiene el dueño de la mascota.
     *
     * @return dueño de la mascota.
     */
    public DuenyoMascota getDuenyo() {
        return duenyo;
    }

    /**
     * Escribe el dueño de la mascota.
     *
     * @param duenyo dueño de la mascota.
     */
    public void setDuenyo(DuenyoMascota duenyo) {
        this.duenyo = duenyo;
    }
}
