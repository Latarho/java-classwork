// Why would I do this with moduli? It would be far easier to just cast to a string and get the digit by index that way.
class assignmentSeven{
  public static void main(String[] args){
    if(args.length == 0){
      System.err.println("You need to specify an action via command-line parameters. I'm not listing them here; go check the source and figure it out.");
      System.exit(1);
    }
    String action = args[0].trim();
    System.err.println(action);
    if(action.equals("divisibility")){
      float dividend = Float.parseFloat(args[1]);
      float divisor = Float.parseFloat(args[2]);
      if(dividend%divisor == 0){
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }
    }
    else if(action.equals("oddity")){
      float input = Float.parseFloat(args[1]);
      if(input%2 == 0){
        System.out.println("1");
      }
      else{
        System.out.println("0");
      }
    }
    else if(action.equals("substring")){
      String input = args[1];
      int start = Integer.parseInt(args[2]);
      int count;
      if(args.length==4){count = Integer.parseInt(args[3]);}else{count = 1;}
      System.out.println(input.substring(start, start+count));
    }
    else if(action.equals("substring-rl")){
      for(int i = 1; i < 4; i++){System.err.println(args[i]);}
      String input = args[1];
      int start = input.length() - Integer.parseInt(args[2]);
      int count;
      if(args.length==4){count = Integer.parseInt(args[3]);}else{count = 1;}
      System.out.println(input.substring(start-count, start));
    }
    else{
      System.err.println("Unknown action");
    }
  }
}
