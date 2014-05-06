package castlight;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class FindBestRestaurant {
 
  public static void main(String[] args) {
 
	FindBestRestaurant obj = new FindBestRestaurant();
	System.out.println(args[0]);
	System.out.println(args[1]);
	//System.out.println(args[2]);
	obj.run();
 
  }
 
  public void run() {
 
	String csvFile = "data.csv";
	//System.out.println(System.getProperty("user.dir"));
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
 
	try {
 
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine()) != null) {
 
		    // use comma as separator
			String[] data = line.split(cvsSplitBy);
 
			System.out.println("Item [price= " + data[1] + " , name=" + data[2] + "]");
 
		}
 
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
 
	System.out.println("Done");
  }
 
}