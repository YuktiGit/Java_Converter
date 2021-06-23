import java.sql.*; 
import java.lang.*;
import java.util.Scanner;
public class MainTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String uname = "";
              String upass = "";
              String DB_URL = "jdbc:mysql:/ipadr/db";
              System.setProperty(DB_URL,uname,upass);
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
               String CREATE_TABLE_SQL="CREATE TABLE patient (SN INT, First_Name VARCHAR(45), Last_Name VARCHAR(45), Age INT);";
               String query = "insert into patient (UID, first_name, last_name, age)"  + " values (?, ?, ?, ?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, s);//uid
			preparedStmt.setString (2, "Ram");//name
			preparedStmt.setString (3, "Gopal");//lastname
			preparedStmt.setInt(4, 26);//age
			preparedStmt.execute();
			preparedStmt.setInt (1, 2);
			preparedStmt.setString (2, "John");
			preparedStmt.setString   (3, "Mayer");
			preparedStmt.setInt(4, 22);
			preparedStmt.execute();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM patient;");
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
			conn.close();
		}catch(Exception e){ System.out.println(e);}  
	}  
} 
