package projectt.Model;

public abstract class VuKhi {
    private String ten;
    private int satThuong;
    private int soLuong;
    private String loaiVuKhi;

    public VuKhi(String ten, int satThuong, int soLuong, String loaiVuKhi) {
        this.ten = ten;
        this.satThuong = satThuong;
        this.soLuong = soLuong;
        this.loaiVuKhi = loaiVuKhi;
    }

    public String getTen() { return ten; }
    public int getSatThuong() { return satThuong; }
    public int getSoLuong() { return soLuong; }
    public String getLoaiVuKhi() { return loaiVuKhi; }

    public void setTen(String ten) { this.ten = ten; }
    public void setSatThuong(int satThuong) { this.satThuong = satThuong; }
    public void setSoLuong(int soLuong) { this.soLuong = soLuong; }
    public void setLoaiVuKhi(String loaiVuKhi) { this.loaiVuKhi = loaiVuKhi; }

    public void tangSoLuong(int soLuong) {
        this.soLuong += soLuong;
    }

    public void giamSoLuong(int soLuong) {
        this.soLuong = Math.max(0, this.soLuong - soLuong);
    }

    public abstract int sucManh();
    
    @Override
    public String toString() {
        return "Tên: " + ten + ", Sát Thương: " + satThuong + ", Số Lượng: " + soLuong + ", Loại: " + loaiVuKhi;
    }
}
