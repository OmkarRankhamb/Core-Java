package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Second {

	public static void main(String[] args) throws SQLException {
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student",  "root", "1234");){
       
		PreparedStatement pre = con.prepareStatement("insert into classroom values (?,?,?)");
		
		pre.setInt(1, 1);
		pre.setString(2, "name");
		pre.setString(3,"email");
		
	int row = 	pre.executeUpdate();
		
	System.out.println("Effect row => "+row);
		}
		
		
	}

}
