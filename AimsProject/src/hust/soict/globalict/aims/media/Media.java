package hust.soict.globalict.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

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

    public boolean equals(Object obj) {
        Media media = (Media) obj;
        return title == media.getTitle();
    }
}
