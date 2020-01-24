
public class Student {
	
	private String FIRST_NAME;
	private String SURNAME;
	private Course COURSE;
	/**
	 * Constructor
	 * @param firstname The student's first name.
	 * @param surname	The student's surname.
	 * @param course	The course the student is on.
	 */
	public Student(String firstname, String surname, Course course) {
		setFirstName(firstname);
		setSurname(surname);
		COURSE=course;
		
		COURSE.addToRegister(this);
	}
	/**
	 * Get the first name of the student.
	 * @return	The first name of the student.
	 */
	public String getFirstName() {return FIRST_NAME;}
	/**
	 * Get the surname of the student.
	 * @return	The surname of the student.
	 */
	public String getSurname() {return SURNAME;}
	/**
	 * The course the student is on.
	 * @return	The course the student is on.
	 */
	public Course getCourse() {return COURSE;}
	/**
	 * Change the student's first name
	 * @param firstname The new first name.
	 */
	public void setFirstName(String firstname) {FIRST_NAME=firstname;}
	/**
	 * Change the student's surname
	 * @param surname The new surname.
	 */
	public void setSurname(String surname) {SURNAME=surname;}
	/**
	 * Prints the study details of this student.
	 */
	public void studyDetails() {
		System.out.println(FIRST_NAME + " " + SURNAME + " is currently studying " + COURSE.getTitle() + ".");
		COURSE.printModules();
	}
}
