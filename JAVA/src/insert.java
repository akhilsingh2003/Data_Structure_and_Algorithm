import java.util.*;
import java.sql.*;

public class insert extends jdbc {

    void insert()
    {
        try {
            String insertquery = "insert into Student values(7,'abhi',23);";
            Statement st = con.prepareStatement(insertquery);
            st.executeUpdate(String.valueOf(st));
            System.out.println("Values Inserteddd....");
        } catch (Exception e) {
            System.out.println("Values not inserted..");
        }
    }

    public static void main(String args[])
       {
        insert obj = new insert();

        }

}
