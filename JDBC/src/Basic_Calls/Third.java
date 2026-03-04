package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Third {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shcool",  "root", "1234");
		
		PreparedStatement pre = con.prepareStatement("Insert into student values( ? ,?,?)");
		
	pre.setInt(1, 1);
	pre.setString(2, "Name");
     pre.setString(3,"email");
     
     int row = pre.executeUpdate();
     
     System.out.println(row);
     con.close();
     
     pre.close();
     
     
	}

}
