import java.util.Scanner;

public class Classtest2 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner("C:.Users.YUKTI_PC.Desktop.Productive.txt");
    Scanner myScanner = new Scanner(System.in);

    System.out.println("What would you like to check for?");
    String number = myScanner.nextLine() ;
    String keyWord = number, word;
    int lineNum = 0;

    while(sc.hasNextLine()) {
        word = sc.next();

        if(word.equals(myScanner.nextLine().trim())) {
            System.out.println("The number "+number+ " is there");

            break;
        } else {
            System.out.println("Sorry invalide input");
        }
    } 
} 
}