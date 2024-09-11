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
        Publication.title = title;
        Publication.edititionDate = ediditionDate;
        Publication.editorial = editorial;
        this.isbn = isbn;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
