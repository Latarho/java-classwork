package ap5;

/**
 * board.java
 *
 * @author - 177013 is my favourite wholesome manga
 *
 */

public class Board {
	// a zero means there is nothing there. Another number is the player number
	int[][] game;

	// Board will create array 'game' that will represent the connect four game.
	public Board(int rows, int columns) {
		game = new int[columns][rows];
		for (int y = 0; y < rows; y++) {
			for (int x = 0; x < columns; x++) {
				game[x][y] = 0;
			}
		}
	}

	// takes in a player number (not 0) and a column number to drop the piece in.
	// The column number
	// is always within the range. It places the number in the appropriate spot. If
	// the column is already full,
	// the method returns 'false'
	//
	// it seems out beautifiers have different preferred line lengths
	public boolean takeATurn(int player, int column) {
		int[] col = game[column];
		for (int i = 0; i < col.length; i++) {
			if (col[i] == 0) {
				col[i] = player;
				return true;
			}
		}
		return false;
	}

	// checks to see if a given 'player' has won the game. It looks for any four in
	// a row:
	// horizontally, vertically, and diagonally. Returns 'true' if 'player' has a
	// win.
	// Make sure horizontal and vertical win checks work before you attempt
	// diagonal.
	public boolean isWin(int player) {
		// Cardinal checks
		int[] rowCounters = new int[game.length];
		int[] diagonalCounters = new int[game.length + game[0].length];
		int[] diagonalCounters2 = new int[game.length + game[0].length];
		for (int x = 0; x < game.length; x++) {
			int count = 0;
			for (int y = 0; y < game[x].length; y++) {
				if (game[x][y] == player) {
					count++;
					rowCounters[y]++;
					diagonalCounters[x + y]++;
					diagonalCounters2[game[0].length + x - y]++;
					if (count >= 4)
						return true;
					if (rowCounters[y] >= 4)
						return true;
					if (diagonalCounters[x + y] >= 4)
						return true;
					if (diagonalCounters2[game[0].length + x - y] >= 4)
						return true;
				} else {
					count = 0;
					rowCounters[y] = 0;
					diagonalCounters[x + y] = 0;
					diagonalCounters2[game[0].length + x - y] = 0;
				}
			}
		}
		return false;
	}

	// checks to see if all spaces have been filled. Returns 'true' if so
	public boolean isFull() {
		for (int x = 0; x < game.length; x++) {
			for (int y = 0; y < game[x].length; y++) {
				if (game[x][y] == 0)
					return false;
			}
		}
		return true;
	}

	// Returns a String that contains a displayable board - See sample run for how
	// it should look
	public String toString() {
		String output = "";

		for (int y = game[0].length - 1; y >= 0; y--) {
			for (int x = 0; x < game.length; x++) {
				output += game[x][y] + " ";
			}
			output += "\n";
		}

		return output;
	}

	// Makes a valid move for the computer. It may be random or involve strategy
	public int computerTurn(int player) {
		// An RNG plays this game about as well as an untrained human anyway lol
		int move = new java.util.Random().nextInt(game.length - 1) + 1;
		takeATurn(2, move);
		return move;
	}
}