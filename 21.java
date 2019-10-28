class assignmentTwentyOne{ // Done in *nine* semicolons, one of which isn't absolutely required.
  public static void main(String[] args) {
    String[][] numerals = { // Saves a ton of semicolons by storing these as an array
      {"M","1000"},
      {"CM","900"},
      {"D","500"},
      {"CD","400"},
      {"C","100"},
      {"XC","90"},
      {"L","50"},
      {"XL","40"},
      {"X","10"},
      {"IX","9"},
      {"V","5"},
      {"IV","4"},
      {"I","1"}
    };
    int input = Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null,"Input a number")); // Saves a semicolon by using a direct reference instead of an import.
    int originalInput = input; // This semicolon is only required to keep track of this for later, it could be removed.
    String output = "";
    for(int i = 0; i < numerals.length; i++){
      while(input>=Integer.parseInt(numerals[i][1])){
        output += numerals[i][0];
        input -= Integer.parseInt(numerals[i][1]);
      }
    }
    System.out.println(originalInput + " written as a roman numeral is " + output);
  }
}
