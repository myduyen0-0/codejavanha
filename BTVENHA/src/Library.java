import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        if (books.isEmpty()) {
            System.out.println("Thư viện chưa có sách!");
            return;
        }
        for (Book book : books) {
            book.displayInfo(showPublisher);
            System.out.println("----------------------");
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                book.displayInfo(true);
                System.out.println("----------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách của tác giả: " + author);
        }
    }

    public void removeBookById(int bookId) {
        Book toRemove = null;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                toRemove = book;
                break;
            }
        }
        if (toRemove != null) {
            books.remove(toRemove);
            System.out.println("Đã xóa sách có ID = " + bookId);
        } else {
            System.out.println("Không tìm thấy sách có ID = " + bookId);
        }
    }
}
