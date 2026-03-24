package org.palomafp.clinicaveterinaria;

import java.util.Date;

/**
 * Clase Cita:
 * Representa una cita y tiene como atributos los datos de la misma.
 * 
 * @version 1.0
 * @author Adrián Stephano Alvarado Dávila
 */
public class Cita {
    
    // Código de la cita
    private int idCita;
    // Fecha de la cita
    private Date fecha;
    // Hora de la cita
    private Date hora;
    // Veterinario que atiende la cita
    private Veterinario veterinario;
    // Mascota paciente
    private Mascota mascota;

    /**
     * Constructor por defecto de la clase Cita:
     * 
     * @param idCita representa el id de la cita.
     * @param fecha representa la fecha de la cita.
     * @param hora representa la hora de la cita.
     * @param veterinario representa el veterinario que la atiende.
     * @param mascota representa la mascota atendida.
     */
    public Cita(int idCita, Date fecha, Date hora, Veterinario veterinario, Mascota mascota) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }

    /**
     * Método para obtener el id de la Cita.
     * 
     * @return devuelve el id de la Cita.
     */
    public int getIdCita() {
        return idCita;
    }

    /**
     * Método que escribe o sobreescribe el id de la Cita.
     * 
     * @param idCita representa el id de la cita.
     */
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    /**
     * Método para obtener la fecha de la Cita.
     * 
     * @return devuelve la fecha de la Cita.
     */    
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método que escribe o sobreescribe la fecha de la Cita.
     * 
     * @param fecha representa la fecha de la cita.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método para obtener la hora de la Cita.
     * 
     * @return devuelve la hora de la Cita.
     */
    public Date getHora() {
        return hora;
    }

    /**
     * Método que escribe o sobreescribe la hora de la Cita.
     * 
     * @param hora representa la hora de la cita.
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * Método para obtener el veterinario que atenderá la Cita.
     * 
     * @return devuelve el veterinario.
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }

    /**
     * Método que escribe o sobreescribe el veterinario de la Cita.
     * 
     * @param veterinario representa el veterinario.
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    /**
     * Método para obtener la mascota que será atendida en la Cita.
     * 
     * @return devuelve la mascota.
     */
    public Mascota getMascota() {
        return mascota;
    }

    /**
     * Método que escribe o sobreescribe la mascota que será atendida en la Cita.
     * 
     * @param mascota representa la mascota.
     */
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    /**
     * Método toString para imprimir toda información sobre la cita.
     */
    @Override
    public String toString() {
        String info = "ID de la cita: " + this.idCita + "\n";
        info += "  Fecha: " + this.fecha + " Hora: " + this.hora + "\n";
        info += "  Veterinario: " + this.veterinario.getNombre() + "\n";
        info += "  Mascota: " + this.mascota.getNombre() + " (tipo: " + this.mascota.getTipoAnimal() + ", raza: "
                + this.mascota.getRaza() + ")\n";
        info += "    Dueño: " + this.mascota.getDuenyo().getNombre() + " (DNI: " + this.mascota.getDuenyo().getDni()
                + ")\n";
        return info;
    }

}
