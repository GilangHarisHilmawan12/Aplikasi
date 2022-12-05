import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);
            System.out.println("Berhasil meregistrasi driver");
        }
        catch(SQLException ex){
            System.out.println("Gagal meregistrasi driver");
            System.out.println("Pesan : "+ex.getMessage());
        }
        try {
            String url="jdbc:mysql://Localhost:3306/db_toko";
            String user="root";
            String pass="";
            Connection koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Berhasil meregistrasi driver");
        }catch(SQLException ex) {
            System.out.println("Gagalmeregistrasi driver");
            System.out.println("Pesan :"+ex.getMessage());
        }
    }
    
}