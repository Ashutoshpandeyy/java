import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insrt_up1 {
    static final String DB_URL = "insrt:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = " ";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = con.createStatement();) {
            System.out.println("Inserting record in to the table..");
            String sql = "INSERT INTO Registration VALUES(100,'JAI',JARA,18)";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
