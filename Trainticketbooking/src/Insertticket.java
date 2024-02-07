import java.sql.*;
public class Insertticket {
	 public static void insert () throws Exception {
		   String url = "jdbc:mysql://127.0.0.1:3306/tickett";
		   String username = "root";
		   String password = "priya";
		   String Query = "insert into train values(?,?,?,?,?,?)";
		   Connection con = DriverManager.getConnection(url, username, password);
		   PreparedStatement pst = con.prepareStatement(Query);
		   pst.setString(1, "ChennaiExpress");
		   pst.setInt(2, 2);
		   pst.setString(3, "Chennai");
		   pst.setString(4, "Mysore");
		   pst.setInt(5, 400);
		   pst.setString(6, "8.00Am");
		   pst.setString(1, "mumbaiexpress");
		   pst.setInt(2, 3);
		   pst.setString(3, "Chennai");
		   pst.setString(4, "Mumbai");
		   pst.setInt(5, 600);
		   pst.setString(6, "9.00Am");
		   pst.executeUpdate();
		   pst.close();
		   
		   }
		 
		   public static void main(String[]args) throws Exception {
			   insert();
		   }
		}


