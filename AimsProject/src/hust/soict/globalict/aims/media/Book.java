package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private ArrayList<String> authors = new ArrayList<>();

    public Book() {

    }

    // generate getter and setter
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author is already in the list");
            return;
        }
        authors.add(authorName);
    }

    public void removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author is not in the list");
            return;
        }
        authors.remove(authorName);
    }
}
