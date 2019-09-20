class assignmentTwoB {
  public static void main(String[] args){
    for (int i = 1; i < 10; i++){
      bigNumber(i);
      System.out.println("");
    }
  }
  public static void bigNumber(int number){
    switch (number){
      case 1: Str2(); Str5(); Str2(); Str2(); Str7(); break;
      case 2: Str7(); Str1(); Str7(); Str3(); Str7(); break;
      case 3: Str7(); Str1(); Str7(); Str1(); Str7(); break;
      case 4: Str6(); Str6(); Str7(); Str1(); Str1(); break;
      case 5: Str7(); Str3(); Str7(); Str1(); Str7(); break;
      case 6: Str7(); Str3(); Str7(); Str6(); Str7(); break;
      case 7: Str7(); Str1(); Str1(); Str1(); Str1(); break;
      case 8: Str7(); Str6(); Str7(); Str6(); Str7(); break;
      case 9: Str7(); Str6(); Str7(); Str1(); Str1(); break;
      default: throw new Error("Unknown number");
    }
  }
  public static void Str1()
  {
  	System.out.println("  *");
  }

  public static void Str2()
  {
  	System.out.println(" * ");
  }

  public static void Str3()
  {
  	System.out.println("*  ");
  }

  public static void Str4()
  {
  	System.out.println(" **");
  }

  public static void Str5()
  {
  	System.out.println("** ");
  }

  public static void Str6()
  {
  	System.out.println("* *");
  }


  public static void Str7()
  {
  	System.out.println("***");
  }

  public static void Str8()
  {
  	System.out.println("   ");
  }
}
