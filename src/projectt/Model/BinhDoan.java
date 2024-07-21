package projectt.Model;

import java.util.List;

public class BinhDoan {
    private List<KyBinh> dskb;

    public BinhDoan(List<KyBinh> dskb) {
        this.dskb = dskb;
    }

    public List<KyBinh> getDskb() {
        return dskb;
    }

    public void setDskb(List<KyBinh> dskb) {
        this.dskb = dskb;
    }

    public void hanhDong() {
        for (KyBinh kb : dskb) {
            kb.hanhDong();
        }
    }

    public int sucManh() {
        int totalStrength = 0;
        for (KyBinh kb : dskb) {
            totalStrength += kb.sucManh();
        }
        return totalStrength;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BinhDoan:\n");
        for (KyBinh kb : dskb) {
            sb.append(kb.toString()).append("\n");
        }
        return sb.toString();
    }
}
