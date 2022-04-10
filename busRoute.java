package ShortestPath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class busRoute {
	
	public static void main(String[] args) {
		System.out.print("Please enter your location: ");
		Scanner input = new Scanner(System.in);
		String Name = input.next();
		StringBuffer sb = new StringBuffer();
        File file = new File("stops.txt");
 
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                	String delims = ",";
                	String [] word = line.split(delims);
                	String [] new_String = null;
                	String brief = null;
                	int i = 0;
                	
                	for( i = 3; i < word.length; i++) {
                		new_String[i-3] = word[i];
                	}
                	
                	new_String[i-3] += " ";
                	new_String[i-2] += word[0];
            		new_String[i-1] += word[1];
            		
                	for(int j = 0; j < new_String.length; j++) {
                        sb.append(new_String[j]);
                     }
                	
                		
                	
                		brief = new_String[0];
                		brief += new_String[1];
                		brief += new_String[2];
                	
                	
                		if(new_String[0] == Name)
                			System.out.printf(word[2]);
                
                
                
                
                
            }
        } catch (IOException e) {
            e.printStackTrace();
		
	
	}
	}
}