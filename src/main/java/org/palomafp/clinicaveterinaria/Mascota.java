package org.palomafp.clinicaveterinaria;
public class Mascota {
    private int idMascota;
    private String nombre;
    private String tipoAnimal;
    private String raza;
    private DuenyoMascota duenyo;

    public Mascota(int idMascota, String nombre, String tipoAnimal, String raza, DuenyoMascota duenyo) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.duenyo = duenyo;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public DuenyoMascota getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(DuenyoMascota duenyo) {
        this.duenyo = duenyo;
    }
}
