import javax.swing.JOptionPane;

class assignmentNine
{

    public static void main(String args[])
    {
    	String bigString = "abcdefghijklmnopqrstuvwxyz";   //This may be changed to ANYTHING


    	String strInput = JOptionPane.showInputDialog("Enter a string");

      int strLen=strInput.length();
      int bigLen=bigString.length();
      int loc=bigString.indexOf(strInput);
      String before=bigString.substring(0, loc);
      String after=bigString.substring(loc + strLen, bigString.length());

    	//INSERT LINE HERE

    	System.out.println("The string '"+strInput+"' has "+strLen+" characters.");

    	//INSERT LINE HERE

    	System.out.println("The string '"+bigString+"' has "+bigLen+" characters.");

    	//INSERT LINE HERE

    	if(loc==-1)
    		System.out.println(strInput+" does not appear in '"+bigString+"'.");
    	else
    	{
    		System.out.println(strInput+" begins at position "+loc+" in '"+bigString+"'.");

    		//INSERT LINE HERE

    		System.out.println("The letters before "+strInput+" are '"+before+"'.");

    		//INSERT LINE HERE

    		System.out.println("The letters after "+strInput+" are '"+after+"'.");
    		System.out.println("Put them together and you have '"+before+after+"'.");

    	}


    }


}
