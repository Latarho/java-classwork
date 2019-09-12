import javax.swing.JOptionPane;

class assignmentTen
{

    public static String phoneSummary(Contact x)
    {
    	String summary = "";
    	summary = summary + x.getFirstName() + " " + x.getLastName();
    	summary = summary + "\nHome: " + x.getHomePhoneNum();
    	summary = summary + "\nMobile: " + x.getMobilePhoneNum();
    	return summary;
    }

    public static String addressLabel(Contact x)
    {

    	String summary = "";

    	//you write this method
    	//look at the above method (phoneSummary) for help





    	return summary;


    }



    public static void main(String args[])
    {
    	Contact person1;
    	Contact person2;
    	Contact person3;

    	String input;
    	String fName;
    	String lName;

    	// you must use (and re-use) only the 6 variables listed above.

    	fName = JOptionPane.showInputDialog("Enter the first name for contact #1");
    	lName = JOptionPane.showInputDialog("Enter the last name for contact #1");

    	person1 = new Contact(fName, lName);		//Make SURE you understand this line!!!!

    	input = JOptionPane.showInputDialog("Enter the home phone number for "+person1.getFirstName());
    	person1.changeHomePhoneNum(input);

    	input = JOptionPane.showInputDialog("Enter the mobile phone number for "+person1.getFirstName());
    	person1.changeMobilePhoneNum(input);

    	// Next line displays a summary of phone numbers for 'person 1'

    	JOptionPane.showMessageDialog(null,phoneSummary(person1));

    	//uncomment the following line and see if you can figure out what it does...

    	JOptionPane.showMessageDialog(null,person1); // It casts the first contact to a string, and since it doesn't have a way to do that, it just shows its class and what's presumably a memory offset.

      person2 = new Contact(JOptionPane.showInputDialog("contact 2 name"), JOptionPane.showInputDialog("contact 2 last name"));
      // *yoink*
    	input = JOptionPane.showInputDialog("Enter the home phone number for "+person2.getFirstName());
    	person2.changeHomePhoneNum(input);
    	input = JOptionPane.showInputDialog("Enter the mobile phone number for "+person2.getFirstName());
    	person2.changeMobilePhoneNum(input);
      JOptionPane.showMessageDialog(null,phoneSummary(person2));

      person3 = new Contact(JOptionPane.showInputDialog("contact 3 name"), JOptionPane.showInputDialog("contact 3 last name"));
      // *yoink*
    	input = JOptionPane.showInputDialog("Enter the home phone number for "+person3.getFirstName());
    	person3.changeHomePhoneNum(input);
    	input = JOptionPane.showInputDialog("Enter the mobile phone number for "+person3.getFirstName());
    	person3.changeMobilePhoneNum(input);
      JOptionPane.showMessageDialog(null,phoneSummary(person3));
      if(!person1.isSamePerson(person3)){JOptionPane.showMessageDialog(null, "inequal");}
      else {JOptionPane.showMessageDialog(null, "equal");}
    }
}
