package com.manuel.primer_parcial.dto;

public class EventoDTO {
    private String nombre;
    private String fecha;
    private String ubicacion;
    public EventoDTO () {}

    public EventoDTO(String nombre, String fecha, String ubicacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}