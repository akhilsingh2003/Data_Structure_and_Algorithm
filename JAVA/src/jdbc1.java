import java.sql.*;
class jdbc1{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akkk","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from detail");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+rs.getString(4));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}
