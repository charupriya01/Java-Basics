import java.sql.*;
public class Deleteticket {
	public static void delete() throws Exception {
    	String url = "jdbc:mysql://127.0.0.1:3306/tickett";
    	String username = "root";
    	String password = "priya";
    	String Query = "delete from train where trainname = 'ChennaiExpress'";
    	Connection con = DriverManager.getConnection(url, username, password);
    	PreparedStatement pst = con.prepareStatement(Query);
    	pst.executeUpdate();
    	pst.close();
    	
    }
    
    public static void main(String[]args) throws Exception {
    	delete();
    }
}
