//Get input from a user.
//By James

import java.util.Scanner;

public class UserInput{
  public static void main(String[] args){
    
    Scanner userIN = new Scanner(System.in);
    Scanner userIN2 = new Scanner(System.in);
    
    //----Requesting alphbet characters from the user------
    System.out.print("Enter your name: ");

    //Use nextLine() to receive strings
    String name = userIN.nextLine();
    System.out.println("\nHello " +name);
  
    //-----Requesting a number from the user---------------

    System.out.print("Enter a numer: ");
    
    //use nextInt() to receive a number
    int aNum = userIN2.nextInt();
    System.out.println("Why did you pick "+aNum+"?");
    

  }


}
