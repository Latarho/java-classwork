/**
 * @(#)IntroToArrays.java
 *
 *
 * @author
 * @version 1.00 2014/7/28
 */

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class IntroToArrays
{
    public static void main(String args[])
    {
    	int[] intArray = new int[10];


    	intArray = fillArray(intArray); //Gets 10 values from the user
    	printArray(intArray); //Prints the entered values to the screen
    	System.out.println();

    	//Searches the array for the first occurrence of a "value".
    	//If found the method returns the position in the array, otherwise it returns -1.
    	int value = 7;
    	System.out.println("The first occurrence of "+value +" in the array is " +searchArray(intArray, value));
        System.out.println();


    	//Counts the number of times "value" is in the array. If the value is not in the
    	//array, it returns 0

    	value = 7;
    	System.out.println(+value +" occurs " +countValue(intArray, value) +" times in the array");
    	System.out.println();


        //Adds "value" to each element in the array. It prints the new values to the screen
        //"intArray" should remain unchanged
      System.out.println("Add 7 to each value");
    	value = 7;
    	addToValues(intArray, value);
    	System.out.println();


    	//replaces "value" with "newValue". If the "value" is not in the array
        // it returns the array unchanged
      System.out.println("Replace 7 with 1000");
    	int newValue = 1000;
    	    value = 7;
    	replaceValue(intArray, value, newValue);



    	//Removes all occurrence of "value" in the array. If the "value" is not in the
    	//array, it returns the array unchanged.
      System.out.println("Remove 7");
    	value = 7;
    	removeElement(intArray,value);


        //Reverses the contents of the array. The array remains unchanged
        //It prints the reversed array to the screen
        System.out.println("Reverse");
        reverseArray(intArray);



    }

    //Gets input from a user and stores it in the array
    static int[] fillArray(int[] A)
    {
    	for(int i = 0; i < A.length; i++){
        A[i] = Integer.parseInt(JOptionPane.showInputDialog("Input element " + String.valueOf(i) + "."));
      }
      JOptionPane.showMessageDialog(null, "Done");
      return A;
    }



    //Prints the contents of an arrray of integers to the screen
    static void printArray(int[] A)
    {
    	String output = "Results: ";
      for(int i : A){ // I would use String.join(", ", A) here but your java installs are old and don't have it
        output += String.valueOf(i) + ", ";
      }
      output += "Done.";
      System.out.println(output);
    }




    //searches the array for the first occurrence of a "value". If found the method returns the position in
    //the array, otherwise it returns -1
    static int searchArray(int[] A, int val)
    {
    	for(int i = 0; i < A.length; i++){
        if(A[i] == val) {
          return i;
        }
      }
      return -1;
    }




    //counts the number of times a "value" occurs in the array. If the "value" is not in the
    //array, it returns 0
    static int countValue(int[] A, int val)
    {
    	int count = 0;
      for(int i : A){
        if(i == val) count++;
      }
    	return count;
    }


   //Adds "value" to each element in the array. It then prints it to the screen.
   //"intArray" remains unchanged.

   	static void addToValues(int[] A, int val)
   	{
   		int[] tempArray = new int[A.length];
      for(int i = 0; i < A.length; i++){
        tempArray[i] = A[i]+val;
      }
   		printArray(tempArray);    //Prints the updated array to the screen
   	}


    //replaces "value" with "newValue". If the "value" is not in the array
    //it returns the array unchanged. It should print the new array to the screen
    static void replaceValue(int[] A, int val, int newVal)
    {

   		int[] tempArray = new int[A.length];
      for(int i = 0; i < A.length; i++){
        if(A[i] == val){
          tempArray[i] = newVal;
        } else {
          tempArray[i] = A[i];
        }
      }
   		printArray(tempArray); //Prints the updated array to the screen

    }



   	//removes all occurrence of "value" in the array. If the "value" is not in the
    //array, it returns the array unchanged.
    static void removeElement(int[] A, int val)
    {
      int count = countValue(A, val);
      int[] newArray = new int[A.length-count];
      int position = 0;
      for(int i = 0; i < A.length; i++){
        if(A[i] != val){
          newArray[position] = A[i];
          position++;
        }
      }
   		printArray(newArray); //Prints the updated array to the screen
    }

    //Reverses the contents of the array. The array remains unchanged
    //It prints the reversed array to the screen
    static void reverseArray(int [] A)
    {
    	int[] tempArray = new int[A.length];
      for(int i = 0; i < A.length; i++){
        tempArray[A.length-(i+1)] = A[i];
      }
   		printArray(tempArray); //Prints the updated array to the screen

    }



}
