import java.lang.*;
import java.util.*;
import java.io.*;
class Check3 {

public static void main(String[] args) {
  try{
    searchForName();
  }catch(FileNotFoundException e){ System.out.println(e);}
}

   private static boolean searchForName() throws FileNotFoundException {
    File file = new File("C:\\Users\\YUKTI_PC\\Desktop\\Productive.txt");
    Scanner kb = new Scanner(System.in);
    Scanner input = new Scanner(file);

    System.out.println("Please enter the name you would like to search for: ");
    String name = kb.nextLine();
    boolean b = true;

    while(input.hasNextLine()) {
        System.out.println(input.next(name));
        String lineFromFile = input.nextLine();
        if(lineFromFile.contains(name))  
             b = true; 
         else
             b = false;     
    }
    
     return b;
 }
 
}