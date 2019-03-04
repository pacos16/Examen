package com.pacosignes.examen;
import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Main {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static Scanner lector=new Scanner(System.in);
    static Listado listado=new Listado();
    public static void main(String[] args) {




    }




    public static void anyadirPelicula(){
        String titulo;
        GregorianCalendar fecha=new GregorianCalendar();

        String nombreAct;
        String apellido1;
        String apellido2;
        boolean correcto;
        char aux='n';

        do {
            System.out.println("Introduzca un titulo");
            titulo=lector.nextLine();
        }while(titulo.length()<1);

        do{
            correcto=true;
            System.out.println("Dime una fecha");
            try{
                Date d=sdf.parse(lector.nextLine());
                fecha.setTime(d);
            }catch (ParseException pe){
                correcto=false;
                System.out.println("Formato no correcto");
            }

        }while(!correcto);

        Pelicula p= new Pelicula(fecha,titulo);

        listado.anyadirPelicula(p);



            System.out.println("Ahora vamos a itroducir los actores.");

            do {
                System.out.println("Dime el nombre del actor");
                nombreAct = lector.nextLine();

            } while (nombreAct.length() < 2);
            do {
                System.out.println("Dime el apellido del actor");
                apellido1 = lector.nextLine();

            } while (apellido1.length() < 2);
            do {
                System.out.println("quiere anyadir el segundo apellido");
                System.out.println("S/N");
                aux = lector.next().charAt(0);
                if (validar(aux, "SsNn")) {
                    if (aux == 's' || aux == 'S') {
                        apellido1 = lector.nextLine();
                    }


                } else {
                    System.out.println("La letra no es correcta");
                    correcto = false;
                }


            } while (!correcto && aux != 'n' && aux != 'N');



    }

    public static boolean validar(char c, String s) {
        for (int i = 0; i < s.length(); i++) {

            if (c == s.charAt(i)) {
                return true;
            }

        }
        return false;

    }
}
