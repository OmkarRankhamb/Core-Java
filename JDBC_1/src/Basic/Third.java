package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class Third {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");

			PreparedStatement pre = con.prepareStatement("insert into classroom values (?,?,?)");
			Scanner sc = new Scanner(System.in);
			
			con.setAutoCommit(false);

			System.out.println("Enter the id");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the email");
			String email = sc.next();

			pre.setInt(1, 1);
			pre.setString(2, "name");
			pre.setString(3, "email");
			pre.addBatch();
			
		    int[] arr=pre.executeBatch();
			    con.commit();
			     for(int i:arr)
			     {
			    	 System.out.println(i);
			     }
			     System.out.println(":Commiting the changes....");
			    
	               

			int row = pre.executeUpdate();

			System.out.println("effect row " + row);

			sc.close();
			pre.close();
			con.close();

		
	}
}

class Student {
	int id;
	String name ;
	String Email;
}
