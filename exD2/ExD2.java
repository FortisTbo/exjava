import java.util.*;
import java.io.*;

public class ExD2 {
		
	public static void main (String [] args) {

		Scanner scanner = new Scanner(System.in);
		

		String title = introduceTitle(scanner);
		int numberOfDays = introduceNumberOfDays (scanner, title);
		double pricePerDay = introducePricePerDay (scanner, title);
		boolean priorKnowledgeRequired = Boolean.parseBoolean(introducePriorKnowledgeRequired (scanner, title));
		
		try ( PrintWriter out = new PrintWriter(new FileWriter("courseinfo.txt")); ) {
			out.println(printInfo (title, numberOfDays, pricePerDay, priorKnowledgeRequired));
		} catch(IOException ioexc) {
			System.out.println(ioexc.getMessage());
		}
	
	}
	
	public static String introduceTitle (Scanner scanner) {
		System.out.println ("Please enter the title of the course ?");
		
		String title = scanner.nextLine();
			
		if  (title.trim().length() == 0) {
			title = introduceTitle (scanner);
		}
		
		return title;
	}
	
	public static int introduceNumberOfDays (Scanner scanner, String title) {
		System.out.println ("Please enter the number of days for the course " + title + " ?");
		
		int numberOfDays;
		
		try {
			numberOfDays = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			numberOfDays = introduceNumberOfDays (scanner, title);
		}
		
		return numberOfDays;
	}
	
	public static double introducePricePerDay (Scanner scanner, String title) {
		System.out.println ("Please enter the price per day for the course " + title + " ?");
		
		double pricePerDay;
		
		try {
			pricePerDay = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			pricePerDay = introducePricePerDay (scanner, title);
		}
		
		return pricePerDay;
	}
	
	public static String introducePriorKnowledgeRequired (Scanner scanner, String title) {
		System.out.println ("Please enter if prior knowledge is required to follow the course " + title + " (Y/N)?");
		
		String priorKnowledgeRequired = scanner.nextLine().toUpperCase();
			
		if  (!("Y".equals(priorKnowledgeRequired) || "N".equals(priorKnowledgeRequired))) {
			priorKnowledgeRequired = introducePriorKnowledgeRequired (scanner, title);
		}
		
		return priorKnowledgeRequired;
	}
	
	public static String printInfo (String title, int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired) {
		String label = "OK";
		double totalPrice = totalPriceCalculation(numberOfDays, pricePerDay, priorKnowledgeRequired);
		if  (totalPrice < 500.0) {
			label = "CHEAP";
		} else if (totalPrice > 1500.0) {
			label = "EXPENSIVE";
		}
		
		return "Title=" + title + 
								" / Number of days=" + numberOfDays + 
								" / Price per day=" + pricePerDay +
								" / Prior knowledge is required=" + priorKnowledgeRequired + " Total price of the course=" + totalPrice + " --> " + label;
	}
	 
	public static double totalPriceCalculation (int numberOfDays, double pricePerDay, boolean priorKnowledgeRequired) {
		double price = pricePerDay * numberOfDays;
		double vat21;
		if  (numberOfDays > 3 && priorKnowledgeRequired) {
			vat21 = 0.0;
		} else {
			vat21 = price * 0.21;
		}
		return price + vat21;
	}
	 
}
