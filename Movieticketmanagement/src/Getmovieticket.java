import java.sql.*;
public class Getmovieticket {
	 public static void get () throws Exception {
		   String url = "jdbc:mysql://127.0.0.1:3306/movieticket";
		   String username = "root";
		   String password = "priya";
		   String Query = "select* from pvr" ;
		   Connection con = DriverManager.getConnection(url, username, password);
		   Statement st = con.createStatement();
		   ResultSet rs = st.executeQuery(Query);
		   while(rs.next()) {
			   System.out.println("ticket_id:"+rs.getInt(1));
			   System.out.println("movie_name:"+rs.getString(2));
			   System.out.println("screen_no:"+rs.getInt(3));
			   System.out.println("ticket_prise:"+rs.getInt(4));
			   
		   }
		   con.close();
		   }
		   
		   public static void main(String[]args) throws Exception {
			   get();
		   }
		}


