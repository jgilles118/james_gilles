/*A Java program that will create a directory
 * and sub directories within a Windows or Linux machine
 * 
 * Author: James Gilles
 * Created: July 2019
 * ********************* */

import java.io.File;
import java.time.YearMonth;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Create_Drectories {
	
	public static void main(String[] args){
		
		//create a Name & attach the date to the Directory
		YearMonth daTe = YearMonth.now();
		String myNewDirectory = "Directory created - " + daTe;
		
		//List of sub-directories to be inserted into the new directory
		String[] subDir = {"DIR 1","DIR 2","DIR 3","DIR 4"};
		
		//Another list of sub-directories to be inserted into DIR 4
		String[] sub_subDir = {"DIR A","DIR B"};
		
		 /*
		 Destination Path to create the folders/directoires.
		  Your path will be different on your workstation/PC/Laptop
		*/
		//Windows
		//String destination = "C:\\Users\\Your user name\\Desktop\\";

		//Unix, Linux
		String destination = "/home/Your user name/Documents/";
		
		//Insert the path & directory name
		File inputDir = new File(destination + myNewDirectory);
		
			//Popup notification explaining the dictories already exists. Eliminate duplicaton
			if(inputDir.exists())
			{
				JLabel label = new JLabel(inputDir.getName() + " already exists!", JLabel.CENTER);
				label.setAlignmentX(0);
				label.setAlignmentY(0);
				JFrame frame = new JFrame("Creating Directories");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(800,600);
				frame.setVisible(true);
				frame.add(label);
				
				return;
			}
			
			else
			{
				//Popup to display a successful creation.
				inputDir.mkdir();
				JLabel label = new JLabel(inputDir.getName() + " has been created!", JLabel.CENTER);
				label.setAlignmentX(0);
				label.setAlignmentY(0);
				JFrame frame = new JFrame("Creating Directories");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(800,600);
				frame.setVisible(true);
				frame.add(label);
			
				//Insert the sub-directories
				for(int i = 0; i<= subDir.length-1; ++i)
				{
					//Windows
					//File subDirs = new File(inputDir +"\\"+subDir[i]);
					
					//Unix, Linux
					File subDirs = new File(inputDir +"/"+subDir[i]);
					
					subDirs.mkdir();
				
					//Insert athe sub_sub-directories into 1 sub-directory
					if(subDir[i] == "DIR 1")
					{
						for(int j = 0; j <= sub_subDir.length-1; ++j)
						{
							//Windows
							//File subSubDir = new File(inputDir + "\\DIR 1\\" + sub_subDir[j]);
							
							//Unix, Linux
							File subSubDir = new File(inputDir + "/DIR 1/" + sub_subDir[j]);
							
							subSubDir.mkdir();
						}
					}
				}//Close FOR
			}//Close ELSE
	}//Close Main
}//Close Class
