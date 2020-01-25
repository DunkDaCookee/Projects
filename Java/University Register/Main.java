
public class Main {

	public static void main(String[] args) {
		//To be completed, currently used for testing.
		System.out.println("A new register will be created: ");
		Register Comp_Reg = new Register();
		System.out.println("Register Created");
		
		System.out.println("A new course will be created: ");
		Course Computing = new Course("Computing", 3, Comp_Reg);
		System.out.println("Course Created");
		
		System.out.println("A new student will created: ");
		Undergraduate Undergrad = new Undergraduate("Steven", "Thomson", Computing);
		System.out.println("Student Created");
		Undergrad.studyDetails();
		
		System.out.println("");
		System.out.println("A new student will created: ");
		Undergraduate Undergrad2 = new Undergraduate("Sally", "Thomson", Computing);
		System.out.println("Student Created");
		Undergrad2.studyDetails();
		
		System.out.println("");
		
		Computing.listStudents();
	}

}
