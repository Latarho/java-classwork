/**
 * @(#)IntroToWHILELoops.java
 *
 *
 * @author
 * @version 1.00
 */

import javax.swing.JOptionPane;

//This lab uses while loops to solve simple algorithmic problems

class IntroToWHILELoops
{
    public static void main(String[] args)
    {

    	//Thiis section tests part a) of the lab
    	String myString = GetAndStoreInput();
    	System.out.println(myString);

    	//This section tests part b)of the lab
    	System.out.println("Enter a character to search for --> ");
    	String searchChar = System.console().readLine();
    	int position = SecondCharPosition(myString,searchChar);
    	System.out.println("The second position of " +searchChar +" is " +position);

    }

    //This method keeps getting input from the user until a "X" or "x" is entered
    //It then stores the input in a string.
    public static String GetAndStoreInput()
    {
      String result = "";
    	while(!result.matches(".*[Xx]")){
        result += JOptionPane.showInputDialog("Input x or X");
        // if(result.matches("[xX]")) break;
      }
      return result;
    }





    //Given a string, this method returns the position of the second occurrence of a given character.
    //If the character occurs less than 2 times it returns -1.
    public static int SecondCharPosition(String str, String Charr)
    {
      int position = 0;
      int counter = 0;
      while (counter < 1){
        position = str.indexOf(Charr, position+1);
        counter++;
      }
    	return position;
    }

}
