package org.palomafp.clinicaveterinaria;
import java.util.List;
import java.util.ArrayList;

public class Clinica {
    private int idClinica;
    private String nombreClinica;
    private String direccion;
    private String telefono;
    private List<Veterinario> veterinarios;

    public Clinica() {
        this.veterinarios = new ArrayList<>();
    }

    public Clinica(int idClinica, String nombreClinica, String direccion, String telefono) {
        this.idClinica = idClinica;
        this.nombreClinica = nombreClinica;
        this.direccion = direccion;
        this.telefono = telefono;
        this.veterinarios = new ArrayList<>();
    }

    public int getIdClinica() {
        return idClinica;
    }

    public void setIdClinica(int idClinica) {
        this.idClinica = idClinica;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }
}
