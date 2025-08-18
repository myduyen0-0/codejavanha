import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. Thêm sách vào thư viện");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Tìm sách theo tác giả");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tiêu đề sách: ");
                    String title = sc.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Có nhập NXB không? (có/không): ");
                    String ans = sc.nextLine();

                    if (ans.equalsIgnoreCase("có")) {
                        System.out.print("Tên NXB: ");
                        String pubName = sc.nextLine();
                        System.out.print("Địa chỉ NXB: ");
                        String pubAddr = sc.nextLine();
                        Publisher publisher = new Publisher(pubName, pubAddr);
                        library.addBook(new Book(title, author, price, publisher));
                    } else {
                        library.addBook(new Book(title, author, price));
                    }
                    System.out.println("==> Đã thêm sách!");
                    break;

                case 2:
                    System.out.print("Hiển thị NXB? (có/không): ");
                    String show = sc.nextLine();
                    library.displayAllBooks(show.equalsIgnoreCase("có"));
                    break;

                case 3:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String searchAuthor = sc.nextLine();
                    library.searchByAuthor(searchAuthor);
                    break;

                case 4:
                    System.out.print("Nhập ID sách cần xóa: ");
                    int id = sc.nextInt();
                    library.removeBookById(id);
                    break;

                case 5:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);

        sc.close();
    }
}
