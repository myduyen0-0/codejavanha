import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String ten = scanner.nextLine();

        System.out.println("Chào bạn " + ten + "!");
    }
}
