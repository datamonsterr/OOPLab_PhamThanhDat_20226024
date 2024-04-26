package hust.soict.globalict.aims.cart;

import java.util.ArrayList;

import hust.soict.globalict.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDER = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void addMedia(Media media) {
        if (itemsOrdered.size() <= MAX_NUMBERS_ORDER) {
            itemsOrdered.add(media);
        } else {
            System.out.println("The cart is almost full");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        } else {
            System.out.println("The item is not in the cart");
        }
    }

    public float totalCost() {
        float total = 0;
        for (var item : itemsOrdered) {
            total += item.getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (var item : itemsOrdered) {
            System.out.println(item.toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**************************************************");
    }

}
