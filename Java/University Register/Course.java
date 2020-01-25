import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
/**
 * A Course object containing several modules.
 *
 * @author (Billy James Martin)
 * @version (2)
 */
public class Course {
	
	private String TITLE;
	private int NOMODULES;
	private Register REGISTER;
	private HashMap<Student, Integer> SCORES;
	private HashMap<Student, String> GRADES;
	private ArrayList<Module> MODULES;
	
	/**
	 * Constructor
	 * @param title The course title.
	 * @param nomodules The amount of modules the course has.
	 * @param register	The register of students for this course.
	 */
	public Course(String title, int nomodules, Register register){
		TITLE=title;
		NOMODULES=nomodules;
		MODULES = new ArrayList<Module>();
		REGISTER = register;
		SCORES = new HashMap<Student, Integer>();
		GRADES = new HashMap<Student, String>();
		assignModules();
	}
	/**
	 * Retrieve the title of the course.
	 * @return The title of the course.
	 */
	public String getTitle() {return TITLE;}
	/**
	 * Retrieve the number of modules this course has.
	 * @return The amount of modules the course has.
	 */
	public int getNoModules() {return NOMODULES;}
	/**
	 * Assign module objects to this course object.
	 */
	private void assignModules() {
		while(NOMODULES>MODULES.size()) {
			Module newMod=createModule();
			MODULES.add(newMod);
		}
	}
	/**
	 * Create a new module
	 * @return	The new module.
	 */
	private Module createModule() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Module Name: ");
		String tmpName = input.nextLine();
		
		System.out.println("Module Weighting: ");
		int tmpWeight = input.nextInt();
		
		System.out.println("Amount Of Assessments: ");
		int tmpAssessments = input.nextInt();
		
		System.out.println("Optional: ");
		boolean tmpOption = input.nextBoolean();
		
		
		Module mod = new Module(tmpName, tmpWeight, tmpAssessments, tmpOption);
		
		return mod;
		
	}
	/**
	 * Prints a list of all modules that are a part of this course.
	 */
	public void printModules() {for(Module m: MODULES) {System.out.println(m.getName());}}
	/**
	 * Set the grade of this course based on the mark provided.
	 * @param mark The mark that is being graded.
	 * @return The assigned grade.
	 */
	public String grade(int mark) {
		String grade="Ungraded";
		if(mark >= 40 && mark < 49) {grade="Pass";}
		else if(mark >= 50 && mark < 69) {grade="Merit";}
		else if(mark >= 70 && mark <= 100) {grade="Distinction";}
		else {grade = "Fail";}
		return grade;
	}
	/**
	 * Assigns a final mark to this course.
	 * @param student The given student the mark is being assigned to.
	 */
	public void mark(Student student) {
		int mark=0;
		for(Module m : MODULES) {
			mark += m.getMark(student)*(m.getWeighting()/10);
		}
		SCORES.put(student, mark);
		GRADES.put(student, grade(mark));
	}
	/**
	 * Retrieve the final mark given to a given student on this course.
	 * @param Student The given student.
	 * @return The final mark.
	 */
	public int getFinalMark(Student student) {
		return SCORES.get(student);}
	/**
	 * Retrieve the final grade given to a student on this course.
	 * @param Student The given student.
	 * @return The final grade of the given student.
	 */
	public String getFinalGrade(Student student) {return GRADES.get(student);}
	
	/**
	 * Add student to the course's register.
	 * @param student The student to be added.
	 */
	public void addToRegister(Student student) {REGISTER.addStudent(student);}
	/**
	 * Remove student to the course's register.
	 * @param student The student to be removed.
	 */
	public void removeFromRegister(Student student) {REGISTER.removeStudent(student);}
	/**
	 * List all students on this course's register.
	 */
	public void listStudents() {
		REGISTER.listStudents();
	}
}
