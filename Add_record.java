package com.ncu.methods;

import java.sql.*; 
import java.lang.*;
import java.util.Scanner;
class Add_record{
   public static void add(){
      Scanner in = new Scanner(System.in);
      try{
         Connection conn = null;
         Statement stmt = null;
         String userName = "root";
         String password = "root";
         String url = "jdbc:mysql://localhost:3306/arogya";
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         conn =DriverManager.getConnection(url,userName,password);
         System.out.println("Database connection established.");
         
         stmt = conn.createStatement();      
             
         System.out.print("Enter Patient Adhaar Number : ");
         long a = in.nextLong();
         System.out.println();
         System.out.print("Enter Patient First Name : ");
         String f = in.nextLine();
         System.out.println();
         System.out.print("Enter Patient Last Name : ");
         String l = in.nextLine();
         System.out.println();
         System.out.print("Enter Patient Phone Number : ");
         long p = in.nextLong();
         System.out.println();
         System.out.print("Enter Patient Age : ");
         int ag = in.nextInt();
         System.out.println();
         
         //String CREATE_TABLE_SQL="CREATE TABLE patientrecords (SN INT, Patient_Name VARCHAR(45), Age INT, PhoneNo INT, Symptoms VARCHAR(1000));";
         //stmt.execute(CREATE_TABLE_SQL);
         
         String query = "insert into  patientrecords (SN, patient_name, age, phoneno, symptoms)"  + " values (?, ?, ?, ?,?)";
			PreparedStatement preparedStmt = conn.prepareStatement(query);
			preparedStmt.setInt (1, 1);//uid
			preparedStmt.setString (2, f);//name
			preparedStmt.setString (3, l);//lastname
		   preparedStmt.setInt(4, ag);//age
         preparedStmt.setInt(5, p);//phone
		  	preparedStmt.execute();
         
         stmt.execute("SELECT * FROM  patientrecords;");
            
		   ResultSet rs = stmt.getResultSet();
		  	while(rs.next())  
		      	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
		   	conn.close();
		   }catch(Exception e){ System.out.println(e);}  
	   }     
}