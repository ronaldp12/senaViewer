package edu.misena.senaviewer.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Magazine extends Publication {
    private static ArrayList<Magazine> revistas = new ArrayList<>();
    int id;
    String authors;

    public Magazine(String title, Date edititionDate, String editorial) {
        super(title, edititionDate, editorial);
        Publication.title = title;
        Publication.edititionDate = edititionDate;
        Publication.editorial = editorial;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Publication.title = title;
    }

    public Date getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(Date edititionDate) {
        Publication.edititionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        Publication.editorial = editorial;
    }
    public static void addMagazine(Scanner scanner) throws ParseException {
        System.out.println("Ingrese el título de la revista:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese la fecha de edicion de la revista:");
        String fecha = scanner.nextLine();
        SimpleDateFormat convertir = new SimpleDateFormat();
        Date edititionDate= convertir.parse(fecha);

        System.out.println("Ingrese la editorial de la revista:");
        String editorial = scanner.nextLine();

        Magazine revista=new Magazine(title,edititionDate,editorial);
        revistas.add(revista);
        System.out.println("Revista agregada con exito");
    }
}
