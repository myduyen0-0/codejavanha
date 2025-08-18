public class Main {
    public static void main(String[] args) {
        QLNV ql = new QLNV();

        NhanVien nv1 = new NVFullTime("NV01", "Truong My Duyen", 19, "TMD@gmail.com", "0123456789", 1000, 200);
        NhanVien nv2 = new NVFullTime("NV02", "Truong My Duynn", 20, "MD@gmail.com", "0987654321", 1200, 300);

        NhanVien nv3 = new NVPartTime("NV03", "Duyn DUyn", 20, "DD@gmail.com", "0111222333", 80, 10);
        NhanVien nv4 = new NVPartTime("NV04", "My Duynnnn", 25, "MDuyn@gmail.com", "0445566777", 100, 12);

        ql.themNhanVien(nv1);
        ql.themNhanVien(nv2);
        ql.themNhanVien(nv3);
        ql.themNhanVien(nv4);

        // Hiển thị tất cả NV
        System.out.println(" Danh sách nhân viên ");
        ql.hienThiTatCa();

        // Tổng lương
        System.out.println(">>> Tổng lương của tất cả nhân viên: " + ql.tinhTongLuong());
    }
}
