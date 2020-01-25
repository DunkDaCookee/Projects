import java.util.HashMap;

/**
 * A module object to be added to a Course Object.
 *
 * @author (Billy James Martin)
 * @version (1)
 */
public class Module {
	private String NAME;
	private int WEIGHTING;
	private int ASSESSMENTS;
	private HashMap<Student, Integer> SCORES;
	private HashMap<Student, String> GRADES;
	private boolean OPTIONAL;
	private boolean PASSED;
	/**
	 * Constructor
	 * @param name	The name of the module.
	 * @param weighting	The weighting of the module.
	 * @param assessments	The amount of assessments.
	 * @param isOptional	Is the module optional.
	 */
	public Module(String name, int weighting, int assessments, boolean isOptional) {
		NAME = name;
		WEIGHTING = weighting;
		ASSESSMENTS = assessments;
		OPTIONAL = isOptional;
		SCORES = new HashMap<Student, Integer>();
		GRADES = new HashMap<Student, String>();
	}
	/**
	 * Retrieve the name of this module
	 * @return The name of the module.
	 */
	public String getName() {return NAME;}
	/**
	 * Retrieve the weighting of this module.
	 * @return The weighting of this module
	 */
	public int getWeighting() {return WEIGHTING;}
	/**
	 * Retrieve the amount of assessments this module has.
	 * @return The amount of assessments.
	 */
	public int getNoAssessments() {return ASSESSMENTS;}
	/**
	 * Set module to passed.
	 */
	public void pass() {PASSED=true;}
	/**
	 * Set the module to failed.
	 */
	public void fail() {PASSED=false;}
	/**
	 * Check if the module has been passed.
	 * @return Has the module been marked as passed.
	 */
	public boolean isPassed() {return PASSED;}
	/**
	 * Set the student's mark for the module.
	 * @param mark The mark for the module.
	 * @param student The given student.
	 */
	public void setMark(Student student, int mark) {SCORES.put(student, mark);}
	/**
	 * Retrieve the mark for the module the student has got.
	 * @param the given student.
	 * @return The mark of the module.
	 */
	public int getMark(Student student) {return SCORES.get(student);}
	/**
	 * Check if the module is optional.
	 * @return	Is the module optional.
	 */
	public boolean isOptional() {return OPTIONAL;}
	/**
	 * Sets the grade of the module passed on the mark the student has.
	 * @param The given student.
	 */
	public void setGrade(Student student) {
		String grade = "Ungraded";
		int mark = SCORES.get(student);
		if(mark >= 40 && mark < 49) {grade="Pass";}
		else if(mark >= 50 && mark < 69) {grade="Merit";}
		else if(mark >= 70 && mark <= 100) {grade="Distinction";}
		else if(mark<40){grade = "fail";}
		GRADES.put(student, grade);
	}
	
	/**
	 * Retrieves the grade of the module the student has.
	 * @param student The given student.
	 * @return The grade of the module the student has
	 */
	public String getGrade(Student student) {return GRADES.get(student);}
}
