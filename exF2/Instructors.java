import java.util.ArrayList;

public class Instructors {
	private ArrayList<String> instructors = new ArrayList<String> ();

	public Instructors() {
		
	}


	public ArrayList<String> getInstructors() {
		return instructors;
	}

	public void setInstructors(ArrayList<String> instructors) {
		this.instructors = instructors;
	}
	
	public void addInstructor (String instructorName) {
		this.instructors.add(instructorName);
	}
	
	public void printInstructors () {
		for (int i=0; i <instructors.size();i++ ) {
			System.out.println(this.instructors.get(i));
		}
	}
}
