package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDER) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 < MAX_NUMBERS_ORDER) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("2 discs has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (qtyOrdered + dvdList.length < MAX_NUMBERS_ORDER) {
            for (int i = 0; i < dvdList.length; i++) {
                itemsOrdered[qtyOrdered] = dvdList[i];
                qtyOrdered++;
            }
        } else {
            System.out.println("There's not enough space in the cart.");
        }
        System.out.println(dvdList.length + " discs have been added.");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered > 0) {
            for (int i = 0; i < qtyOrdered; i++) {
                if (disc == itemsOrdered[i]) {
                    for (int j = i; j < qtyOrdered - 1; j++) {
                        itemsOrdered[j] = itemsOrdered[j + 1];
                    }
                    qtyOrdered--;
                    System.out.println("The disc has been removed.");
                    return;
                }
            }
            System.out.println("The disc is not in the cart.");
        } else {
            System.out.println("The cart is empty.");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }

    public void search(String keyword) {
        System.out.println("Search by keywords results:");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keyword)) {
                System.out.println(itemsOrdered[i].toString());
            }
        }
    }

    public void search(float maxCost) {
        System.out.println("Search by cost results:");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(maxCost)) {
                System.out.println(itemsOrdered[i].toString());
            }
        }
    }

    public void search(float minCost, float maxCost) {
        System.out.println("Search by cost range results:");
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(minCost, maxCost)) {
                System.out.println(itemsOrdered[i].toString());
            }
        }
    }
}
