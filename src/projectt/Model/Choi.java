package projectt.Model;

public class Choi extends VuKhi {
    private double tamDanh;

    public Choi(String ten, int satThuong, int soLuong, double tamDanh) {
        super(ten, satThuong, soLuong, "Chổi");
        this.tamDanh = tamDanh;
    }

    public double getTamDanh() {
        return tamDanh;
    }

    public void setTamDanh(double tamDanh) {
        this.tamDanh = tamDanh;
    }

    @Override
    public int sucManh() {
        return (int) (getSatThuong() * tamDanh);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tầm Đánh: " + tamDanh;
    }
}
