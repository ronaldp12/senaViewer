package edu.misena.senaviewer.model;

public class Film {
    int id;
    String title;
    String genre;
    String creator;
    int duration;
    int year;
    boolean viewed;

    public Film(String title, String genre, String creator, int duration){
        this.title =title;
        this.genre =genre;
        this.creator =creator;
        this.duration =duration;
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

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", creator='" + creator + '\'' +
                ", duration=" + duration +
                '}';
    }
}
