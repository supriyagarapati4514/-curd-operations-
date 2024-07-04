package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletion {
	private static final String Driver="com.mysql.cj.jdbc.Driver" ;
	private static final String url="jdbc:mysql://localhost:3306/db1";
	private static final String username="root";
	private static final String password="root";
	private static PreparedStatement pmst;
	private static Connection conn;
	
		
	
  public static void main(String[] args) {
	try {
		 Scanner scr =new Scanner(System.in);
		 
					
		Class.forName(Driver);
		 conn = DriverManager.getConnection(url,username,password);
		 System.out.println("enter table name");
		String sql = "delete from student where email=?" ;
		
		
		 System.out.println("enter email");
		 pmst.setString(1,scr.next());
		 
		 int i= pmst.executeUpdate();
		 if (i>0) {
			 System.out.println("database is created succesful");
			
		}
		 else {
			System.out.println("database not created");
		}
		pmst.close();
		conn.close();
	}  
	catch (Exception e) {
		// TODO: handle exception
	}
}
}
