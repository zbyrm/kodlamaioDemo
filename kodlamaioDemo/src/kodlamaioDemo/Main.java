package kodlamaioDemo;

public class Main {

	public static void main(String[] args) {
		Instructor ogretmen1 = new Instructor(1,"Ali","Demir","ali@gmail.com","1234",
				"java,python","hakkýnda" );
		
		Student ogrenci1 = new Student(2,"Salih","Yýlmaz","salih@gmail.com","9832");

		
		StudentManager studentManager = new StudentManager();
		studentManager.add(ogrenci1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(ogretmen1);
		
	}

}
