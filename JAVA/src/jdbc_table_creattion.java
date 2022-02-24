import java.sql.*;
import java.util.*;
public class jdbc_table_creattion {
    Connection con;
    String connectionURL = "jdbc:mysql://localhost:3306/Jdbc";

    jdbc_table_creattion() {

        try (Connection conn = DriverManager.getConnection(connectionURL, "root", "root");
             Statement s = conn.createStatement();)
        {
            String createTable = "CREATE TABLE Car3 " +
                    "(ChassisNumber  VARCHAR(17) PRIMARY KEY, " +
                    " BrandName VARCHAR(20), " +
                    " ModelName varchar(25), " +
                    " Manufacturing Integer(4))";




            s.executeUpdate(createTable);
            System.out.println("Created table in given database...");


            ResultSet rs=s.executeQuery("select BrandName,ModelName from Car1 where " +
                    "Manufacturing>2019");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    void insert() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the chassis number:");
            String ChassisNumber = sc.next();

            System.out.println("Enter BrandName:");
            String BrandName  = sc.next();

            System.out.println("Enter ModelName :");
            String ModelName= sc.next();

            System.out.println("Enter Manufacturing year :");
            int Manufacturing= sc.nextInt();


            String insertquery = "insert into Student values(?,?,?,?);";

            PreparedStatement pst = con.prepareStatement(insertquery);

            pst.setString(1,ChassisNumber);
            pst.setString(2,BrandName) ;
            pst.setString(3, ModelName);
            pst.setInt(4,Manufacturing);

            pst.executeUpdate();
            System.out.println("Values Inserteddd....");
        } catch (Exception e) {
            System.out.println("Values not inserted..");
        }
    }


    public static void main(String args[]) {
        jdbc_table_creattion obj = new jdbc_table_creattion();

        while (true) {
            System.out.println("\nPress 1 for Insert");
            Scanner sc3 = new Scanner(System.in);
            int choice = sc3.nextInt();

            switch (choice) {
                case 1:
                    obj.insert();
                    break;
                default:
                    System.out.println("Wrong choice");
            }

        }
    }
}
