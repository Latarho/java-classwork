class assignmentTwo {
  public static void main(String[] args){
    for (int i = 0; i < 10; i++){
      System.out.println(bigNumber(i));
      System.out.println("");
    }
  }
  public static String bigNumber(int number){
    switch (number){
      case 0: return String.join("\n", seven, five, five, five, seven);
      case 1: return String.join("\n", two, six, two, two, seven);
      case 2: return String.join("\n", seven, one, seven, four, seven);
      case 3: return String.join("\n", seven, one, seven, one, seven);
      case 4: return String.join("\n", five, five, seven, one, one);
      case 5: return String.join("\n", seven, four, seven, one, seven);
      case 6: return String.join("\n", seven, four, seven, five, seven);
      case 7: return String.join("\n", seven, one, one, one, one);
      case 8: return String.join("\n", seven, five, seven, five, seven);
      case 9: return String.join("\n", seven, five, seven, one, one);
      default: return "";
    }
  }
  public static String zero = "   ";
  public static String one = "  *";
  public static String two = " * ";
  public static String three = " **";
  public static String four = "*  ";
  public static String five = "* *";
  public static String six = "** ";
  public static String seven = "***";
}
