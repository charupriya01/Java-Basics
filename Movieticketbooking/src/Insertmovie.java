import java.sql.*;
public class Insertmovie {
	public static void insert() throws Exception {
    	String url = "jdbc:mysql://127.0.0.1:3306/movieticket";
    	String username = "root";
    	String password = "priya";
    	String Query = "insert into pvr values(?,?,?,?,)";
    	Connection con = DriverManager.getConnection(url, username, password);
    	PreparedStatement pst = con.prepareStatement(Query);
    	pst.setInt(1, 1);
    	pst.setString(2, "prinse");
    	pst.setInt(3, 4);
    	pst.setInt(4, 400);
    	pst.executeUpdate();
    	pst.close();
    	
    }
    
    public static void main(String[]args) throws Exception {
    	insert();
    }
}
