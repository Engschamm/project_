package projectt.Model;

public class KyBinh extends NhanVat {
    private String kinhNghiem;

    public KyBinh(String ten, String id, byte gioiTinh, double nangLuong, String kinhNghiem) {
        super(ten, id, gioiTinh, nangLuong);
        this.kinhNghiem = kinhNghiem;
    }

    @Override
    public void hanhDong() {
        System.out.println(getTen() + " chiến đấu với kinh nghiệm " + kinhNghiem + "!");
    }

    @Override
    public int sucManh() {
        return (int) getNangLuong(); // Example strength calculation
    }
}
