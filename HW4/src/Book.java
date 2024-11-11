public class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + pages);
    }
}
