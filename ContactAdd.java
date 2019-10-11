/**
 * ContactAdd.java
 *
 * Name:
 * Date:
 * Got help from:
 *
 */
import javax.swing.JOptionPane;

public class ContactAdd
{
public static Contact[] loadFile(String fn)
{
	EasyReader reader = new EasyReader(fn);
	int lineCount = 0;

	while (!reader.eof()) {
		reader.readLine();
		lineCount++;
	}
	reader = new EasyReader(fn);
	Contact[] results = new Contact[lineCount - 1];
	for (int i = 0; i < lineCount - 1; i++) {
		String line = reader.readLine();
		String[] parts = line.split(",");
		String firstName = parts[0];
		String lastName = parts[1];
		String phone = parts[2];
		results[i] = new Contact(firstName, lastName);
		results[i].changeMobilePhoneNum(phone);
	}
	reader.close();
	return results;
}

public static void saveFile(String fn, Contact[] list)
{
	EasyWriter writer = new EasyWriter(fn);

	for (int i = 0; i < list.length; i++)
		writer.println(list[i].getFirstName() + "," + list[i].getLastName() + "," + list[i].getMobilePhoneNum());
	writer.close();
}



public static Contact[] addContact(Contact[] list)
{
	String firstName = JOptionPane.showInputDialog(null, "First Name");
	String lastName = JOptionPane.showInputDialog(null, "Last Name");
	String number = JOptionPane.showInputDialog(null, "Phone Number");

	Contact[] result = new Contact[list.length + 1];
	for (int i = 0; i < list.length; i++) result[i] = list[i];
	result[list.length] = new Contact(firstName, lastName);
	result[list.length].changeMobilePhoneNum(number);
	return result;
}

public static Contact[] removeContact(Contact[] list)
{
	int target = Integer.parseInt(JOptionPane.showInputDialog(null, "Select target")) - 1;

	Contact[] result = new Contact[list.length - 1];
	int counter = 0;
	for (int i = 0; i < list.length; i++) if (i != target) {
			result[i] = list[counter]; counter++;
		}
	return result;
}

public static void displayContacts(Contact[] list)
{
	int numContacts = list.length;

	for (int i = 0; i < numContacts; i++) {
		System.out.print(String.valueOf(i + 1) + ". " + list[i].getFirstName() + " ");
		System.out.println(list[i].getLastName());
		System.out.println(list[i].getMobilePhoneNum());
		System.out.println();
	}
	System.out.println(".............................");
	System.out.println();
}

public static void sortContacts(Contact[] list){
	boolean dirty;
	do{
		dirty = false;
		for(int i = 0; i < list.length-1; i++){
			if(list[i+1].getLastName().compareTo(list[i].getLastName())<0){
				dirty = true;
				Contact old = list[i];
				list[i] = list[i+1];
				list[i+1] = old;
			}
		}
	}while(dirty);
}

public static void modifyContact(Contact[] list){
	int targetIndex = Integer.parseInt(JOptionPane.showInputDialog(null,"Select the target"))-1;
	Contact target = list[targetIndex];
	String[] options = {"First Name","Last Name","Number"};
	String targetProperty = JOptionPane.showInputDialog(null,target.getFirstName() + " " + target.getLastName() + "\n" + target.getMobilePhoneNum() + "\n" + "Which property would you like to modify?");
	switch (targetProperty) {
		case "First Name":{
			target.changeFirstName(JOptionPane.showInputDialog(null,"What should the first name be set to?"));
			break;
		}
		case "Last Name":{
			target.changeLastName(JOptionPane.showInputDialog(null,"What should the last name be set to?"));
			break;
		}
		case "Number":{
			target.changeMobilePhoneNum(JOptionPane.showInputDialog(null,"What should the number be set to?"));
			break;
		}
	}
}

public static void main(String args[])
{
	Contact[] contactList;
	String fileName = JOptionPane.showInputDialog("What is the name of the file?");

	contactList = loadFile(fileName);

	String option = "";
	while (!option.equals("quit")) {
		String[] options = { "display", "add", "remove", "modify", "sort", "quit" };
		option = (String)JOptionPane.showInputDialog(null, "Please select an option:", "Options", JOptionPane.PLAIN_MESSAGE, null, options, null);
		if (option.equals("display"))
			displayContacts(contactList);
		if (option.equals("add"))
			contactList = addContact(contactList);
		if (option.equals("remove"))
			contactList = removeContact(contactList);
		if (option.equals("modify"))
			modifyContact(contactList);
		if(option.equals("sort"))
			sortContacts(contactList);
	}
	saveFile(fileName, contactList);
}
}
