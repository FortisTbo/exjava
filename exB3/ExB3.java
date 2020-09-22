import java.util.*;

public class ExB3 {
	
	 public static void main (String [] args) {
		
		int[] arrOfIntegers = {2, 2, 3};
		
		int sumOfIntegers = 0;
		for (int arr : arrOfIntegers) {
			sumOfIntegers = sumOfIntegers + arr;
		}
				
		System.out.println ("average=" + sumOfIntegers / arrOfIntegers.length);
	 }
}
