package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Serie extends Film {
    private static ArrayList<Serie> series = new ArrayList<>();
    int id;
    int year;
    boolean viewed;
    int timeViewed;
    int sessionQuantity;

    public Serie(String title, String genre,String creator, int duration) {
        super(title,genre,creator,duration);
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public static void addSerie(Scanner scanner){
        System.out.println("Ingrese el título de la serie:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el genero de la serie:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese la duracion de la serie:");
        int duration = scanner.nextInt();

        Serie serie=new Serie(title,genre,creator,duration);
        series.add(serie);
        System.out.println("Serie agregada con exito");
    }
}
