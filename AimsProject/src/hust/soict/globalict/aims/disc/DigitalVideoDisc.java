package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.media.Media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    // constructor
    public DigitalVideoDisc(String title) {
        setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        setCategory(category);
        setTitle(title);
        setCost(cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        setCategory(category);
        setTitle(title);
        setCost(cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        setCategory(category);
        setTitle(title);
        setCost(cost);
        this.length = length;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("DVD - ")
                .append(getTitle())
                .append(" - ")
                .append(getCategory())
                .append(" - ")
                .append(director != null ? director : "Unknown")
                .append(" - ")
                .append(length != 0 ? length + " min" : "Unknown")
                .append(" : ")
                .append(getCost())
                .append("$");
        return str.toString();
    }

    public boolean isMatch(String title) {
        boolean titleMatch = getTitle().toLowerCase().contains(title.toLowerCase());
        boolean categoryMatch = getCategory().toLowerCase().contains(title.toLowerCase());
        return titleMatch || categoryMatch;
    }

    public boolean isMatch(float maxCost) {
        return getCost() <= maxCost;
    }

    public boolean isMatch(float minCost, float maxCost) {
        return getCost() >= minCost && getCost() <= maxCost;
    }
}
