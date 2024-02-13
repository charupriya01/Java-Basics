import java.sql.*;
public class Insertmovie  {
   public static void insert () throws Exception {
   String url = "jdbc:mysql://127.0.0.1:3306/movieticket";
   String username = "root";
   String password = "priya";
   String Query = "insert into pvr values(?,?,?,?)";
   Connection con = DriverManager.getConnection(url, username, password);
   PreparedStatement pst = con.prepareStatement(Query);
   pst.setInt(1, 2);
   pst.setString(2, "sweethome");
   pst.setInt(3, 5);
   pst.setInt(4, 243);
   pst.executeUpdate();
   pst.close();
   
   }
   
   public static void main(String[]args) throws Exception {
	   insert();
   }
}
