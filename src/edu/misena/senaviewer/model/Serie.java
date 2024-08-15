package edu.misena.senaviewer.model;

public class Serie {
    int id;
    private String title;
    private String genre;
    String creator;
    private int duration;
    int year;
    boolean viewed;
    int timeViewed;
    int sessionQuantity;

    public Serie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
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
}
