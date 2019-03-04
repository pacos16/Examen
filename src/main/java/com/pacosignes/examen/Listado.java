package com.pacosignes.examen;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Listado implements IListado {

    private ArrayList<Pelicula> peliculas;


    public Listado() {
        peliculas=new ArrayList<>();
    }

    @Override
    public Pelicula masAntigua() {
        GregorianCalendar min=new GregorianCalendar();

        for (Pelicula p:peliculas
             ) {
            if(p.getFechaEstreno().before(min)){
                min=p.getFechaEstreno();

            }

        }
        for(Pelicula p:peliculas){
            if(min==p.getFechaEstreno()){
                return p;
            }
        }

        return null;
    }

    @Override
    public Actor masParticipaciones() {
        int max=0;
        int clave=-1;
        Map<Integer,Integer> contador=new HashMap<>();

        for (Pelicula p:peliculas
             ) {
            for (Actor a:p.actores()
                 ) {

                if(contador.get(a.getId())!=null){
                    contador.put(a.getId(),contador.get(a.getId())+1);
                }else{
                    contador.put(a.getId(),1);
                }
            }

        }
        for(Map.Entry<Integer,Integer> map:contador.entrySet()){
            if(map.getValue()>max){

                max= map.getValue();
                clave=map.getKey();

            }
        }

        for (Pelicula peli: peliculas
             ) {
            for (Actor a:peli.actores()
                 ) {
                if (clave==a.getId()){
                    return a;
                }
            }
        }


        return null;
    }

    @Override
    public ArrayList<Pelicula> buscar(Pelicula.Genero genero) {

        ArrayList<Pelicula> p= new ArrayList<>();

        for (Pelicula peli:peliculas
             ) {
            if(peli.getGenero().equals(genero)){
                p.add(peli);
            }
        }
        return p;
    }

    @Override
    public ArrayList<Pelicula> buscar(Actor actor) {
        ArrayList<Pelicula> pelis=new ArrayList<>();
        for (Pelicula p: peliculas){
            for (Actor a:p.actores()
                 ) {
                if (actor.equals(a)){
                    pelis.add(p);
                }
            }
        }
        return pelis;
    }

    public boolean anyadirPelicula(Pelicula p){

        return peliculas.add(p);
    }

    public ArrayList<Pelicula> getPeliculas(){
        return peliculas;
    }
}
