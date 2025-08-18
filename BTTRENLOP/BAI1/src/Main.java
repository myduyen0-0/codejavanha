// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> arraylist = new ArrayList<>();

        arraylist.add(new SinhVien("2023", "Truong My Duyen", 8.0, "HTTT02", "Lớp A "));
        arraylist.add(new SinhVien("2024", "Truong My Duynnn", 5.5, "HTTT02", "Lớp B"));
        arraylist.add(new SinhVien("2025", "Truong My Dynnn", 7.3, "HTTT02", "Lớp C"));

        System.out.println(" Danh sách sinh viên ");
        for (SinhVien sv : arraylist) {
            sv.inThongTin();
            System.out.println("----------------------------");
        }

        // Tìm SV có điểm cao nhất
        SinhVien maxSV = arraylist.get(0);
        for (SinhVien sv : arraylist) {
            if (sv.getDiemTB() > maxSV.getDiemTB()) {
                maxSV = sv;
            }
        }

        System.out.println(">>> Sinh viên có điểm TB cao nhất:");
        maxSV.inThongTin();
    }
}
