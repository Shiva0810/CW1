
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public abstract class encrypt extends dao 
{
    static private String ID = "";
    static private String password = "";
     static private String url = "plain.txt";
    static private Connection conection = null;
    static private Statement stmt ;
    static private ResultSet RS = null ;
    
 public encrypt (String Routestage){
        super () ;
        try {
            Connection connection = DriverManager.getConnection(url, ID, password);
             stmt = (Statement) connection.createStatement();
        }catch (SQLException ex) { System.out.println(ex);}
 }
}
