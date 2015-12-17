package abcmain ;
import java.sql.Connection ;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSetMetaData;
//import java.sql.Drivermanager;

public class datasql {
	 static Connection con ;
	 String dbdriver = "com.mysql.jdbc.Driver" ;
	 String dburl ="jdbc:mysql://localhost/data";
	 String dbuser = "bhautik";
	 String dbpassword = "kbhcar";
	 ResultSet rs ;
	 ResultSetMetaData rsmd ;
	 
	 Connection conn = null ;
	static  java.sql.Statement stmt = null ;
	 
	 datasql() throws SQLException, ClassNotFoundException
	 {
		 Connection conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
		 Class.forName(dbdriver);
		 stmt = conn.createStatement();
		 System.out.println("successfully connect!!!");
	 }
	 
	
}
