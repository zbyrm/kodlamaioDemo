package kodlamaioDemo;

public class Instructor extends User {
	
	private String courseNames;
	private String about;
	
	public Instructor() {
		 
	}

	public Instructor(int id, String firstName, String lastName, String email, String password,
			String courseNames, String about) {
		super(id, firstName, lastName, email, password);
		this.courseNames = courseNames;
		this.about = about;
		 
	} 
	
	public String getCourseNames() {
		return courseNames;
	}
	public void setCourseNames(String courseNames) {
		this.courseNames = courseNames;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
