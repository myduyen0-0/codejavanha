import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r (double): ");
        double r = sc.nextDouble();

        System.out.print("Nhập số mũ k (int): ");
        int k = sc.nextInt();
        double ChuVi = 2 * PI * r;
        double DienTich = PI * r * r;
        double Mu = Math.pow(r, k);
        double CanBacHai = Math.sqrt(r + k);
        double GiatriTuyetDoi = Math.abs(r - k);
    }

    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính r (double): ");
        double r = sc.nextDouble();

        System.out.print("Nhập số mũ k (int): ");
        int k = sc.nextInt();

        System.out.println("\n--- Kết quả ---");
        System.out.println("Chu vi hình tròn: " + tinhChuVi(r));
        System.out.println("Diện tích hình tròn: " + tinhDienTich(r));
        System.out.println("r mũ k: " + tinhLuyThua(r, k));
        System.out.println("Căn bậc hai của (r + k): " + tinhCan(r, k));
        System.out.println("Giá trị tuyệt đối của (r - k): " + tinhGiaTriTuyetDoi(r, k));
    }
}
