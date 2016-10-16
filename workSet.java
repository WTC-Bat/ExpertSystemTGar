
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class workSet {
	public static void main(String args[]) throws IOException, IOException{
		Sum sumObject = new Sum();
		String line;
		sumObject.arrFill();
		try (
				FileInputStream fis = new FileInputStream("test.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
			) {
			while ((line = br.readLine()) != null) {
				// Deal with the line
				System.out.println(line);
				line = line.replaceAll("#(.*)", "");
				line = line.replaceAll(" ", "");
				sumObject.firtPass(line);
			}
			}
		try (
				FileInputStream fis = new FileInputStream("test.txt");
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
			) {
			while ((line = br.readLine()) != null) {
				// Deal with the line
				line = line.replaceAll("#(.*)", "");
				line = line.replaceAll(" ", "");

				sumObject.seperate(line);
				sumObject.firstQuestion(line);

			}
			}
		sumObject.print();	
	}
}
