import java.sql.*;
public class Insertticket {
        public static void insert() throws Exception {
        	String url = "jdbc:mysql://127.0.0.1:3306/tickett";
        	String username = "root";
        	String password = "priya";
        	String Query = "insert into train values(?,?,?,?,?,?)";
        	Connection con = DriverManager.getConnection(url, username, password);
        	PreparedStatement pst = con.prepareStatement(Query);
        	pst.setString(1, "ChennaiExpress");
        	pst.setInt(2, 2);
        	pst.setString(3, "chennai");
        	pst.setString(4, "mumbai");
        	pst.setInt(5, 200);
        	pst.setString(6, "8.00PM");
        	pst.executeUpdate();
        	pst.close();
        	
        }
        
        public static void main(String[]args) throws Exception {
        	insert();
        }
}
