
    public class LopHoc {
        private String maLop;
        private String tenLop;

        public LopHoc(String maLop, String tenLop) {
            this.maLop = maLop;
            this.tenLop = tenLop;
        }

        public void inThongTin() {
            System.out.println("Mã lớp: " + this.maLop + ", Tên lớp: " + this.tenLop);
        }

        public String getMaLop() {
            return maLop;
        }

        public void setMaLop(String maLop) {
            this.maLop = maLop;
        }

        public String getTenLop() {
            return tenLop;
        }

        public void setTenLop(String tenLop) {
            this.tenLop = tenLop;
        }
    }
