package ShortestPath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class shortPaths {

	public static void main(String[] args) {
		System.out.print("Enter your stop id: ");
		Scanner input = new Scanner(System.in);
		
		
		int trip_id = 0;
		int Route = input.nextInt();
		
		File file = new File("stops_times.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(file)))
    {
        String line;
        while ((line = br.readLine()) != null) {
        	
        		int stop_id = 0;
        		String temp = null;
            	String delims = ",";
            	String [] word = line.split(delims);
            	temp = word[3];
            	stop_id = Integer.parseInt(temp);
            	temp = word[0];
        		trip_id = Integer.parseInt(temp);
        		
            	if( stop_id == Route) {
            		System.out.print(stop_id);
            		
            		while((line = br.readLine()) != null) {
            			  	temp = word[0];
            			  	int temp2 = 0;
            			  	temp2 = Integer.parseInt(temp);
            			  	if(trip_id == temp2)
            			  		System.out.print(word[3]);
            			  	else 
            			  		return;
            		}
            		
            		
            		
                	
                	
            		
            		
            		
            	}
            	
            	
        }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
}
}