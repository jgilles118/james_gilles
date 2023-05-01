//Concantenate strings and swap values of variables
//By James

public class concat{
  public static void main(String[] args){

    //The string variables.    
    String x = "water";
    String y = "Iced-Tea";
    String temp = "";
    
    System.out.println("Before the swap:\nx = "+ x + "\ny = "+y);

    //Swap the variables
    temp = x;
    x = y;
    y = temp;
    
    System.out.println("\nAfter the swap:\nx = "+ x +"\ny = "+y);

  }

}
