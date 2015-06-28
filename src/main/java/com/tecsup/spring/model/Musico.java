package com.tecsup.spring.model;

public class Musico {

    private String nombre;
    private Instrumento instrumento;
    private int canciones;

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public Musico(Instrumento instrumento, int canciones) {
        this.instrumento = instrumento;
        this.canciones = canciones;
    }
    
    public Musico() {
    }

    public Musico(int canciones) {
        this.canciones = canciones;
    }

    public void who() {
        System.out.println("Soy un musico XD");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
}
