package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter {
    private static ArrayList<Chapter> capitulos = new ArrayList<>();
    int id;
    private String title;
    private int duration;
    private int year;
    boolean viewed;
    int timeviewed;
    int sessionNumber;

    public Chapter(String title, int duration, int year){
        this.title=title;
        this.duration=duration;
        this.year=year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    public static void addChapter(Scanner scanner){
        System.out.println("Ingrese el título del capitulo:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese la duracion del capitulo:");
        int duration = scanner.nextInt();

        System.out.println("Ingrese el año del capitulo:");
        int year = scanner.nextInt();

        Chapter capitulo=new Chapter(title,duration,year);
        capitulos.add(capitulo);
        System.out.println("Capitulo agregado con exito");
    }
}
