public class ExF2 {

	public static void main(String[] args) {
		
		
		Instructor instructor1 = new Instructor ("FirstNameInstr1", "LastNameInstr1", 25);
		Instructor instructor2 = new Instructor ("FirstNameInstr2", "LastNameInstr2", 36);
		
		Instructors instructors = new Instructors ();
		instructors.addInstructor(instructor1);
		instructors.addInstructor(instructor2);
		
		
		instructors.printInstructors();
		
		
	}

}
