package edu.misena.senaviewer.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Book extends Publication {
    private static ArrayList<Book> libros = new ArrayList<>();
    int id;
    String authors;
    private int isbn;
    boolean readed;
    int timeReaded;


    public Book(String title, Date ediditionDate, String editorial, int isbn) {
        super(title,ediditionDate,editorial);
        this.title = title;
        this.edititionDate = ediditionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    public static void addBook(Scanner scanner) throws ParseException {
        System.out.println("Ingrese el título del libro:");
        String title = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Ingrese la fecha de edicion del libro:");
        String fecha = scanner.nextLine();
        SimpleDateFormat convertir = new SimpleDateFormat("dd/MM/yyyy");
        Date edititionDate= convertir.parse(fecha);

        System.out.println("Ingrese la editorial del libro:");
        String editorial = scanner.nextLine();

        System.out.println("Ingrese el ISBN del libro:");
        int isbn = scanner.nextInt();
        scanner.nextLine();

        Book libro=new Book(title,edititionDate,editorial,isbn);
        libros.add(libro);
        System.out.println("Libro agregado con exito");
    }

}
