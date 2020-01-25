/**
 * A register object to keep track off and manage a list of students on a course.
 *
 * @author (Billy James Martin)
 * @version (1)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Register {
	
	private ArrayList<Student> STUDENTS;
	/**
	 * Constructor
	 */
	public Register() {
		STUDENTS = new ArrayList<Student>();
	}
	/**
	 * Adds a student to the register.
	 * @param student The student to add.
	 */
	public void addStudent(Student student) {
		STUDENTS.add(student);
	}
	/**
	 * Removes a student from the register.
	 * @param student The student to remove.
	 */
	public void removeStudent(Student student) {
		if(STUDENTS.contains(student)) {
			STUDENTS.remove(student);
			System.out.println(student.getFirstName()+" "+student.getSurname()+" Has been removed from this register");
			sortBySurname();											//Sort the register
			
		}
		else {
			System.out.println("Student Is Not On This Register");		//Student not on the register
		}
	}
	/**
	 * A custom sort method to compare the names of students in the register.
	 */
	public void sortBySurname() {
		Collections.sort(STUDENTS, new Comparator<Student>() {
			  @Override
			  public int compare(Student s1, Student s2) {
			    return s1.getSurname().compareTo(s2.getSurname());
			  }
			});
	}
	/**
	 * Prints all students on register.
	 */
	public void listStudents() {
		System.out.println("Current Students On This Register: (Surname, Forename");
		for(Student s: STUDENTS) {System.out.println(s.getSurname()+", "+s.getFirstName());}
	}
}
