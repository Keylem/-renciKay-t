import java.util.ArrayList;

public class Engine {
	public static Finder finderLocation = new Finder();
	public static ArrayList<Student> data = new ArrayList<Student>();

	public void newStudent(String name) {
		Student newStudent = new Student(name);
		this.data.add(newStudent);
		System.out.println("A new Student joined to the party!");
		studentPrinter(newStudent);
		System.out.println("\n");

	}

	public void findStudent(String name) {
		System.out.println("Student Found!");
		this.finderLocation.find(name);
		studentPrinter(finderLocation.cursor);
		System.out.println("Done! \n");

	}

	public void findStudent(int number) {
		System.out.println("Student Found!");
		this.finderLocation.find(number);
		studentPrinter(finderLocation.cursor);
		System.out.println("Done! \n");
		
		
	}

	public void removeStudent(int number) {
		System.out.println("Student Found!");
		Student studentRemoved = this.finderLocation.find(number);
		this.data.remove(studentRemoved.getNumber());
		System.out.println("REMOVING.........");
		studentPrinter(finderLocation.cursor);
		
		System.out.println("Removed!\n");

	}

	public void removeStudent(String name) {
		System.out.println("Student Found!");
		Student studentRemoved = this.finderLocation.find(name);
		this.data.remove(studentRemoved.getNumber());
		System.out.println("REMOVING.........");
		studentPrinter(finderLocation.cursor);
		
		System.out.println("Removed!\n");

	}

	public void printAll() {
		System.out.println("Printing everyone....");
		for (Student x : this.data) {
			// TODO STUDENT PRINTER
			studentPrinter(x);
			
		}
		System.out.println("Done!\n");
	}
	
	private void studentPrinter(Student student) {
		
		System.out.println("Name : " + student.getName());
		System.out.println("Number : " + student.getNumber());
		//System.out.println("Year : " + student.year);  //TODO YEAR
	}

}
