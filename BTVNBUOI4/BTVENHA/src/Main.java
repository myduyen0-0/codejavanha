import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> stu = new ArrayList<>();

    public static void main(String[] args) {
        Student s = new Student();
        s.infoTable();
        stu.add(new Student("Duyn", 2005, "Hà Tĩn", 8.5, 9.5, 7.5, 10));
        stu.add(new Student("Mỳ Duýn", 2006, "Hà Tĩnh", 8, 7.5, 6.5, 15));
        stu.add(new Student("Mỹ Mỹ", 2004, "Hà Tịnh", 8.8, 7.6, 5, 5));

        int option;
        do {
            System.out.println("Quản lý sinh viên");
            System.out.println("1.Thêm sinh viên mới.");
            System.out.println("2.Sửa thông tin sinh viên.");
            System.out.println("3.Sắp xếp sinh viên theo tuổi.");
            System.out.println("4.Sắp xếp sinh viên theo GPA.");
            System.out.println("5.Sắp xếp sinh viên theo tiết nghỉ.");
            System.out.println("6.Xóa sinh viên khỏi danh sách.");
            System.out.println("7.Hiển thị danh sách sinh viên.");
            System.out.println("8.Thoát");
            System.out.println("Chọn: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1 -> addStudent();
                case 2 -> editInfoStudent();
                case 3 -> sortByAge();
                case 4 -> sortByGPA();
                case 5 -> sortByAbsentDays();
                case 6 -> deleteStudent();
                case 7 -> showStudent();
                case 8 -> {
                    System.out.println("Thoát khỏi chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
            if (option != 0) showStudent();
        }
        while (option != 0);
    }

    static void addStudent() {
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        int birthYear = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = sc.nextLine();
        System.out.print("Nhập điểm TX1: ");
        double TX1 = sc.nextDouble();
        System.out.print("Nhập điểm TX2: ");
        double TX2 = sc.nextDouble();
        System.out.print("Nhập điểm KTHP: ");
        double KTHP = sc.nextDouble();
        System.out.print("Nhập số tiết nghỉ: ");
        int absentDays = sc.nextInt();

        stu.add(new Student(name, birthYear, address, TX1, TX2, KTHP, absentDays));
        System.out.println("Đã thêm sinh viên.");
    }

    static void editInfoStudent() {
        System.out.print("Nhập tên sinh viên cần sửa thông tin: ");
        String name = sc.nextLine();
        for (Student st : stu) {
            if (st.getName().equalsIgnoreCase(name)) {     //equalsIgnoreCase so sánh chuỗi không phân biệt hoa thường
                System.out.print("Tên mới là: ");
                st.setName(sc.nextLine());
                System.out.print("Năm sinh mới là: ");
                st.setBirthYear(sc.nextInt());
                sc.nextLine();
                System.out.print("Địa chỉ mới lầ: ");
                st.setAddress(sc.nextLine());
                System.out.print("Điểm TX1 mới là: ");
                st.setTX1(sc.nextDouble());
                System.out.print("Điểm TX2 là: ");
                st.setTX2(sc.nextDouble());
                System.out.print("Điểm KTHP mới là: ");
                st.setKTHP(sc.nextDouble());
                System.out.print("Số tiết nghỉ mới là: ");
                st.setAbsentDays(sc.nextInt());
                sc.nextLine();
                System.out.println("Đã cập nhật thông tin mới.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }

    static void sortByAge() {
        stu.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("Đã sắp xếp sinh viên theo tuổi.");
    }

    static void sortByGPA() {
        stu.sort(Comparator.comparingDouble(Student::getGPA));
        System.out.println("Đã sắp xếp sinh viên theo điểm GPA.");
    }

    static void sortByAbsentDays() {
        stu.sort(Comparator.comparingInt(Student::getAbsentDays));
        System.out.println("Đã sắp xếp sinh viên theo ố tiết nghỉ.");
    }

    static void deleteStudent() {
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String name = sc.nextLine();
        stu.removeIf(stu->stu.getName().equalsIgnoreCase(name));
        System.out.println("Đã xóa sinh viên đó.");

    }

    static void showStudent() {
        if (stu.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        System.out.printf("|%-15s|%-5s|%-15s|%-5s|%-5s|%-5s|%-5s|%-5s|\n", "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Số tiết nghỉ");
        for (Student st : stu) {
            st.infoTable();
        }
    }
}