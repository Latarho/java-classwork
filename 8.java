import javax.swing.JOptionPane;

class assignmentEight {

   public static boolean isAbiggerOf2(int A, int b)
    {
    	return A>b;
    }

    public static boolean isAbiggestOf3(int A, int b, int c)
    {
    	return A>b && A>c;
    }

    public static boolean isAtop2spots1(int A, int b, int c, int d)
    {
      int counter = 0;
      if(A>b) counter++;
      if(A>c) counter++;
      if(A>d) counter++;
      return counter>1;
    }

    public static boolean isAtop2spots2(int A, int b, int c, int d)
    {
      // Look, ma! No if statements!
   		return (A>b && A>c) || (A>c && A>d) || (A>d && A>b);
    }


    public static void main(String args[])
    {

    	//Do NOT change any code below

    	String AInput = JOptionPane.showInputDialog("Enter A");
   		int ANum = Integer.parseInt(AInput);
   		String bInput = JOptionPane.showInputDialog("Enter b");
   		int bNum = Integer.parseInt(bInput);
   		String cInput = JOptionPane.showInputDialog("Enter c");
   		int cNum = Integer.parseInt(cInput);
   		String dInput = JOptionPane.showInputDialog("Enter d");
   		int dNum = Integer.parseInt(dInput);

   		String notStr="";
   		if(isAbiggerOf2(ANum, bNum))
   			notStr="";
   		else
   			notStr="NOT ";
   		System.out.println(ANum+" is "+notStr+"bigger than "+bNum);

   		if(isAbiggestOf3(ANum, bNum, cNum))
   			notStr="";
   		else
   			notStr="NOT ";
   		System.out.println(ANum+" is "+notStr+"the biggest of "+ANum+", "+bNum+", and "+cNum);

   		if(isAtop2spots1(ANum, bNum, cNum, dNum))
   			notStr="";
   		else
   			notStr="NOT ";
   		System.out.println(ANum+" is "+notStr+"in the top two of "+ANum+", "+bNum+", "+cNum+", and "+dNum);

   		if(isAtop2spots2(ANum, bNum, cNum, dNum))
   			notStr="";
   		else
   			notStr="NOT ";
   		System.out.println("Again, "+ANum+" is "+notStr+"in the top two of "+ANum+", "+bNum+", "+cNum+", and "+dNum);


    }


}
