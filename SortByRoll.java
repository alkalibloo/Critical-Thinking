import java.util.Comparator;

//Custom Comparator
public class SortByRoll implements Comparator<Student> {

	public int compare(Student a, Student b) {

		return a.rollNo - b.rollNo;

	}
}
