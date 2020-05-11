package ap1;

public class Account {
	private String Name;
	private String PhoneNumber;
	private double Balance;

	public Account() {
		Name = "Yuri";
		PhoneNumber = "1235556789";
		Balance = (double) 0;
	}

	public Account(String name, String phnumber) {
		Name = name;
		PhoneNumber = phnumber;
		Balance = (double) 0;
	}

	public Account(String name, String phnumber, double balance) {
		Name = name;
		PhoneNumber = phnumber;
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void deposit(double amount) {
		Balance += amount;
	}

	public void withdraw(double amount) {
		Balance -= amount;
	}

	public void changeName(String tgt) { // kotlin and javascript's transparent getters and setters have spoiled me
		Name = tgt;
	}

	public void changePhoneNumber(String tgt) {
		PhoneNumber = tgt;
	}

	public void changeBalance(double tgt) {
		Balance = tgt;
	}

	public String toString() {
		String result = "";
		result += "Name: " + Name + "\n";
		result += "Number: " + PhoneNumber + "\n";
		result += "Balance: " + Balance;
		return result;
	}
}