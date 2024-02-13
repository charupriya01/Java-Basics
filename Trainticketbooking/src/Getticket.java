import java.sql.*;
public class Getticket {
	public static void get() throws Exception {
    	String url = "jdbc:mysql://127.0.0.1:3306/tickett";
    	String username = "root";
    	String password = "priya";
    	String Query = "select *from train";
    	Connection con = DriverManager.getConnection(url, username, password);
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery(Query);
    	while (rs.next()) {
    		System.out.println("trainname:" + rs.getString(1));
    		System.out.println("noofticket:" + rs.getInt(2));
    		System.out.println("stationfrom:" + rs.getString(3));
    		System.out.println("reservationupto:" + rs.getString(4));
    		System.out.println("ticketprise:" + rs.getInt(5));
    		System.out.println("timing:" + rs.getString(6));
    	}
    	con.close();
    	}
    
    
    public static void main(String[]args) throws Exception {
    	get();
    }
}
