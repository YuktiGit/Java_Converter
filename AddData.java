import java.util.*;
import java.io.*;
class AddData{
    void addData(String file){
      try{
    Scanner in=new Scanner(System.in);
    File f=new File(file);
    BufferedWriter b=new BufferedWriter(new FileWriter(f,true));
    System.out.println("Enter description and price");
    System.out.println("Enter y for more and any other to exit");
    char x;
   do{
    String grocery=in.nextLine();
    int price=in.nextInt();
    b.write(grocery+" "+price+"\r\n");
    x=in.next().charAt(0); 
    in.nextLine();
            }while(x=='y'||x=='Y');
    b.close();
  }catch(Exception e){
      System.out.println(e);
  }
  }
    
}