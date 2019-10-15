/**
 * ChangeBase.java
 *
 * Name:
 * Date:
 * Got help from:
 */

import javax.swing.JOptionPane;

class assignmentTwentyNine
{
public static char[] numerals = {
  '0',
  '1',
  '2',
  '3',
  '4',
  '5',
  '6',
  '7',
  '8',
  '9',
  'a',
  'b',
  'c',
  'd',
  'e',
  'f'
};
public static String base(String num, int oldB, int newB)
{
  // Convert input string into a Java int
  int input = 0;
  for(int i = 0; i < num.length(); i++){
    for(int o = 0; o < oldB; o++){
      if(num.charAt(i) == numerals[o]){
        input += o*(Math.pow(oldB, (num.length()-1)-i));
      }
    }
  }
  // Convert int back to string.
  String outputString = "";
  for(int i = 0; i < Math.ceil(Math.log(input)/Math.log(newB)); i++){
    System.out.println(i);
    int index = ((int)Math.floor(input % Math.pow(newB, i+1))-(int)Math.floor(input % Math.pow(newB, i)))/(int)Math.pow(newB, i);
    System.out.println(index);
    outputString = numerals[index] + outputString;
  }
  return outputString;
}


public static void main(String args[])
{
	//You may assume the user's inputs are all valid, and that 'A' through 'F' will always be in capital.

	boolean convert = true;

	while (convert) {
		String oldBaseInput = JOptionPane.showInputDialog("Enter a number base (2-16)");
		int oldBase = Integer.parseInt(oldBaseInput);
		String oldNum = JOptionPane.showInputDialog("Enter a number in base " + oldBase);
		String newBaseInput = JOptionPane.showInputDialog("Enter a number base to convert " + oldNum + " b" + oldBase + " into (2-16)");
		int newBase = Integer.parseInt(newBaseInput);

		String newNum = base(oldNum, oldBase, newBase);
		JOptionPane.showMessageDialog(null, oldNum + " b" + oldBase + " = " + newNum + " b" + newBase);

		int result = JOptionPane.showConfirmDialog(null, "Do it again?", null, JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.NO_OPTION)
			convert = false;
	}
}
}
