public class NhanVien {
    protected String maNV;
    protected String ten;
    protected int tuoi;
    protected String email;
    protected String soDienThoai;

    public NhanVien(String maNV, String ten, int tuoi, String email, String soDienThoai) {
        this.maNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public double tinhLuong() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV + ", Tên: " + ten + ", Tuổi: " + tuoi);
        System.out.println("Email: " + email + ", SĐT: " + soDienThoai);
        System.out.println("Lương: " + tinhLuong());
    }
}
