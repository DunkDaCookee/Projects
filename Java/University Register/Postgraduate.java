/**
 * A Postgraduate student object.
 *
 * @author (Billy James Martin)
 * @version (1)
 */
public class Postgraduate extends Student{

	private boolean UNDERGRADUATE = false;	//To be used later
	private boolean POSTGRADUATE = true;	//To be used later
	/**
	 * Constructor
	 * @param firstname	The student's first name.
	 * @param surname	The student's surname.
	 * @param course	The student's course.
	 */
	public Postgraduate(String firstname, String surname, Course course) {
		super(firstname, surname, course);									//Call super constructor
	}
}
