package edu.misena.senaviewer.model;

import java.util.Date;

public class Publication {
    static String title;
    static Date edititionDate;
    static String editorial;
    String authors;

    public Publication(String title, Date edititionDate, String editorial) {
        this.title=title;
        this.edititionDate=edititionDate;
        this.editorial=editorial;
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

    public String toString(){
        return "Titulo: "+title+"Fecha de edicion: "+edititionDate+"Ediorial: "+ editorial;
    }
}
