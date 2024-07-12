package projectt.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class NhanVat implements DiChuyen {
    private String ten;
    private String id;
    private byte gioiTinh; // 0: Nam, 1: Nữ
    private double nangLuong;
    private List<VuKhi> dsvk;

    public NhanVat(String ten, String id, byte gioiTinh, double nangLuong) {
        this.ten = ten;
        this.id = id;
        this.gioiTinh = gioiTinh;
        this.nangLuong = nangLuong;
        this.dsvk = new ArrayList<>();
    }

    public String getTen() {
        return ten;
    }

    public String getId() {
        return id;
    }

    public byte getGioiTinh() {
        return gioiTinh;
    }

    public double getNangLuong() {
        return nangLuong;
    }

    public List<VuKhi> getDsvk() {
        return dsvk;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGioiTinh(byte gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNangLuong(double nangLuong) {
        this.nangLuong = nangLuong;
    }

    public void themVuKhi(VuKhi vuKhi) {
        dsvk.add(vuKhi);
    }

    @Override
    public String toString() {
        return "Tên: " + ten + ", ID: " + id + ", Giới Tính: " + (gioiTinh == 0 ? "Nam" : "Nữ") + 
               ", Năng Lượng: " + nangLuong + ", Vũ Khí: " + dsvk;
    }

    public abstract void hanhDong();
    public abstract int sucManh();

    // DiChuyen methods
    @Override
    public void sangTrai() {
        System.out.println(ten + " di chuyển sang trái.");
    }

    @Override
    public void sangPhai() {
        System.out.println(ten + " di chuyển sang phải.");
    }

    @Override
    public void nhayLen() {
        System.out.println(ten + " nhảy lên.");
    }

    @Override
    public void boChay() {
        System.out.println(ten + " bỏ chạy.");
    }
}
