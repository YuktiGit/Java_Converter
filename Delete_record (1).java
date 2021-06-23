import java.sql.*; 
import java.lang.*;
import java.util.Scanner;
class Delete_record{
   public static void del(){
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      try{
         Connection conn = null;
         Statement stmt = null;
         String userName = "root";
         String password = "Binay@123";
         String url = "jdbc:mysql://localhost:3306/arogya";
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         conn =DriverManager.getConnection(url,userName,password);
         System.out.println("Database connection established.");
         stmt = conn.createStatement();
         System.out.println("TABLE FOR DELETING RECORD: ");
         ResultSet rs = stmt.executeQuery("SELECT * FROM patient;"); 
         System.out.print("\n");
 			while(rs.next()){
				System.out.println(rs.getInt("SN")+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getInt(6)+"  "+rs.getString(7));
         }
         while(true){
            System.out.print("\n");
            System.out.println("For deleting using Serial Number , Press 1");
            System.out.println("For deleting using First Name Only , Press 2");
            System.out.println("For deleting using Name and Phone number's last three digits , Press 3");
            System.out.println("For deleting using Aadhar's last 4 digits , Press 4");
            System.out.println("For displaying Table , Press 5");
            System.out.println("For exiting , Press 6");
            System.out.print("Enter choice :");
            choice = sc.nextInt();
            if(choice==1){
               System.out.print("\nEnter Serial Number: ");     //System.out.print("\n");
               int serial = sc.nextInt();
               stmt.execute("Delete from patient where SN="+serial+";");
             
            }
            
            else if(choice ==2){
               System.out.print("\nEnter First Name:");
               String name = sc.next();
               stmt.execute("Delete from patient where First_Name=\""+name+"\";");

            }
            else if(choice ==3){
               System.out.print("\nEnter First Name : ");
               String name = sc.next();
               System.out.print("\nEnter Last Three Digits of Phone Number: ");
               int num = sc.nextInt();
               stmt.execute("Delete from patient where First_Name=\""+name+"\" and Phone_Number like \"%"+num+"\";");

            }
            else if(choice ==4){
               System.out.print("\nEnter Last Four Digits of Aadhar Number: ");
               int num = sc.nextInt();
               stmt.execute("Delete from patient where AADHAR_Number like \"%"+num+"\";");


            }
            else if(choice ==5){
               System.out.print("\n");
               stmt.execute("SELECT * FROM patient;"); 
               rs = stmt.getResultSet();
               while(rs.next())  
				      System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getInt(6)+"  "+rs.getString(7));
            

            }


            else if(choice ==6){
               break;
            }
            else {
               System.out.print("\nInvalid input!");
            }


            
         }   


         conn.close();
      }catch(Exception e){System.out.println(e);}

       
       
       
    }
}         
