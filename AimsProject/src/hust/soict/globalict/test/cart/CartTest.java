package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class CartTest {
    private static Cart cart = new Cart();

    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addMedia(dvd1);
        cart.addMedia(dvd2);
        cart.addMedia(dvd3);
        cart.print();
        // Test search method
        System.out.println();
        search(19.0f, 20.0f);
        System.out.println();
        search(20.0f);
        System.out.println();
        search("lion");

        // Test equals override
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        System.out.println(dvd1.equals(dvd4));
    }

    public static void search(String keyword) {
        System.out.println("Search by keywords results:");
        for (var item : cart.getItemsOrdered()) {
            if (item.isMatch(keyword)) {
                System.out.println(item.toString());
            }
        }
    }

    public static void search(float maxCost) {
        System.out.println("Search by cost results:");
        for (var item : cart.getItemsOrdered()) {
            if (item.isMatch(maxCost)) {
                System.out.println(item.toString());
            }
        }
    }

    public static void search(float minCost, float maxCost) {
        System.out.println("Search by cost range results:");
        for (var item : cart.getItemsOrdered()) {
            if (item.isMatch(minCost, maxCost)) {
                System.out.println(item.toString());
            }
        }
    }

}
