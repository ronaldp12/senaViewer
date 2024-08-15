package edu.misena.senaviewer.model;

public class Chapter {
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
}
