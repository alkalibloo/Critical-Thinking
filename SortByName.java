import java.util.Comparator;

// Custom Comparator
public class SortByName implements Comparator<Student> {

	public int compare(Student a, Student b) {

		return a.name.compareTo(b.name);

	}
}
