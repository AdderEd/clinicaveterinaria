package org.palomafp.clinicaveterinaria;
import java.util.Date;

public class Cita {
    private int idCita;
    private Date fecha;
    private Date hora;
    private Veterinario veterinario;
    private Mascota mascota;
    
    public Cita(int idCita, Date fecha, Date hora, Veterinario veterinario, Mascota mascota) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.mascota = mascota;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
