package edu.misena.senaviewer.model;

import java.util.Date;

public class Book {
    int id;
    private String title;
    private Date edititionDate;
    private String editorial;
    String authors;
    private int isbn;
    boolean readed;
    int timeReaded;


    public Book(String title, Date ediditionDate, String editorial, int isbn) {
        this.title = title;
        this.edititionDate = ediditionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(Date edititionDate) {
        this.edititionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

}
