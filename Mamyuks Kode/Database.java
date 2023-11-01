import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    String dbURL = "jdbc:mysql://localhost/mamyukss";
    String user = "root";
    String pass = "";
    Statement st;
   

    Connection con;

    public Connection connect() {
        try {
            Class.forName(jdbcDriver);
            System.out.println("Class Berhasil di Panggil.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class eror.");
            return null;
        }

        try {
            con = DriverManager.getConnection(dbURL, user, pass);
            if (con != null) {
                System.out.println("Koneksi Berhasil.");
                st = con.createStatement();
                return con;
                // Lakukan operasi database di sini
            }
        } catch (SQLException ex) {
            System.out.println("Koneksi gagal " + ex.getMessage());
        }
        return null;
    }

    public void disconnect() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Koneksi ditutup.");
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
