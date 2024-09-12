package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie extends Film {
    private static ArrayList<Movie> peliculas = new ArrayList<>();
    int id;
    private int year;
    boolean viewed;
    int timeViewed;

    public Movie(String title, String genre, String creator, int duration, int year){
        super(title, genre, creator, duration);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public static void addMovie(Scanner scanner){
        System.out.println("Ingrese el título de la pelicula:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el genero de la pelicula:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese el creador de la pelicula:");
        String creator = scanner.nextLine();

        System.out.println("Ingrese la duracion de la pelicula:");
        int duration = scanner.nextInt();

        System.out.println("Ingrese el año de la pelicula:");
        int year = scanner.nextInt();

        Movie pelicula=new Movie(title,genre,creator,duration, year);
        peliculas.add(pelicula);
        System.out.println("Pelicula agregada con exito");
    }

}
