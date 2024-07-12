package projectt;

import projectt.Model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gameManager {
    private List<NhanVat> danhSachNhanVat;
    private List<VuKhi> danhSachVuKhi;

    public gameManager() {
        this.danhSachNhanVat = new ArrayList<>();
        this.danhSachVuKhi = new ArrayList<>();
        // Thêm vũ khí mẫu
        danhSachVuKhi.add(new CungTen("Cung tên", 100, 100, 1.5));
        danhSachVuKhi.add(new Choi("Chổi Ma Thuật", 60, 100, 2.0));
    }

    public void menuChinh() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("|---- QUẢN LÝ GAME ----|");
            System.out.println("|1. Quản Lý Nhân Vật   |");
            System.out.println("|2. Quản Lý Vũ Khí     |");
            System.out.println("|3. Thoát              |");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    quanLyNhanVatMenu(scanner);
                    break;
                case 2:
                    quanLyVuKhiMenu(scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Chương trình kết thúc. Cảm ơn bạn đã sử dụng!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
        scanner.close();
    }

    private void quanLyNhanVatMenu(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Quản Lý Nhân Vật ---");
            System.out.println("Bạn muốn chọn nhân vật nào?");
            System.out.println("1. Binh Đoàn - Kỵ Binh");
            System.out.println("2. Tự Do - Phù Thủy");
            System.out.println("3. Hiển Thị Danh Sách Nhân Vật");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    themKyBinh(scanner);
                    break;
                case 2:
                    themPhuThuy(scanner);
                    break;
                case 3:
                    hienThiDanhSachNhanVat();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    private void quanLyVuKhiMenu(Scanner scanner) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Quản Lý Vũ Khí ---");
            System.out.println("1. Hiển Thị Danh Sách Vũ Khí");
            System.out.println("2. Thêm Vũ Khí Mới");
            System.out.println("3. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    hienThiDanhSachVuKhi();
                    break;
                case 2:
                    themVuKhi(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    private void themPhuThuy(Scanner scanner) {
        System.out.print("Nhập tên Phù Thủy: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        byte gioiTinh;
        while (true) {
            System.out.print("Nhập giới tính (0: Nam, 1: Nữ): ");
            gioiTinh = scanner.nextByte();
            if (gioiTinh == 0 || gioiTinh == 1) {
                break;
            } else {
                System.out.println("Giới tính không hợp lệ, vui lòng nhập lại.");
            }
        }
        System.out.print("Nhập năng lượng: ");
        double nangLuong = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập phép thuật: ");
        String phepThuat = scanner.nextLine();

        PhuThuy phuThuy = new PhuThuy(ten, id, gioiTinh, nangLuong, phepThuat);
        danhSachNhanVat.add(phuThuy);
        System.out.println("Thêm Phù Thủy thành công!");
    }

    private void themKyBinh(Scanner scanner) {
        System.out.print("Nhập tên Kỵ Binh: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();
        byte gioiTinh;
        while (true) {
            System.out.print("Nhập giới tính (0: Nam, 1: Nữ): ");
            gioiTinh = scanner.nextByte();
            if (gioiTinh == 0 || gioiTinh == 1) {
                break;
            } else {
                System.out.println("Giới tính không hợp lệ, vui lòng nhập lại.");
            }
        }
        System.out.print("Nhập năng lượng: ");
        double nangLuong = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập kinh nghiệm: ");
        String kinhNghiem = scanner.nextLine();

        KyBinh kyBinh = new KyBinh(ten, id, gioiTinh, nangLuong, kinhNghiem);
        danhSachNhanVat.add(kyBinh);
        System.out.println("Thêm Kỵ Binh thành công!");
    }

    private void hienThiDanhSachNhanVat() {
        if (danhSachNhanVat.isEmpty()) {
            System.out.println("Danh sách nhân vật rỗng.");
        } else {
            for (NhanVat nv : danhSachNhanVat) {
                System.out.println(nv);
            }
        }
    }

    private void hienThiDanhSachVuKhi() {
        if (danhSachVuKhi.isEmpty()) {
            System.out.println("Danh sách vũ khí rỗng.");
        } else {
            for (VuKhi vk : danhSachVuKhi) {
                System.out.println(vk);
            }
        }
    }

    private void themVuKhi(Scanner scanner) {
        System.out.println("Chọn loại vũ khí:");
        System.out.println("1. Cung Tên");
        System.out.println("2. Chổi");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Nhập tên Cung Tên: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập sát thương: ");
            int satThuong = scanner.nextInt();
            System.out.print("Nhập số lượng: ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhập tầm bắn: ");
            double tamBan = scanner.nextDouble();

            CungTen cungTen = new CungTen(ten, satThuong, soLuong, tamBan);
            danhSachVuKhi.add(cungTen);
            System.out.println("Thêm Cung Tên thành công!");
        } else if (choice == 2) {
            System.out.print("Nhập tên Chổi: ");
            String ten = scanner.nextLine();
            System.out.print("Nhập sát thương: ");
            int satThuong = scanner.nextInt();
            System.out.print("Nhập số lượng: ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhập tầm đánh: ");
            double tamDanh = scanner.nextDouble();

            Choi chổi = new Choi(ten, satThuong, soLuong, tamDanh);
            danhSachVuKhi.add(chổi);
            System.out.println("Thêm Chổi thành công!");
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    public static void main(String[] args) {
        gameManager gameManager = new gameManager();
        gameManager.menuChinh();
    }
}
