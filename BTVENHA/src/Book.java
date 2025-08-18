public class Book {
    private static int idCounter = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = idCounter++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this.bookId = idCounter++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = new Publisher("Unknown", "Unknown");
    }

    public int getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void displayInfo() {
        System.out.println("BookID: " + bookId + ", Title: " + title +
                ", Author: " + author + ", Price: " + price);
    }

    public void displayInfo(boolean showPublisher) {
        displayInfo();
        if (showPublisher) {
            publisher.displayInfo();
        } else {
            System.out.println("Publisher: Unknown");
        }
    }
}
