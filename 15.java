/**
 * StringLab2.java
 *
 * Name:
 * Date:
 * Got help from:
 *
 */
import javax.swing.JOptionPane;

class assignmentFifteen
{


	public static String reverse(String str)
	{
		//This method will return a string that reverses the letters in 'str'
		//Example:
		//   reverse("abcdef") returns "fedcba"
		String result="";
		for(int i = str.length()-1; i > -1; i--){
			result += str.charAt(i);
		}
		return result;
	}

   	public static int howManyWithOverlap(String str, String word)
	{
		//This method will count how many instances of 'word' sre found in 'str'
		//The 'word' may overlap another 'word'
		//Examples:
		//  howManyWithOverlap("asdfgasjkasiuas", "as") returns 4
		//  howManyWithOverlap("baaaaaac", "aaa") returns 4
		//  howManyWithOverlap("dfdfdfdfdf", "fdf") returns 4
		//  howManyWithOverlap("you betcha", "qwerty") returns 0

		int count = 0;
		int position = 0;
		while(true){
			int index = str.indexOf(word,position);
			if(index != -1) {position = index+1; count++;}
			else break;
		}
		return count;
	}

	public static int howManyWithoutOverlap(String str, String word)
	{
		//This method will count how many instances of 'word' sre found in 'str'
		//The 'word' may NOT overlap another 'word'.  That is,
		//any letters used in one instance of 'word', may not be used again
		//Examples:
		//  howManyWithoutOverlap("asdfgasjkasiuas", "as") returns 4
		//	howManyWithoutOverlap("baaaaaac", "aaa") returns 2
		//  howManyWithoutOverlap("dfdfdfdfdf", "fdf") returns 2
		//  howManyWithoutOverlap("you betcha", "qwerty") returns 0

		int count = 0;
		int position = 0;
		while(true){
			int index = str.indexOf(word,position);
			if(index != -1) {position = index+word.length(); count++;}
			else break;
		}
		return count;
	}

    public static void main(String args[])
    {
    	String input = JOptionPane.showInputDialog("Enter a string.");
    	String word = JOptionPane.showInputDialog("Enter a 'word'.");

    	System.out.println("Original string: "+input);
   		System.out.println("Original word: "+word);
   		System.out.println("\nreverse method:");
   		System.out.println("  "+reverse(input));
   		System.out.println("\nhowManyWithOverlap method:");
   		System.out.println("  "+howManyWithOverlap(input,word));
   		System.out.println("\nhowManyWithoutOverlap method:");
   		System.out.println("  "+howManyWithoutOverlap(input, word));
    }




}
