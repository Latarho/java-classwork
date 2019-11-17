/**
 * Name:
 * Date:
 * Got help from:
 */
import javax.swing.JOptionPane;

public class SortNums
{


   public static void sort(int numArray[])
   { // I believe this is called a "bubble sort"? I read about this somewhere, but I'm not sure I remembered it correctly.
     boolean dirty = false;
     do{
      dirty = false; // Assumes there is nothing out of place until it finds it
        for(int i = 0; i<numArray.length; i++){
          if(i+1<numArray.length){
            if(numArray[i+1]<numArray[i]){ // If it is out of place, try to fix it.
              dirty = true;
              int old = numArray[i];
              numArray[i] = numArray[i+1];
              numArray[i+1] = old;
            }
          }
        }
      }while(dirty); // If nothing was found to be out of place, end the sort and return.
   	}





    public static void main(String args[])
   	{
   		String numInput = JOptionPane.showInputDialog("How many numbers do you want to sort? (at least 5)");
   		int arrLen = Integer.parseInt(numInput);

   		int[] nums = new int[arrLen];

   		for(int i=0; i<arrLen; i++)
   		{
   			nums[i] = (int)(Math.random()*100);
   		}

   		System.out.println("Here are your numbers, unsorted");
   		for(int i=0; i<arrLen; i++)
   		{
   			System.out.print(nums[i]+" ");
   		}
   		System.out.println();
   		System.out.println();
  //*************************
   		sort(nums);
  //*************************
   		System.out.println("Here are your numbers, sorted");
   		for(int i=0; i<arrLen; i++)
   		{
   			System.out.print(nums[i]+" ");
   		}
   		System.out.println();
   		System.out.println();

    }


}
