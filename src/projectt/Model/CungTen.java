package projectt.Model;

public class CungTen extends VuKhi {
    private double tamBan;

    public CungTen(String ten, int satThuong, int soLuong, double tamBan) {
        super(ten, satThuong, soLuong, "Cung");
        this.tamBan = tamBan;
    }

    public double getTamBan() {
        return tamBan;
    }

    public void setTamBan(double tamBan) {
        this.tamBan = tamBan;
    }

    @Override
    public int sucManh() {
        return (int) (getSatThuong() * tamBan);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tầm Bắn: " + tamBan;
    }
}
