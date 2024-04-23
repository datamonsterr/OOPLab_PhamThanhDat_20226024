package hust.soict.globalict.aims.store;

import java.util.ArrayList;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc dvd) {
        itemsInStore.add(dvd);
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        itemsInStore.remove(dvd);
    }

    public void viewStore() {
        System.out.println("Items in store:");
        System.out.println("------------------------------------------------------------------");
        for (DigitalVideoDisc dvd : itemsInStore) {
            System.out.println(dvd.toString());
        }
        System.out.println("------------------------------------------------------------------");
    }
}
