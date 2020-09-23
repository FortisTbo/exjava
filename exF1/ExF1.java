import java.io.IOException;

public class ExF1 {

	public static void main(String[] args) {
		Course course = new Course ("Java", 15, 150.0, true);
		try {
			course.printInfoInFile();
		} catch (IOException ioexc) {
			System.out.println(ioexc.getMessage());
		}
		
		Course cours2 = new Course ("Python", 15, 200.0, false);
		System.out.println(cours2.printInfo());
		System.out.println(cours2.getLabel());
	}

}
