/**
 * Goal:
 *   - To understand the mod and division operators
 *   - To compare and contrast when to use the mod or the division operator
 *
 *
 *
 * @version 1.00 2014/7/22
 */

import javax.swing.JOptionPane;

class assignmentSevenB
{

    //Gets a number input, then converts and return an integer
    static int GetNumber(String Str)
    {
    	String StrNum =  JOptionPane.showInputDialog(Str);
    	return Integer.parseInt(StrNum);
    }


    // Checks two numbers to see if the second number evenly divides the first number
    static boolean divisibleCheck(int A, int B)
    {
    	boolean test = false;
    	if(A % B == 0)
    		test = true;

    	return test;
    }


    // Checks a number if its an odd number
    static boolean IsOdd(int A)
    {
    	return A%2!=0;
    }


    // Returns the 1st position from right to left of a multidigit number
    static int Position1(int A)
    {
    	String s = String.valueOf(A);
      s = s.substring(s.length()-1,s.length());
      return Integer.parseInt(s);
    }


    // Returns the 2nd position from right to left of a multidigit number
    static int Position2(int A)
    {
    	String s = String.valueOf(A);
      s = s.substring(s.length()-2,s.length()-1);
      return Integer.parseInt(s);
    }



    // Returns the 3rd position from right to left of a multidigit number
    static int Position3(int A)
    {
      String s = String.valueOf(A);
      s = s.substring(s.length()-3,s.length()-2);
      return Integer.parseInt(s);
    }





   // Returns the Nth position from right to left of a multidigit number
    static int PositionN(int number, int position)
    {
      String s = String.valueOf(number);
      s = s.substring(s.length()-position,s.length()-(position-1));
      return Integer.parseInt(s);
    }



   // Does a basic check if the data entered is valid before
   // computing the Nth position in a multidigit number
   static boolean errorCheck(int number, int position)
    {
    	if(number - Math.pow(10,position-1) > 0)
          return true;
        else
          return false;
    }



    public static void main(String args[])
    {
    	// mod operator "%" - tells us the remainder of 1 number divide by another
    	// eg. 7 % 2 = 1, because the remainder is 1 when 7 is divided by 2

    	// division operator "/" - tells us the quotient of one number divided by another
    	// eg. 7 / 2 = 3, because 2 goes into 7, 3 times. Because 7 and 2 are both integers
    	// we would not get back the fractional part.



    	int numA = GetNumber("Enter the first number");
    	int numB = GetNumber("Enter the second number");

      // Does the second number divides the first number?
      System.out.println();
      System.out.println("Your first number was "+numA +"    Your second number was " +numB);
      System.out.println("Does the second number divides the first number? ");
    	System.out.println("the answer is --> " +divisibleCheck(numA, numB));
    	// Get a 4 digit number
    	// Is the number an Odd number?
    	System.out.println();
    	System.out.println();
    	int num = GetNumber("Enter a number. The number must have at LEAST four digits");
    	System.out.println("The number you entered was " +num);
       	System.out.println("Is the number an odd number? ");
    	System.out.println("The answer is --> " +IsOdd(num));


    	// Is the right most digit of the entered number odd?
    	System.out.println();
       	System.out.println("Is the right most digit (position 1 from right to left) of the number odd? ");
    	System.out.println("The answer is --> " +IsOdd(Position1(num)));


    	// Reports the 1st position from right to left of a multidigit number?
    	System.out.println();
       	System.out.println("The 1st position from right to left of the number is " +Position1(num));



        // Reports the 2nd position from right to left of a multidigit number?
    	System.out.println();
       	System.out.println("The 2nd position from right to left of the number is " +Position2(num));


        // Reports the 3rd position from right to left of a multidigit number ?
    	System.out.println();
       	System.out.println("The 3rd position from right to left of the number is " +Position3(num));


       	// Given any multidigit number, report the nth position from right to left of the number?
    	System.out.println();
    	System.out.println();
    	num = GetNumber("Enter a multidigit number. The number should have at LEAST two digits");
    	int pos = GetNumber("Enter the position of the number to find, from right to left");

       	if (errorCheck(num,pos))
       		System.out.println("The " +pos +" position from right to left of " +num +" is " +PositionN(num,pos));
       	else
       		System.out.println("Invalid entry");


    }


}
