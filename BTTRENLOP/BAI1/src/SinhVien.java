
public class SinhVien {
    private String maSV;
    private String name;
    private double diemTB;
    private LopHoc lop;

    public SinhVien(String maSV, String name, double diemTB, String maLop, String tenLop) {
        this.maSV = maSV;
        this.name = name;
        this.diemTB = diemTB;
        this.lop = new LopHoc(maLop, tenLop);
    }

    public void inThongTin() {
        System.out.println("Mã SV: " + this.maSV + ", Họ tên: " + this.name + ", Điểm TB: " + this.diemTB);
        lop.inThongTin();
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = (double) diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }
}
