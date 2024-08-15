package edu.misena.senaviewer.model;

public class Movie {
    int id;
    private String title;
    private String genre;
    private String creator;
    private int duration;
    private int year;
    boolean viewed;
    int timeViewed;

    public Movie(String title, String genre, String creator, int duration){
        this.title=title;
        this.genre=genre;
        this.creator=creator;
        this.duration=duration;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
