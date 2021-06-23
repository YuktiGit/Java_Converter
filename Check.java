import java.util.*;

class Check {
    public static void main(String [] args){

          Scanner input = new Scanner(System.in);
          Scanner scanner = new Scanner("Productive.txt");
          System.out.println("What would you like to check for?");
          String name = input.nextLine();
        
          while (scanner.hasNextLine()) {
               final String lineFromFile = scanner.nextLine();
               if(lineFromFile.contains(name)) { 
                    return true;
                    break;
               }
              else {  
                  return false;  
              }
   
          }
    }
}