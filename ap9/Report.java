import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Report
 */
public class Report {

	private static int MINLENGTH = 1000;
	private static int STEP = 1000;
	private static int MAXLENGTH = 20000;
	private static int COUNT = 1;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		if (args.length > 0) {
			MINLENGTH = Integer.parseInt(args[0]);
			STEP = Integer.parseInt(args[1]);
			MAXLENGTH = Integer.parseInt(args[2]);
			COUNT = Integer.parseInt(args[3]);
		}
		System.out.println("Length,metric,value");
		for (int l = MINLENGTH; l < MAXLENGTH; l += STEP) {
			System.err.println("Testing " + COUNT + " times on length " + l);
			String result = Sorts.report(COUNT, l);
			String[] lines = result.split("\n");
			for (String line : lines) {
				String algorithm = line.split(",")[1].split("-")[0];
				String metric = line.split(",")[1].split("-")[1];
				OutputStream f = new FileOutputStream(new File(algorithm + "-" + metric + ".csv"), true);
				for (int i = 0; i < line.length(); ++i) {
					f.write(line.charAt(i));
				}
				f.write('\n');
				f.close();
			}
		}
	}
}