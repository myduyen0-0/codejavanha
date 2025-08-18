public class NVPartTime extends NhanVien {
    private int soGioLam;
    private double luongTheoGio;

    public NVPartTime(String maNV, String ten, int tuoi, String email, String soDienThoai,
                            int soGioLam, double luongTheoGio) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongTheoGio;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loại: Part Time");
    }
}
