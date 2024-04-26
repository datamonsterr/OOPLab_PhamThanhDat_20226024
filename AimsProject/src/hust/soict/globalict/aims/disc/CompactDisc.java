package hust.soict.globalict.aims.disc;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String title) {
        super(title);
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }

    public CompactDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public void addTrack(Track track) {
        for (var item : tracks) {
            if (item.equals(track)) {
                System.out.println("Track is already in the list");
                return;
            }
        }
        System.out.println("Track added");
    }

    public void removeTrack(Track track) {
        for (var item : tracks) {
            if (item.equals(track)) {
                tracks.remove(item);
                System.out.println("Track removed");
                return;
            }
        }
        System.out.println("Track not found");
    }

    public int getLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        return length;
    }

    public void play() {
        for (Track track : tracks) {
            track.play();
        }
    }
}
