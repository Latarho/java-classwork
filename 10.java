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
      summary = x.getLastName()+", "+x.getFirstName()+
      "\n"+x.getStreetAddress()+
      "\n"+x.getCityAddress()+", "+x.getStateAddress()+" "+x.getZipCode();
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
      person1.changeStreetAddress(JOptionPane.showInputDialog("Input "+fName+"'s street address."));
      person1.changeCityAddress(JOptionPane.showInputDialog("Input "+fName+"'s city of residence."));
      // ugh Kotlin's implementation of getters and setters is so much better
      person1.changeStateAddress(JOptionPane.showInputDialog("Input "+fName+"'s state of residence."));
      person1.changeZipCode(JOptionPane.showInputDialog("Input "+fName+"'s zipcode."));

    	// Next line displays a summary of phone numbers for 'person 1'

    	JOptionPane.showMessageDialog(null,phoneSummary(person1));
      JOptionPane.showMessageDialog(null,addressLabel(person1));

      person2 = new Contact(JOptionPane.showInputDialog("contact 2 name"), JOptionPane.showInputDialog("contact 2 last name"));
      // *yoink*
    	input = JOptionPane.showInputDialog("Enter the home phone number for "+person2.getFirstName());
    	person2.changeHomePhoneNum(input);
    	input = JOptionPane.showInputDialog("Enter the mobile phone number for "+person2.getFirstName());
    	person2.changeMobilePhoneNum(input);
      person2.changeStreetAddress(JOptionPane.showInputDialog("Input "+person2.getFirstName()+"'s street address."));
      person2.changeCityAddress(JOptionPane.showInputDialog("Input "+person2.getFirstName()+"'s city of residence."));
      person2.changeStateAddress(JOptionPane.showInputDialog("Input "+person2.getFirstName()+"'s state of residence."));
      person2.changeZipCode(JOptionPane.showInputDialog("Input "+person2.getFirstName()+"'s zipcode."));
      JOptionPane.showMessageDialog(null,phoneSummary(person2));
      JOptionPane.showMessageDialog(null,addressLabel(person2));

      person3 = new Contact(JOptionPane.showInputDialog("contact 3 name"), JOptionPane.showInputDialog("contact 3 last name"));
    	input = JOptionPane.showInputDialog("Enter the home phone number for "+person3.getFirstName());
    	person3.changeHomePhoneNum(input);
    	input = JOptionPane.showInputDialog("Enter the mobile phone number for "+person3.getFirstName());
    	person3.changeMobilePhoneNum(input);
      person3.changeStreetAddress(JOptionPane.showInputDialog("Input "+person3.getFirstName()+"'s street address."));
      person3.changeCityAddress(JOptionPane.showInputDialog("Input "+person3.getFirstName()+"'s city of residence."));
      person3.changeStateAddress(JOptionPane.showInputDialog("Input "+person3.getFirstName()+"'s state of residence."));
      person3.changeZipCode(JOptionPane.showInputDialog("Input "+person3.getFirstName()+"'s zipcode."));
      JOptionPane.showMessageDialog(null,phoneSummary(person3));
      JOptionPane.showMessageDialog(null,addressLabel(person3));
      if(!person1.isSamePerson(person3)){JOptionPane.showMessageDialog(null, "inequal");}
      else {JOptionPane.showMessageDialog(null, "equal");}
    }
}
