/**
 * StringRemove.java
 *
 * Name:
 * Date:
 * Got help from:
 *
 */
import javax.swing.JOptionPane;

class assignmentTwentyEight
{

	public static String removeLetter(String str, String c)
	{
		String result="";
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != c.charAt(0)){
				result += str.charAt(i);
			}
		}
		return result;
	}


	public static String removeDoubles(String str)
	{
		//This method returns 'str' with all pairs of letters removed
		//Example:
		//  removeDoubles("aassdffgjjjkllllommmmm") returns "dgjkom"
		//  removeDoubles("aacbb") returns "c"
		//  removeDoubles("baaaa") returns "b";
		//  removeDoubles("") returns ""
		String result = "";
		char lastChar = '\u0000';
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == lastChar){
				lastChar = '\u0000'; // This is technically a null character which could theoretically occur in text but meeeeeh
				result = result.substring(0, result.length()-1);
			} else {
				lastChar = str.charAt(i);
				result += str.charAt(i);
			}
		}
		return result;
	}


	public static String removeDoublesOrMore(String str)
	{
		//This method returns 'str' with all blocks (2 or more) of letters removed
		//Example:
		//  removeDoublesOrMore("aassdffgjjjkllllommmmm") returns "dgko"
		//  removeDoublesOrMore("aacbb") returns "c"
		//  removeDoublesOrMore("baaaa") returns "b";
		//  removeDoublesOrMore("") returns ""
		String result = "";
		if(str.length() < 2) return ""; // special case, 2 character strings aren't allowed
		if(str.charAt(0) != str.charAt(1))
			result += str.charAt(0);
		for(int i = 1; i < str.length()-1; i++){
			if(str.charAt(i) == str.charAt(i+1) || str.charAt(i) == str.charAt(i-1));
			else result += str.charAt(i);
		}
		if(str.charAt(str.length()-1) != str.charAt(str.length()-2))
			result += str.charAt(str.length()-1);
		return result;
	}


	public static String removeLetterAndBefore(String str, String c)
	{
		//This method will remove any block of the given letter from the string, plus the letter before the block.
		//If the block is at the beginning of the word, it will not remove the block.
		//Examples:
		//	removeLetterAndBefore("asdfgddhidddj","d") returns "afhj"
		//	removeLetterAndBefore("zzasfgzzz","z") returns "zzasf"
		//  removeLetterAndBefore("asdfghjkl","x") returns "asdfghjkl"
		//  removeLetterAndBefore("aasaaadfaaaaghjaaaa","a") returns "aadgh"
		//  removeLetterAndBefore("","a") returns ""
		//  removeLetterAndBefore("anything","") returns "anything"
		String result="";
		int i = 0;
		while(str.charAt(i) == c.charAt(0)){
			result += str.charAt(i);
			i++;
		}
		for(;i<str.length();){
			if(str.charAt(i)==c.charAt(0)){
				result = result.substring(0, result.length()-1);
				while(str.charAt(i) == c.charAt(0) && i < str.length()-1){
					i++;
				}
			}
			if(i<str.length() ) result += str.charAt(i);
			i++;
		}
		return result;
	}


    public static void main(String args[])
    {
   		String input = JOptionPane.showInputDialog("Enter a string.");
   		String letter = JOptionPane.showInputDialog("Enter a letter.");

   		System.out.println("Original string: "+input);
   		System.out.println("Original letter: "+letter);
   		System.out.println("\nremoveLetter method:");
   		System.out.println("  "+removeLetter(input, letter));
   		System.out.println("\nremoveDoubles method:");
   		System.out.println("  "+removeDoubles(input));
   		System.out.println("\nremoveDoublesOrMore method:");
   		System.out.println("  "+removeDoublesOrMore(input));
   		System.out.println("\nremoveLetterAndBefore method:");
   		System.out.println("  "+removeLetterAndBefore(input, letter));


    }

}
