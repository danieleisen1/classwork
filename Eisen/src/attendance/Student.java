package attendance;

public class Student {

	private String firstName;
	private String lastName;
	private boolean present;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		present = false;
	}
	
	public boolean isPresent() {
		return present;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public boolean mathces(String first, String last) {
		return first.toLowerCase().equals(firstName.toLowerCase()) && last.toLowerCase().equals(lastName.toLowerCase());
	}
	
}
