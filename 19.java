/**
 * @(#)ArraysAgainSolutions.java
 *
 *
 * @author
 * @version 1.00 2014/7/29
 */


class assignmentNineteen
{
    public static void main(String[] args)
    {
    	int arraysize = 11;
    	int[] list = new int[arraysize];
    	list = GenerateNumbers(arraysize);
    	PrintArray(list);
    	System.out.println();

    	System.out.println("Maximum value and the index of the smallest value are:");
    	PrintArray(MaxAndMin(list));
    	System.out.println();

    	int value = 12;
    	System.out.println("The positions of all occurrence of " +value +" in the list are ");
    	PrintArray(positionInList(list,value));
    	System.out.println();

    	int position = 7;
    	System.out.println("The list rotated about position " +position +" is ");
    	PrintArray(rotateList(list,position));
    	System.out.println();

    	System.out.println("The list with adjacent values swapped becomes ");
    	PrintArray(swapAdjacentPosition(list));
    	System.out.println();
    }



    //This method randomly generates a list of integer values and stores them in an array
    static int[] GenerateNumbers(int size)
    {
    	int[] array = new int[size];
    	for(int i = 0; i < array.length; i++)
    	{
    		array[i] = (int)(Math.random()*100+1);
    	}

    	return array;
    }


    //Prints the contents of an array of integers
    static void PrintArray(int[] A)
    {
    	for(int i = 0; i < A.length; i++)
    	{
    		System.out.print(A[i] +" ");
    	}
    	System.out.println();
    }

    //Solution to #1
    // This method returns the maximum value and the index of the last occurrence of the
    // minimum value of an array of integers
    static int[] MaxAndMin(int[] A)
    {
      int max = 0;
      int mindex = 0;
      for(int i = 0; i < A.length; i++){
        if(A[i]>max){
          max = A[i];
        }
        if(A[i]<A[mindex]){
          mindex = i;
        }
      }
      return new int[]{max,mindex};
    }


    //Solution to #2
    //Given an array of integers, the method returns a list of all the positions in the list
    //where a given number occurs. If the number is not in the list, the method returns an array
    //of length 1 with a value of -1.
    static int[] positionInList(int[] A, int value)
    {
      int counter = 0;
      for(int i = 0; i < A.length; i++){
        if(A[i] == value) counter++;
      }
      int[] occurrences = new int[counter];
      counter = 0;
      for(int i = 0; i < A.length; i++){
        if(A[i] == value) {occurrences[counter]=i;counter++;}
      }
      return occurrences;
    }



    // Solution to #3
    // Given a list of numbers and a position in the list, this method rotates the
    // elements in the list about the position.
    // Example: list(0,1,2,3,4,5,6,7,8,9), position 7
    // The method returns the list(0,1,2,3,4,9,8,7,6,5)
    // Example: list(0,1,2,3,4,5,6,7,8,9), position 4
    // The method returns the list(8,7,6,5,4,3,2,1,0,9)
    static int[] rotateList(int[] A, int pos)
    {
      int[] output = new int[A.length];
      for(int i = 0; i < A.length; i++){
        output[(i + pos)%A.length] = A[i];
      }
      return output;
    }


     //Solution to #4
     //Given an array of integers, this method swaps the values at each pair of
     //adjacent positions.For example, list:(2,4,6,8,5,7,9) would become
     //                                     (4,2,8,6,7,5,9)
     //                                list:(1,3,5,7,9,11,13,15) would become
     //                                     (3,1,7,5,11,9,15,13)

     static int[] swapAdjacentPosition(int[] A)
     {
     	for(int i = 0; i < A.length; i+=2){
        int old = A[i];
        if(i+1<A.length) {A[i] = A[i+1]; A[i+1] = old;}
      }
     	return A;
     }
}
