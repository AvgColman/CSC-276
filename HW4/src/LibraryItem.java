public class LibraryItem {
    protected String title;
    protected String author;
    protected boolean isAvailable;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void checkOut() {
        isAvailable = false;
    }

    public void returnItem() {
        isAvailable = true;
    }

    public void displayDetails() {
        System.out.print(title + " by " + author + " - ");
        System.out.println(isAvailable ? "Available" : "Checked Out");
    }
}
