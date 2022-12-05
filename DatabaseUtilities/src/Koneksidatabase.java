import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
        
public class Koneksidatabase {
    private static Connection koneksi;
    public static Connection getkoneksi () {
        if (koneksi == null) {
            try{
                Driver driver = new Driver () ;
                DriverManager.registerDriver(driver);
                String url="jdbc:mysql://localhost:3306/db_toko";
                String user="root";
                String pass="";
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("koneksi berhasil");
            }
            catch (SQLException ex) {
                System.out.println("koneksi gagal");
                System.out.println("pesan : "+ex.getMessage());
            }
        }
        return koneksi;
    }
    
}
