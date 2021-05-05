package kodlamaioDemo;

public class InstructorManager extends UserManager {
	
	 
	public void add(Instructor user) { 
	
		System.out.println("Instructor added. " + user.getFirstName() + " " + user.getLastName() );
	}
}
