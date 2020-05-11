package ap5;

/**
 * Connect4.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */

import javax.swing.JOptionPane;

public class Connect4 {
	public static void main(String args[]) {
		int rows = 6;
		int columns = 7;
		Board c4 = new Board(rows, columns);
		String turnStr;
		int turn;
		int human = 0;
		int computer = 0;
		String[] buttons = { "First", "Second" };
		int opt = JOptionPane.showOptionDialog(null, "Human, would you like to go first or second?", "",
				JOptionPane.PLAIN_MESSAGE, 3, null, buttons, buttons[0]);
		human = opt + 1;
		computer = (opt * -1) + 2;
		String[] options = new String[columns];
		for (int i = 0; i < columns; i++)
			options[i] = "" + (i + 1);

		if (human == 2) {
			int compMove = c4.computerTurn(computer);
			JOptionPane.showMessageDialog(null, c4 + "\n\nThe computer chose column " + compMove);
		}
		while (!(c4.isWin(1) || c4.isWin(2) || c4.isFull())) {
			boolean legit = false;
			while (!legit) {
				turnStr = (String) JOptionPane.showInputDialog(null, c4 + "\nHuman, which column?", "", JOptionPane.PLAIN_MESSAGE,
						null, options, null);
				turn = Integer.parseInt(turnStr);
				legit = c4.takeATurn(1, turn);
				if (!legit)
					JOptionPane.showMessageDialog(null, "That column is full!\n\nTry again");
			}
			if (!c4.isWin(1)) {
				int compMove = c4.computerTurn(computer);
				JOptionPane.showMessageDialog(null, c4 + "\n\nThe computer chose column " + compMove);
			}
		}
		String finalMessage = c4 + "\n\n";
		if (c4.isFull())
			finalMessage += "It is a tie game.";
		else if ((c4.isWin(1) && human == 1) || (c4.isWin(2) && human == 2))
			finalMessage += "The human has won!";
		else
			finalMessage += "The computer has won!";
		JOptionPane.showMessageDialog(null, finalMessage);
	}
}