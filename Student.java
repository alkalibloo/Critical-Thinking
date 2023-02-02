
public class Student {

	// Student variables
	int rollNo;
	String name, address;

	// Constructor
	public Student(int roll, String n, String a) {
		this.rollNo = roll;
		this.name = n;
		this.address = a;
	}

	// Name getter
	public String getName() {
		return this.name;
	}

}
