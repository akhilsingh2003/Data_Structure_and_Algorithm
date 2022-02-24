import java.sql.*;
public class jdbc
{
    Connection con;
    jdbc()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            String connectionURL="jdbc:mysql://localhost:3306/jdbc";
            con=DriverManager.getConnection(connectionURL,"root","root");
            System.out.println("hogya connection ");
       }
        catch(Exception e)
        {
            System.out.println("Connection failed .."+e);
        }
    }
    public static void main(String args[])
    {
        jdbc obj = new jdbc();
    }
}
