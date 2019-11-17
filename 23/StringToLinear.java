public class StringToLinear
{



	// Put any extra methods (if neeeded) here



	public static LinearFunction convert(String arg)
	{
		double m, b;
		String linFuncStr = new String();
		linFuncStr = arg;
		// main part of the method:
		//   extract the slope and y-intercept from the
		//   equation in linFuncStr and store them in
		//   m and b respectively.
		String[] processedString = linFuncStr
		.toLowerCase()
		.replaceAll("[ \\*]", "")
		.replaceAll("X", "x")
		.replaceAll("Y", "y")
		.replaceAll("\\-", " -")
		.replaceAll("\\+", " + ")
		.replaceAll("\\=", " = ")
		.split(" ");
		System.out.println(String.join(" ", processedString));
		double rawm = 1;
		double rawy = 0;
		double vdivisor = 1;
		for(int i = 0; i < processedString.length; i++){
			if(processedString[i].contains("x")){
				String trimmedString = processedString[i].replaceAll("x"," ");
				if (trimmedString == "-") trimmedString = trimmedString + "1";
				rawm = Double.parseDouble(trimmedString);
			} else if (processedString[i].contains("y")){
				String trimmedString = processedString[i].replaceAll("y","");
				System.out.println(trimmedString.length());
				if (trimmedString == "-") trimmedString = trimmedString + "1";
				if (trimmedString.length() == 0) vdivisor = 1;
				else {vdivisor = Double.parseDouble(trimmedString);}
			} else if (processedString[i].matches("[\\=+]")) {} else {
				rawy = Double.parseDouble(processedString[i]);
			}
		}
		System.out.println(rawm);
		System.out.println(rawy);
		System.out.println(vdivisor);

		return new LinearFunction(rawm/vdivisor,rawy/vdivisor);
	}
}
