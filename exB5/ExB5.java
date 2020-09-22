import java.util.*;

public class ExB5 {
	
	 public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println ("Welcome!");
			System.out.println ("Would you like to be greeted again? (Y/N)");
		
		} while ("Y".equals(scanner.nextLine()));
	 }
}
