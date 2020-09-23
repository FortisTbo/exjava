import java.util.*;

public class ExC4 {
	
	 public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		welcome (scanner);
	 }
	 
	 public static void welcome (Scanner scanner) {
		System.out.println ("Welcome!");
		System.out.println ("Would you like to be greeted again? (Y/N)");
		
		if ("Y".equals(scanner.nextLine())) {
			welcome (scanner);
		}
	 }
}
