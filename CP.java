import java.sql.Connection;
import java.sql.DriverManager;



public class CP 
{
    static Connection con;
    public static Connection createC()
    {
        try
        {
            //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create the connection..
            String username = "root";
            String password = "root";
            String url = "jdbc:mysql://127.0.0.1:3306/student_manage";
            con= DriverManager.getConnection(url,password,username);





        } 
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return con;
        
    }
    
}
