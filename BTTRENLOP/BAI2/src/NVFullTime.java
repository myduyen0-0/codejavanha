public class NVFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NVFullTime(String maNV, String ten, int tuoi, String email, String soDienThoai,
                            double luongCoBan, double tienThuong) {
        super(maNV, ten, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + tienThuong;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Loại: Full Time");
    }
}
