import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println();
        }
    }

    public void checkOutItem(int index) {
        items.get(index).checkOut();
    }

    public void returnItem(int index) {
        items.get(index).returnItem();
    }
}
