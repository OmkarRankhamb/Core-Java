package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First_1 {

	public static void main(String[] args) throws SQLException {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student",  "root", "1234");){
			
			Statement std = con.createStatement();
			
			int  row =std.executeUpdate("Insert into classroom values (1 , 'ABC','abc@gamil.com'),(2,'BCD','bcd@gmail.com');");
			
			System.out.println("Row effect => "+row);
			
			System.out.println(con);
			
			
			
		}
	}

}
