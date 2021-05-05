package kodlamaioDemo;

public class UserManager {
	
	public void add(User user) {
		System.out.println("user added. " + user.getFirstName() + " " + user.getLastName() );
	}
	
	public void delete(User user) {
		System.out.println("user deleted " + user.getFirstName() + " " + user.getLastName() );
	}

	 
}
