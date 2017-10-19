package arrays;

public class Person {

	public static final String[] FIRST_START = {"Chr","M","L","D","Gar","Br","Th"};
	public static final String[] FIRST_MIDDLE = {"isti","icha","era","eta","ala","ina","ara"};
	public static final String[] FIRST_END = {"","na","n","r","tian","s","rs","mp","les"};
	
	public static final String[] LAST_START = {"Tr","Br","L","Gr","Sh","B","Th"};
	public static final String[] LAST_MIDDLE = {"om","o","an","ola","et","e","is"};
	public static final String[] LAST_END = {"","son","ers","rian","ston","ck","sk"};
	
	
	private String firstName;
	private String lastName;
	private Borough home;
	private Hobby hobby;
	private Person[] friends;
	public Person(String first, String last, Borough home) {
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		friends = new Person[3];
		hobby = Hobby.randomHobby();
	}
	
	public void setInFirstPlace(Person f) {
		//go backward through an array
		for(int i = friends.length - 1; i > 0; i--) {
			//move the friend from in front, back
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
	public void mingle(Person[] peers) {
		for (Person p : peers) {
			//you cannot friend yourself
			if(p != this) {
				setInFirstPlace(p);
			}
		}
	}
	
	public void stateYourFriends() {
		String friendsList = "My friends are ";
		for(int i = 0; i < friends.length - 1; i++) {
			friendsList = friendsList + friends[i].firstName + " , ";
		}
		friendsList = friendsList + " , and" + friends[friends.length] + ".";
	}
	public String toString() {
		return "My name is "+firstName+" "+lastName+" and I live in "+home+".";
	}
	
	
}
