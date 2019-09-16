/**
 * @(#)SimpleCraps.java
 *
 *
 * @author
 * @version 1.00 2014/7/24
 */
import javax.swing.JOptionPane;

public class SimpleCraps {

    public static void main(String args[])
    {
    	Die die1 = new Die(6);
    	Die die2 = new Die(6);


    	JOptionPane.showMessageDialog(null,"Press 'OK' to roll the dice");

    	int roll1 = die1.roll();
    	int roll2 = die2.roll();
    	
    	int sum = roll1+roll2;

    	JOptionPane.showMessageDialog(null,"You rolled a "+roll1+" and a "+roll2+".\n\nThe sum is "+sum);

    	if(sum==7 || sum==11)
    	{
    		JOptionPane.showMessageDialog(null,"You win!!!");
    	}
    	else if(sum==2 || sum==3 || sum==12)
    	{
    		JOptionPane.showMessageDialog(null,"You lose.");
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null,"You didn't win or lose.  Try again");
    	}




    }


}
