import java.util.*;

public class ExB2 {
	
	 public static void main (String [] args) {
		
		for(String arg: args){
			System.out.println(arg);
		}
		
		String title = args[0];
		int numberOfDays = Integer.parseInt(args[1]);
		double pricePerDay = Double.parseDouble(args[2]);
		boolean priorKnowledgeRequired = Boolean.parseBoolean(args[3]);
		
									
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
}
