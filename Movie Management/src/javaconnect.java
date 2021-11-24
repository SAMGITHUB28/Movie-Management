import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;

    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie","root","1234");
            return con;
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
