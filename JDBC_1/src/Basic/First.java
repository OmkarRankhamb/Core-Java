package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class First {

	public static void main(String[] args) throws Exception{
		
	try(	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school",  "root", "1234");){
        
		Statement std = con.createStatement();
		
	int row =	std.executeUpdate("Insert into class values (89,'dhj'),(90,'XYZ'),(91,'ABC');");
		
	System.out.println("row effected =>"+row);
		
		    
		    System.out.println("Effect::"+con);
	}
		
	}

}
