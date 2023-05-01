//Creating a simple GUI program in Java
//By James

import javax.swing.JOptionPane;

public class guiProg{
  public static void main(String[] args){
    
    //the initial window to input a string
    String name = JOptionPane.showInputDialog("Welcome!\nPlease enter you name");
    JOptionPane.showMessageDialog(null,"Hello "+name);
    
    //to input an integer
    int date = Integer.parseInt(JOptionPane.showInputDialog("What is today's date?"));
    JOptionPane.showMessageDialog(null,"And yesterday was "+(date-1));
    
    //to input a decimal
    float py = Float.parseFloat(JOptionPane.showInputDialog("What do you think the value of Pi is? "));
    JOptionPane.showMessageDialog(null, py+" is without pepperoni"); 
    
  }


}
