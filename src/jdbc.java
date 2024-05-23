import java.sql.Connection;
import java.sql.DriverManager;

class Song{
    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/music_db", "root", "");

        if (con !=null) {
            System.out.println("Connection Sucessfull");
        } else {
            System.out.println("Connection Failed");
        }
    }
}