import javax.swing.JOptionPane;

public class AccountsRunner {
  public static void main(String[] args) {
    Account a = new Account("Joe", "420-555-6969", (double) 42069);
    System.out.println(a);
    Account b = new Account();
    System.out.println(b);
    b.changeBalance(1);
    b.changeName("Candice");
    b.changePhoneNumber("555-555-5555"); // dank javascript meme
    System.out.println(b);
    multipleAccounts(5);
  }

  public static void multipleAccounts(int count) {
    Account[] accounts = new Account[count];
    for (int i = 0; i < count; i++) {
      String name = JOptionPane.showInputDialog(null, "Input a name for contact " + (i + 1));
      String number = JOptionPane.showInputDialog(null, "Input a number for contact " + (i + 1));
      double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Input a balance for contact " + (i + 1)));
      accounts[i] = new Account(name, number, balance);
    }
    for (int i = 0; i < count; i++) {
      System.out.println(accounts[i]);
    }
  }
}