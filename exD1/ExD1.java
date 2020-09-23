import java.util.*;
import java.io.*;


public class ExD1 {
	
	 public static void main (String [] args) {

		ArrayList<String> instructors = new ArrayList<String> ();
		
		try (BufferedReader bufferReader = new BufferedReader(new FileReader("instructors.txt"));) {
			String nextLine;
	
			while ((nextLine = bufferReader.readLine()) != null) {
				instructors.add(nextLine);
			}
		} catch(IOException e){
			System.err.println("Cannot establish connection - "+ e.toString());
		}
		
		for (String instructor : instructors) {
			System.out.println ("instructor=" + instructor);
		}					

		
	 }

}
