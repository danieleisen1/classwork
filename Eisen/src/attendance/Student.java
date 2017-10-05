package attendance;

public class Student implements Attendee {

	private String first;
	private String last;
	private boolean present;
	
	public Student(String first, String last) {
		this.first = first;
		this.last = last;
		present = false;
	}
	
	public boolean isPresent() {
		return present;
	}
	
	public void setPresent(boolean present) {
		this.present = present;
	}
	
	public String getfirst() {
		return first;
	}
	
	public String getlast() {
		return last;
	}
	
	public boolean mathces(String first, String last) {
		return first.toLowerCase().equals(first.toLowerCase()) && last.toLowerCase().equals(last.toLowerCase());
	}
	
	public boolean matches(String last) {
		return first.toLowerCase().equals(first.toLowerCase()) && last.toLowerCase().equals(last.toLowerCase());
	}
	
	public String getReportString(){
		String report = last;
		report = restrictStringToLength(report,20);
		report+=first;
		report = restrictStringToLength(report,40);
		if(present) {
			report+="PRESENT\n";
		}else {
			report+="ABSENT\n";
		}
		return report;
	}
	
	public String restrictStringToLength(String s, int length) {
		if(s.length() > length) {
			s = s.substring(0, length - 3)+".";
		}
		while(s.length() < length) {
			s +=" ";
		}
		return s;
	}
}
