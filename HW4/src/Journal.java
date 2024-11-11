public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue No.: " + issueNumber);
    }
}
