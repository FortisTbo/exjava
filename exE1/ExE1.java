import java.util.*;
import java.io.*;

public class ExE1 {
		
	public static void main (String [] args) {
			
		String instructorFirstName = args[0];
		String instructorLastName = args[1];
		int instructorAge = Integer.parseInt(args[2]);
		double instructorSalary = Double.parseDouble(args[3]);
		
		printSalaryHistory(instructorLastName, instructorAge, instructorSalary);

	 }
	 
	 public static void printSalaryHistory (String instructorLastName, int instructorAge, double instructorSalary) {
		int age;
		double salary = instructorSalary;
		
		try ( PrintWriter out = new PrintWriter(new FileWriter("salaryhistory.txt")); ) {
			for (int i=0; i <= 7; i++) {
				age = instructorAge + (i*5);
				
				out.println ("Salary of " + instructorLastName + 
									" at " + age + 
									" is " + salary);
				salary = salary * 1.03;
			}
			out.println ("Maximum salary reached");
		} catch(IOException ioexc) {
			System.out.println(ioexc.getMessage());
		}
		
		
	 }
}
