package org.palomafp.clinicaveterinaria;
import java.util.Date;

public class Cita {
    private int idCita;
    private Date fecha;
    private Date hora;
    private Veterinario veterinario;
    private DuenyoMascota cliente;

    public Cita() {
    }

    public Cita(int idCita, Date fecha, Date hora, Veterinario veterinario, DuenyoMascota cliente) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.veterinario = veterinario;
        this.cliente = cliente;
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

    public DuenyoMascota getCliente() {
        return cliente;
    }

    public void setCliente(DuenyoMascota cliente) {
        this.cliente = cliente;
    }
}
