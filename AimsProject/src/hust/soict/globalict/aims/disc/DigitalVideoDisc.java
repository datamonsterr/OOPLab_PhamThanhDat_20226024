package hust.soict.globalict.aims.disc;

public class DigitalVideoDisc extends Disc {
    public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("DVD - ")
                .append(getTitle())
                .append(" - ")
                .append(getCategory())
                .append(" - ")
                .append(getDirector() != null ? getDirector() : "Unknown")
                .append(" - ")
                .append(getLength() != 0 ? getLength() + " min" : "Unknown")
                .append(" : ")
                .append(getCost())
                .append("$");
        return str.toString();
    }

}
