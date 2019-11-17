/**
 * @(#)FilesLab1.java
 *
 *
 * @author
 * @version 1.00
 */


public class FilesLab1
{
public static void main(String[] args)
{
        String[] data;
        data = ReadFromFile();
        data = AddARecord(data,"Harry Harriot");
        WriteToFile(data, "out.txt");
        data = RemoveARecord(data,"Drake Drummond");
        WriteToFile(data, "out.txt");
}



static String[] ReadFromFile()
{
        int NumberOfRecords;

        // Opens data file InputData.txt for reading //
        EasyReader inFile = new EasyReader ("Lab1Data.txt");

        // Checks if the file is bad. If file is not readable an error message is printed. //
        if (inFile.bad())
        {
                System.out.println("Can't open " +inFile);
                System.exit(1);
                String[] namesArray = {"-1"};

                return namesArray;
        }
        else // File is not bad, proceed with reading the contents
        {
                String str = inFile.readLine(); //Get the number of records in the file
                NumberOfRecords = Integer.parseInt(str); //Must convert to an integer. All data stored as strings in files.

                String [] namesArray = new String[NumberOfRecords]; //Define an array to store the data from the file
                for (int i = 0; i < NumberOfRecords; i++)
                {
                        namesArray[i] = inFile.readLine(); //Read and store all the data in the file
                }

                inFile.close();
                return namesArray;
        }
}



//This method adds a record to an array of record. In this case the record is only a String
static String[] AddARecord(String[] names, String name)
{
        String[] result = new String[names.length+1];
        for(int i = 0; i < names.length; i++) result[i] = names[i];
        result[names.length] = name;
        return result;
}



//Writes the contents of an array to a file
static void WriteToFile(String[] names, String out)
{
        EasyWriter writer = new EasyWriter(out);
        writer.println(names.length);
        for(int i = 0; i < names.length; i++) {
                writer.println(names[i]);
        }
        writer.close();
}




//Searches an array for an item. If found remove the iem and contract the size of the array.
static String[] RemoveARecord(String[] names, String name)
{
  int counter = names.length;
  for(int i = 0; i < names.length; i++) if(names[i].equals(name)) counter--;
  String[] result = new String[counter];
  counter = 0;
  for(int i = 0; i < names.length; i++) if(!names[i].equals(name)) { result[counter]=names[i]; counter++; }
  return result;
}

}
