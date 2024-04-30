package hust.soict.globalict.aims;

import java.util.Scanner;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.CompactDisc;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.disc.Track;
import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.store.Store;

public class Aims {
    private static Scanner scanner = new Scanner(System.in);
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void main(String[] args) throws Exception {
        // Initialize store and some media
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book1 = new Book("Atomic Habits", "Self Help", 19.95f);
        book1.addAuthor("James Clear");
        CompactDisc cd1 = new CompactDisc("The Best of Mozart", "Classic", "Mozart", 15.99f);
        Track track1 = new Track("Chung ta cua tuong lai", "Son Tung MTP", 1);
        Track track2 = new Track("Bad Guy", "Billie Eilish", 2);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        cd1.play();

        store.addMedia(dvd1);
        store.addMedia(cd1);
        store.addMedia(book1);

        // Application loop
        mainMenu: while (true) {
            showMenu();
            int choiceMain = scanner.nextInt();
            switch (choiceMain) {
                case 1:
                    store.viewStore();
                    storeMenu: while (true) {
                        storeMenu();
                        int choiceStore = scanner.nextInt();
                        switch (choiceStore) {
                            case 1:
                                choiceViewStore.seeMediaDetails();
                                break;
                            case 2:
                                choiceViewStore.addMediaToStore();
                                break;
                            case 3:
                                choiceViewStore.playAMedia();
                                break;
                            case 4:
                                cart.print();
                                break;
                            case 0:
                                break storeMenu;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    scanner.close();
                    break mainMenu;
                default:
                    System.out.println("Please choose a valid option!");
                    break;
            }
        }
    }

    private class choiceViewStore {
        public static void seeMediaDetails() {
            System.out.print("Enter the title of media: ");
            scanner.nextLine();
            String title = scanner.nextLine();
            for (var item : store.getItemsInStore()) {
                if (item.getTitle().toLowerCase().equals(title.toLowerCase())) {
                    System.out.println(item.toString());
                    outerloop: while (true) {
                        mediaDetailsMenu();
                        int choiceDetailsMenu = scanner.nextInt();
                        switch (choiceDetailsMenu) {
                            case 1:
                                if (item instanceof DigitalVideoDisc) {
                                    ((DigitalVideoDisc) item).play();
                                } else if (item instanceof CompactDisc) {
                                    ((CompactDisc) item).play();
                                } else {
                                    System.out.println("This media is not playable");
                                }
                                break;
                            case 2:
                                cart.addMedia(item);
                                break;
                            case 0:
                                System.out.println("Bye");
                                break outerloop;
                            default:
                                break;
                        }
                    }
                    break;
                }
            }
        }

        public static void addMediaToStore() {
            System.out.print("Enter the title of media: ");
            scanner.nextLine();
            String title = scanner.nextLine();
            for (var item : store.getItemsInStore()) {
                if (item.getTitle().toLowerCase().equals(title.toLowerCase())) {
                    cart.addMedia(item);
                }
            }
        }

        public static void playAMedia() {
            System.out.print("Enter the title of media: ");
            scanner.nextLine();
            String title = scanner.nextLine();
            for (var item : store.getItemsInStore()) {
                if (item.getTitle().toLowerCase().equals(title.toLowerCase())) {
                    if (item instanceof DigitalVideoDisc) {
                        ((DigitalVideoDisc) item).play();
                    } else if (item instanceof CompactDisc) {
                        ((CompactDisc) item).play();
                    } else {
                        System.out.println("This media is not playable");
                    }
                }
            }
        }

    }

    public static void showMenu() {
        System.out.println("AIMS:");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options:");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to the store");
        System.out.println("3. Play a media");
        System.out.println("4. See current Cart");
        System.out.println("0. Exit");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options:");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1. Play");
        System.out.println("2. Add to cart");
        System.out.println("0. Back");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
}
