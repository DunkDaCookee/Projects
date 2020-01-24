
public class Undergraduate extends Student{
	
	private boolean UNDERGRADUATE = true;	//To be used later
	private boolean POSTGRADUATE = false;	//To be used later
	/**
	 * Constructor
	 * @param firstname	The student's first name.
	 * @param surname	The student's surname.
	 * @param course	The student's course.
	 */
	public Undergraduate(String firstname, String surname, Course course) {
		super(firstname, surname, course);									//Call super constructor
	}
}
