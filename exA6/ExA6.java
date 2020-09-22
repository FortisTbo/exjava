import java.util.*;

public class ExA6 {
	
	 public static void main (String [] args) {
		
		Map<String, Integer> months = new HashMap <String, Integer>();   
        
		months.put("January",31);
		months.put("February",28);
		months.put("March",31);
		months.put("April",30);
		months.put("May",31);
		months.put("June",30);
		months.put("July",31);
		months.put("August",31);
		months.put("September",30);
		months.put("October",31);
		months.put("November",30);
		months.put("December",31);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Please enter the day ?");
		int day = Integer.parseInt(scanner.nextLine());
				
		System.out.println ("Please enter the month ?");
		String month = scanner.nextLine();
		
		int numberOfDaysRemaining =  months.get(month) - day;
				
		System.out.println ("For the month " + month + " it remains " + numberOfDaysRemaining +  " day(s)");
		
	 }
}
