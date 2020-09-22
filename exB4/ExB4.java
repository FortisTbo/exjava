import java.util.*;

public class ExB4 {
	
	 public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Please enter your language ?");
		String language = scanner.nextLine();
		

		String str = "two"; 
        switch(language) 
        { 
            case "FR": 
                System.out.println("Bonjour"); 
                break; 
            case "NL": 
                System.out.println("Goeiedag"); 
                break; 
            case "EN": 
                System.out.println("Good day"); 
                break; 
            default: 
                System.out.println("Goeiedag, bonjour and good day!"); 	
		}

	 }
}
