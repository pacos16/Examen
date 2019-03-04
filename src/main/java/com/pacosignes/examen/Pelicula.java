package com.pacosignes.examen;


import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Pelicula {

    public enum Genero{
        DRAMA,FICCION,COMEDIA,WESTERN
    }

    private Genero genero;
    private static int idAuto=0;
    private GregorianCalendar fechaEstreno;
    private int id;
    private String titulo;

    private ArrayList<Actor> actores;

    public Pelicula(Genero genero, GregorianCalendar fechaEstreno, String titulo) {
        this.genero = genero;
        this.fechaEstreno = fechaEstreno;

        this.titulo = titulo;
        id=idAuto;
        idAuto++;
        actores=new ArrayList<>();
    }

    public Pelicula(GregorianCalendar fechaEstreno, String titulo) {
        this.fechaEstreno = fechaEstreno;
        this.titulo = titulo;
        id=idAuto;
        idAuto++;
        actores=new ArrayList<>();
    }

    public Pelicula.Genero getGenero() {
        return genero;
    }



    public GregorianCalendar getFechaEstreno() {
        return fechaEstreno;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }



    public ArrayList<Actor> actores(){

        return actores;
    }
    public boolean anyadirActor(Actor a){
        return actores.add(a);
    }

}
