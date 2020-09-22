import java.util.*;

public class ExC1 {
	
	public static String 	title;
	public static int 		numberOfDays;
	public static double 	pricePerDay;
	public static boolean 	priorKnowledgeRequired;
		
	public static void main (String [] args) {
			
		title = args[0];
		numberOfDays = Integer.parseInt(args[1]);
		pricePerDay = Double.parseDouble(args[2]);
		priorKnowledgeRequired = Boolean.parseBoolean(args[3]);
		
		printInfo ();
		
		double price = pricePerDay * numberOfDays;
		double vat21;
		if  (numberOfDays > 3 && priorKnowledgeRequired) {
			vat21 = 0.0;
		} else {
			vat21 = price * 0.21;
		}
		double totalPrice = price + vat21;
		
		String label = "OK";
		if  (totalPrice < 500.0) {
			label = "CHEAP";
		} else if (totalPrice > 1500.0) {
			label = "EXPENSIVE";
		}
				
		System.out.println ("Total price of the course=" + totalPrice + " --> " + label);
	 }
	 
	 public static void printInfo () {
		 System.out.println ("Title=" + title + 
								" / Number of days=" + numberOfDays + 
								" / Price per day=" + pricePerDay +
								" / Prior knowledge is required=" + priorKnowledgeRequired);
	 }
}
