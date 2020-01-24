import java.util.ArrayList;
import java.util.Scanner;
/**
 * A Course object containing several modules.
 *
 * @author (Billy James Martin)
 * @version (1)
 */
public class Course {
	
	private String TITLE;
	private int NOMODULES;
	private int FINALMARK=-1;
	private String FINALGRADE;
	private Register REGISTER;
	
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
	 * Prints a list of all modules.
	 */
	public void printModules() {for(Module m: MODULES) {System.out.println(m.getName());}}
	/**
	 * Set the grade of this module passed on the final mark.
	 */
	public void setGrade() {
		if(FINALMARK<0) {FINALGRADE="Ungraded";}
		else if(FINALMARK >= 40 && FINALMARK < 49) {FINALGRADE="Pass";}
		else if(FINALMARK >= 50 && FINALMARK < 69) {FINALGRADE="Merit";}
		else if(FINALMARK >= 70 && FINALMARK <= 100) {FINALGRADE="Distinction";}
		else {FINALGRADE = "fail";}
	}
	/**
	 * Assigns a final mark to this module.
	 */
	public void mark() {
		int CurrentMark=0;
		for(Module m : MODULES) {
			CurrentMark += m.getMark()*(m.getWeighting()/10);
		}
		FINALMARK=CurrentMark;
		setGrade();
	}
	/**
	 * Retrieve the final mark given to a student on this course.
	 * @return The final mark.
	 */
	public int getFinalMark() {return FINALMARK;}
	/**
	  * Retrieve the final grade given to a student on this course.
	 * @return The final grade.
	 */
	public String getFinalGrade() {return FINALGRADE;}
	
	/**
	 * Add student to the course's register.
	 * @param student The student to be added.
	 */
	public void addToRegister(Student student) {
		REGISTER.addStudent(student);
	}
}
