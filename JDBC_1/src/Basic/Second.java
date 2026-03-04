package Basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Second {

	public static void main(String[] args) throws SQLException {

		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");

			PreparedStatement pre = con.prepareStatement("insert into classroom values (?,?,?)");
             Scanner sc = new Scanner(System.in);
             
             System.out.println("Enter the id");
              int id = sc.nextInt();
              
             System.out.println("Enter the name ");
             String name = sc.next();
             
             System.out.println("Enter the Email");
             String Email = sc.next();
             
             
             
             
			pre.setInt(1, 1);
			pre.setString(2, "name");
			pre.setString(3, "email");

			int row = pre.executeUpdate();

			System.out.println("Effect row => " + row);
			
			sc.close();
			con.close();
			pre.close();
		}
	

	}


