/**
 * A module object to be added to a Course Object.
 *
 * @author (Billy James Martin)
 * @version (1)
 */
public class Module {
	private String NAME;
	private String GRADE;
	private int WEIGHTING;
	private int ASSESSMENTS;
	private int MARK;
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
	 * Set the mark for the module.
	 * @param mark The mark for the module.
	 */
	public void setMark(int mark) {MARK=mark;}
	/**
	 * Retrieve the mark for the module.
	 * @return The mark of the module.
	 */
	public int getMark() {return MARK;}
	/**
	 * Check if the module is optional.
	 * @return	Is the module optional.
	 */
	public boolean isOptional() {return OPTIONAL;}
	/**
	 * Sets the grade of the module passed on the mark.
	 */
	public void setGrade() {
		if(GRADE==null) {GRADE="Ungraded";}
		else if(MARK >= 40 && MARK < 49) {GRADE="Pass";}
		else if(MARK >= 50 && MARK < 69) {GRADE="Merit";}
		else if(MARK >= 70 && MARK <= 100) {GRADE="Distinction";}
		else {GRADE = "fail";}
	}
}
