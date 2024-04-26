package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.media.Media;

public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title) {
        setTitle(title);
    }

    public Disc(String title, String category, float cost) {
        setCategory(category);
        setTitle(title);
        setCost(cost);
    }

    public Disc(String title, String category, String director, float cost) {
        setCategory(category);
        setTitle(title);
        setCost(cost);
        this.director = director;
    }

    public Disc(String title, String category, String director, int length, float cost) {
        setCategory(category);
        setTitle(title);
        setCost(cost);
        this.length = length;
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }
}
