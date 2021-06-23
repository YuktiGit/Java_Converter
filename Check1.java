import java.util.*;
import java.lang.*;

class Check1 {
private static void searchForName() {
    System.out.println("Please enter the name you would like to search for: ");
    Scanner kb = new Scanner(System.in);
    String name = kb.nextLine();

    List<String> lines = Files.readAllLines(Paths.get("Productive.txt"));
    for (String line : lines) {
        if (line.contains(name)) {
            System.out.println("done");
        }
        else {
            System.out.println("invalid input");
        }
    }
   } 
    
    public static void main(String [] args){
       Check1 ch = new Check1();
       ch.searchForName();
       }
}