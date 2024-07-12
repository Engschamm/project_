package projectt.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance; // Biến lưu trữ instance duy nhất
    private String username; // Tên người dùng kết nối
    private String password; // Mật khẩu kết nối
    private String ipad; // Địa chỉ IP của máy chủ cơ sở dữ liệu
    private String port; // Cổng kết nối đến cơ sở dữ liệu
    private Connection conn; // Đối tượng kết nối đến cơ sở dữ liệu

    // Constructor riêng tư để khởi tạo đối tượng
    private DBConnection(String username, String password, String ipad, String port) {
        this.username = username;
        this.password = password;
        this.ipad = ipad;
        this.port = port;
        connect(); // Gọi phương thức để thiết lập kết nối
    }

    // Phương thức thiết lập kết nối đến cơ sở dữ liệu
    private void connect() {
        try {
            // Đường dẫn kết nối đến cơ sở dữ liệu
            String url = "jdbc:mysql://" + ipad + ":" + port + "/your_database_name";
            // Tạo kết nối
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace(); // In ra thông báo lỗi nếu có
        }
    }

    // Phương thức để lấy instance của DBConnection
    public static DBConnection getInstance(String username, String password, String ipad, String port) {
        if (instance == null) { // Nếu chưa có instance
            instance = new DBConnection(username, password, ipad, port); // Tạo mới instance
        }
        return instance; // Trả về instance
    }

    // Phương thức để lấy đối tượng Connection
    public Connection getConnection() {
        return conn; // Trả về đối tượng kết nối
    }
}
