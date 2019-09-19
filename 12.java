/**
 * @(#)IntroToForLoops.java
 *
 *
 * @author
 * @version 1.00 2014/7/24
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;

class assignmentTwelve
{
    public static void main(String[] args)
    {
    	int number = GetNumber();
    	printOddIntegerAndSum(number); //Solution to (i)
    	factorial(number);  //Solution to (ii)
    	divisibleByTwoOrThree(number);  //Solution to part (iii)
    	printReverse(number);  //Solution to part (iv)
    	primeNumbers(number);  // Solution to part (v)
    }


    //Gets a number from the user
    static int GetNumber()
    {
    	String Str =  JOptionPane.showInputDialog("Enter a positive integer value ");
    	return Integer.parseInt(Str);
    }



    //This is the solution to part (i)
    static void printOddIntegerAndSum(int n)
    { // eww your indentations are weird

      int total = 0;
      for(int i = 1; i < n + 1; i += 2){
        System.out.println(i);
        total += i;
      }
      System.out.println(total);

    	System.out.println(); // Leaves space between the outputs
    	System.out.println();
    }


    //This is the solution to part (ii)
    static void factorial(int n)
    {

      int total = 0;
      for(int i = 0; i < n + 1; i++){
        total += i;
      }
      System.out.println(total);

    	System.out.println();   // Leaves space between the outputs
        System.out.println();
    }



    // This is the solution to part (iii)
    static void divisibleByTwoOrThree(int n)
    {
      // aha, FizzBuzz in disguise
    	for(int i = 0; i < n + 1; i++){
        int counter = 0;
        if(i%2==0){
          counter++;
        }
        if (i%3==0){
          counter++;
        }
        if(counter==1){
          System.out.println(i);
        }
      }

        System.out.println();     // Leaves space between the outputs
        System.out.println();
    }



    // This is a solution to part (iv)
    static void printReverse(int n)
    {

      for(int i = n; i > 0; i--){
        for(int k = 0; k < i; k++){
          System.out.print(i);
        }
        System.out.println();
      }


    	System.out.println();     // Leaves space between the outputs
        System.out.println();

    }


    // This is a solution to part (v)
    static void primeNumbers(int n)
    {
      ArrayList<Integer> primes = new ArrayList(); // the linter doesn't like this, but it works lol
      primes.add(2);
      int primeCounter = 1;
      for(int i = 3; i < n+1; i++){
        boolean isPrime = true;
        for(int k = 0; k < primeCounter; k++){
          if(i%primes.get(k)==0){
            isPrime = false;
          }
        }
        if(isPrime){
          primes.add(i);
          System.out.println(i);
          primeCounter++;
        }
      }
    }

}
