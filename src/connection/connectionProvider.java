package connection;
import java.sql.*;

public class connectionProvider {
    public static Connection getCon()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
