import java.sql.*;
public class Deletemovie {
	public static void delete() throws Exception {
    	String url = "jdbc:mysql://127.0.0.1:3306/movieticket";
    	String username = "root";
    	String password = "priya";
    	String Query = "delete from pvr where train_id = '1'";
    	Connection con = DriverManager.getConnection(url, username, password);
    	PreparedStatement pst = con.prepareStatement(Query);
    	pst.executeUpdate();
    	pst.close();
    	
    }
    
    public static void main(String[]args) throws Exception {
    	delete();
    }
}
