//package org.apache.commons.csv;

import java.util.*;
import java.io.*;
import edu.duke.*;
//import com.opencsv.*;
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVRecord;

public class exportsParser{

	void println(Object obj){
		System.out.println(obj);
	}
	
	public String countryInfo(String country){

		// Returns string of information about country 		
		// else returns "not found"
		// Format of response is :
		// Country followed by : 
		// Followed by list of countries exports 
		// Followed by : which is followed by countries export value
		// exports_small.csv (using Germany)
		// Germany: motor vehicles, machinery, chemicals: $1,547,000,000,000

		File file = new File("./exports_small.csv");
		try{
			Scanner scanner =  new Scanner(file);
			Map<String, String> data = new HashMap<String, String>();

			while(scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				println(line);
				data.put(line.match((".*?"|[^\s",][^",]+[^\s",])(?=\s*,|\s*$)/g);
				println(data);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}

//		String line = "";

		String recordToReturn = "";

//		String[] countryDetails = .match
//

/*		Map<String, String, String> data = new HashMap<String, String, String>();

		try{
			BufferedReader br = new BufferedReader(new FileReader("./exports_small.csv"));
			while((line = br.readLine()) != null)
			{
				String[] countryDetails = line.match(/(".*?"|[^",\s]+)(?=\s*,|\s*$)/g);
				println(countryDetails[2]);*/
//				println(countryDetails[0]);
//			}
//			for(String s : countryDetails){
				
//			}

			// Enter the code here to find the specific country based on the specific country variable
			// Thanks ya wee lil tart ;)
//		}
/*		catch (IOException e){
			e.printStackTrace();
		}*/
		return recordToReturn; 
	}

		public void tester(){
			String record = countryInfo("Germany");
//			println("Hopefully this is the correct record: " + record);
		} 	
		public static void main(String args[]) throws FileNotFoundException{
			exportsParser par = new exportsParser();
			par.tester();		
		}
	}
