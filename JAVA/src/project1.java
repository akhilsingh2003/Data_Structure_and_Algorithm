import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class project1
{
    public static void main(String[] args) throws ClassNotFoundException,SQLException  {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/e2_data", "root", "");
        PreparedStatement s = con.prepareStatement("insert into info values(?,?)");
        try{
            String  str;
            str = sc.nextLine();
            Pattern p=Pattern.compile("(0|[+]91)?[96][0-9]{9}");
            Pattern k=Pattern.compile("[a-zA-Z0-9._]+@gmail.com");
            Matcher m=p.matcher(str);
            Matcher neer = k.matcher(str);
            String val1 =null;
            String val2 =null;
            if(m.find())
            {


                val1 = m.group();


            }
            if ( neer.find())
            {

                val2 = neer.group();
            }
            if(val1 == null || val2 == null)
                throw new Exception("MY CUSTOM Exception ");
            else
            {
                s.setString(1,val1);
                s.setString(2,val2);
                s.executeUpdate();
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e);

        }

    }
}