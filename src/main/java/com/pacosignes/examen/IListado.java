package com.pacosignes.examen;
import java.util.ArrayList;

public interface IListado {

    Pelicula masAntigua();
    Actor masParticipaciones();
    ArrayList<Pelicula> buscar(Pelicula.Genero genero);
    ArrayList<Pelicula> buscar(Actor actor);


}
