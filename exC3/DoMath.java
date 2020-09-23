public class DoMath {
	
	public static int calculateAverage (int[] arrOfIntegers){
		int sumOfIntegers = 0;
		for (int arr : arrOfIntegers) {
			sumOfIntegers += arr;
		}
		return sumOfIntegers / arrOfIntegers.length;
	}
}
