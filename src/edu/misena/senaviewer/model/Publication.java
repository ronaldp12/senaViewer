package edu.misena.senaviewer.model;

import java.util.Date;

public class Publication {
    String title;
    Date edititionDate;
    String editorial;
    String authors;

    public Publication(String title, Date edititionDate, String editorial) {
        this.title =title;
        this.edititionDate =edititionDate;
        this.editorial =editorial;
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

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", edititionDate=" + edititionDate +
                ", editorial='" + editorial + '\'' +
                '}';
    }
}
