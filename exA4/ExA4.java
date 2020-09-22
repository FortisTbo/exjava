import java.util.ArrayList;

public class ExA4 {
	
	 public static void main (String [] args) {
		
		for(String arg: args){
			System.out.println(arg);
		}
		
		String title = new String (args[0]);
		int numberOfDays = Integer.parseInt(args[1]);
		double pricePerDay = Double.parseDouble(args[2]);
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
