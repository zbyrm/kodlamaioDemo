package kodlamaioDemo;

public class StudentManager extends UserManager{
	
	public void add(Student user) { 		
		System.out.println("Student added. " + user.getFirstName() + " " + user.getLastName() );
	}
}
