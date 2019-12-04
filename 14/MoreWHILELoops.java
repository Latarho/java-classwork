/**
 * @(#)MoreWhileLoop.java
 *
 *
 * @author
 * @version 1.00
 */

public class MoreWHILELoops
{
    public static void main(String[] args)
    {

     	//This section tests part a) of the lab
    	int number = RandomOccurrence();
    	System.out.println("It took " +number +" tries before 10 was generated");

    	System.out.println();
    	System.out.println();


    	//This section tests part b) of the lab
         RandomSum();

    }




    //This method randomly generates integer numbers and stops only after a 10
    //is generated.It returns the number of generated numbers before a 10 occurred.
    public static int RandomOccurrence()
    {
      int counter = 0;
      while (true){
        int result = (int)(Math.random()*20+1);
        System.err.println(result);
        if(result==10) break;
        else counter++;
      }
      return counter;
    }




    //This method randomly generates integer numbers and sums the values. It stops after the
    //sum of the values is greater than or equal to 200.
    public static void RandomSum()
    {
      int output = 0;
      while (true){
        int result = (int)(Math.random()*20+1);
        System.err.println(result);
        output += result;
        if(output>=200) break;
      }
      System.out.println(output);
    }
}
