import java.util.ArrayList;

public class ExA2 {
	
	 public static void main (String [] args) {
		 
		 String title = new String ("Java");
		 int numberOfDays = 3;
		 double pricePerDay = 120.00;
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
	 }
}
