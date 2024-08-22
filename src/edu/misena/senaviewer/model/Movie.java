package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Movie {
    private static ArrayList<Movie> peliculas = new ArrayList<>();
    int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private int year;
    boolean viewed;
    int timeViewed;

    public Movie(String title, String genre, String creator, int duration){
        this.title=title;
        this.genre=genre;
        this.creator=creator;
        this.duration=duration;
        this.year=year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

        Movie pelicula=new Movie(title,genre,creator,duration);
        peliculas.add(pelicula);
        System.out.println("Pelicula agregada con exito");
    }
}
