package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Serie extends Film {
    private static ArrayList<Serie> series = new ArrayList<>();
    int id;
    int year;
    boolean viewed;
    int timeViewed;

    public Serie(String title, String genre,String creator, int duration) {
        super(title,genre,creator,duration);
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

    public static void addSerie(Scanner scanner){
        System.out.println("Ingrese el título de la serie:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese el genero de la serie:");
        String genre = scanner.nextLine();

        System.out.println("Ingrese el creador de la serie:");
        String creator = scanner.nextLine();

        System.out.println("Ingrese la duracion de la serie:");
        int duration = scanner.nextInt();

        Serie serie=new Serie(title,genre,creator,duration);
        series.add(serie);
        System.out.println("Serie agregada con exito");
    }
}
