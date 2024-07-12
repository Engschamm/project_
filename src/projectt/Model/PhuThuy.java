package projectt.Model;

public class PhuThuy extends NhanVat implements DiChuyen {
    private String phepThuat;

    public PhuThuy(String ten, String id, byte gioiTinh, double nangLuong, String phepThuat) {
        super(ten, id, gioiTinh, nangLuong);
        this.phepThuat = phepThuat;
    }

    @Override
    public void hanhDong() {
        System.out.println(getTen() + " thực hiện phép thuật " + phepThuat + "!");
    }

    @Override
    public int sucManh() {
        return (int) (getNangLuong() * 1.5);
    }

    @Override
    public void sangTrai() {
        System.out.println(getTen() + " di chuyển sang trái.");
    }

    @Override
    public void sangPhai() {
        System.out.println(getTen() + " di chuyển sang phải.");
    }

    @Override
    public void nhayLen() {
        System.out.println(getTen() + " nhảy lên.");
    }

    @Override
    public void boChay() {
        System.out.println(getTen() + " bỏ chạy.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Phép Thuật: " + phepThuat;
    }
}
