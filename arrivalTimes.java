package ShortestPath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class arrivalTimes {
	
	public static void main(String[] args) {
		System.out.print("Enter the Time in hh:mm:ss: ");
		Scanner input = new Scanner(System.in);
	
		String time = input.nextLine();
		String delimitor = ":";
		String [] time_parts = time.split(delimitor);
		int hh; int mm; int ss;
		String arrival_Time = null;
		
		hh = Integer.parseInt(time_parts[0]);
		mm = Integer.parseInt(time_parts[1]);
		ss = Integer.parseInt(time_parts[2]);
		
		
		
		if(hh < 24 && mm < 60 && ss < 60) {
		File file = new File("stops_times.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = br.readLine()) != null) {
    		
				String delims = ",";
				String [] word = line.split(delims);
				arrival_Time = word[1];
				
				if(time == arrival_Time)
					System.out.printf(word[0], word[1], word[2], word[3], word[4], word[5], word[6], word[7], word[8]);
            	
            	
        		
        		
        		
        	}
        	
        	
    }

		catch (IOException e) {
			e.printStackTrace();
		}
		}
		else {
			System.out.print("invalid time");
					return;
		}
			
}
}