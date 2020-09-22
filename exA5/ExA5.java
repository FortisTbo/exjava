import java.util.ArrayList;
import java.util.Scanner;

public class ExA5 {
	
	 public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Please enter the title of the course ?");
		String title = scanner.nextLine();
		
		System.out.println ("Please enter the number of days for the course " + title + " ?");
		int numberOfDays = Integer.parseInt(scanner.nextLine());
		
		System.out.println ("Please enter the price per day for the course " + title + " ?");
		double pricePerDay = Double.parseDouble(scanner.nextLine());
		
		boolean priorKnowledgeRequired = false;
		ArrayList<String> instructors = new ArrayList<String> ();
		instructors.add("Instructor 1");
		instructors.add("Instructor 2");
		instructors.add("Instructor 3");
		 
		 
		System.out.println ("Title=" + title + 
								" / Number of days=" + numberOfDays + 
								" / Price per day=" + pricePerDay +
								" / Prior knowledge is required=" + priorKnowledgeRequired + 
								" / Number of instructors=" + instructors.size());
								
		double price = pricePerDay * numberOfDays;
		double vat21 = price * 0.21;
		double totalPrice = price + vat21;
				
		System.out.println ("Total price of the course=" + totalPrice +
								" (Price=" + price + " + Vat21%=" + vat21);
		
	 }
}
