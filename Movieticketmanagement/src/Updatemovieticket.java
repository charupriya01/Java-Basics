import java.sql.*;
public class Updatemovieticket {
	 public static void update () throws Exception {
		   String url = "jdbc:mysql://127.0.0.1:3306/movieticket";
		   String username = "root";
		   String password = "priya";
		   String Query = "update pvr set ticket_prise = '100' where ticket_id = '2'";
		   Connection con = DriverManager.getConnection(url, username, password);
		   PreparedStatement pst = con.prepareStatement(Query);
		   pst.executeUpdate();
		   pst.close();
		   
		   }
		   
		   public static void main(String[]args) throws Exception {
			   update();
		   }
		}



