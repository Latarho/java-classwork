/**
 * StringReplace.java
 *
 * Name:
 * Date:
 * Got help from:
 *
 */
import javax.swing.JOptionPane;

class assignmentSixteen
{


	public static String replaceLetterWithX(String str, String c)
	{
		//This method will return 'str' with all instances of letter 'c' replaced
		//by 'X'
		//Examples
		//  replaceLetterWithX("asdfgsdfghfghj","s") returns "aXdfgXdfghfghj"
		//  replaceLetterWithX("aabaaacaaadaaaa","a") returns "XXbXXXcXXXdXXXX"
		String result=str;
		String replacement = "X";
		int progress = 0;
		while(true){
			int index = str.indexOf(c,progress);
			if(index==-1) break;
			String start = result.substring(0, index);
			String middle = replacement;
			String end = result.substring(index+1);
			result = start+middle+end;
			progress=index+1;
		}
		return result;
	}

	public static String replaceLetterWithXYZ(String str, String c)
	{
		//This method will return 'str' with all instances of letter 'c' replaced
		//by 'X', then by 'Y', and then by 'Z'.  If there are more than 3 instances
		//the pattern will repeat
		//Examples
		//  replaceLetterWithXYZ("asdfgsdfghfghj","s") returns "aXdfgYdfghfghj"
		//  replaceLetterWithXYZ("aabaaacaaadaaaa","a") returns "XYbZXYcZXYdZXYZ"
		String result=str;
		int counter = 0;
		String[] replacements = new String[]{"X", "Y", "Z"};
		int progress = 0;
		while(true){
			int index = str.indexOf(c,progress);
			if(index==-1) break;
			String start = result.substring(0, index);
			String middle = replacements[counter%3];
			String end = result.substring(index+1);
			result = start+middle+end;
			counter++;
			progress=index+1;
		}
		return result;
	}

	public static String replaceWordWithLetter(String str, String word, String c)
	{
		//This method will return 'str' with all instances of 'word' replaced be letter 'c'.
		//Examples
		//  replaceWordWithLetter("asdfdsdfjsdf","sdf","q") returns "aqdqjq"
		//  replaceWordWithLetter("aaaaaaaa","aaa","w") returns "wwaa"
		String result=str;
		String replacement = c;
		int progress = 0;
		while(true){
			int index = result.indexOf(word,progress);
			if(index==-1) break;
			String start = result.substring(0, index);
			String middle = replacement;
			String end = result.substring(index+word.length());
			result = start+middle+end;
			progress=index+word.length()-2;
		}
		return result;
	}

    public static void main(String args[])
    {
    	String input = JOptionPane.showInputDialog("Enter a big string.");
    	String word = JOptionPane.showInputDialog("Enter a 'word'.");
    	String letter = JOptionPane.showInputDialog("Enter a single letter.");

    	System.out.println("Original string: "+input);
    	System.out.println("Original word: "+word);
   		System.out.println("Original letter: "+letter);
   		System.out.println("\nreplaceLetterWithX method:");
   		System.out.println("  "+replaceLetterWithX(input, letter));
   		System.out.println("\nreplaceLetterWithXYZ method:");
   		System.out.println("  "+replaceLetterWithXYZ(input, letter));
   		System.out.println("\nreplaceWordWithLetter method:");
   		System.out.println("  "+replaceWordWithLetter(input, word, letter));
    }



}
