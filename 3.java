class assignmentThree {
  static void printNcharacters(String str, int numCharacters)
  {
    for (int i = 0; i < numCharacters; i++)
    {
      System.out.print(str);
    }
    System.out.println();
  }
  public static void main(String[] args){
    System.out.print("i) ");
    printNcharacters("@", 12);
    System.out.print("ii) ");
    printNcharacters("*", 3);
    System.out.print("iii) ");
    printNcharacters("$", 5);
    System.out.print("iv) ");
    printNcharacters("$@", 4);
    System.out.print("v) ");
    printNcharacters("$@$%", 5);
  }
}
