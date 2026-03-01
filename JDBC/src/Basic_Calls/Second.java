package Basic_Calls;

import java.net.MulticastSocket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second {

	public static void main(String[] args) throws SQLException {
 

		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/",  "root", "1234");){
		
		Statement ste = con.createStatement();
		int row = ste.executeUpdate("insert into employee values(89,'dhj',123.88),(90,'XYZABC',123.88),(91,'XYZABC',123.88);\")");
		System.out.println("row effected =>"+row);
	}

}
}
