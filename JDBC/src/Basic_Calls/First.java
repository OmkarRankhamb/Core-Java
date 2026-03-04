package Basic_Calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) throws SQLException {
		
	
     
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shcool",  "root", "1234");
			    
		Statement ste = con.createStatement();
		int row = ste.executeUpdate("insert into shcool values(89,'dhj',123.88),(90,'XYZABC',123.88),(91,'XYZABC',123.88);\")");
		System.out.println("row effected =>"+row);
   
		System.out.println("connection established");
		con.close();
	}

}
