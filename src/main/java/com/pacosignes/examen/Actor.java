package com.pacosignes.examen;

public class Actor {
    private static int autoId=0;
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public Actor(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }
    public Actor (String nombre,String apellido1){
        this.nombre=nombre;
        this.apellido1=apellido1;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    public String toString() {
       return String.format("%4d %15s %20s ",id, nombre, apellido1 + apellido2);
    }
}
