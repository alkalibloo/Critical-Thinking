import java.util.ArrayList;
import java.util.Collections;

public class ModuleSixMain {

	public static void main(String[] args) {

		// Create ArrayList of Student objects
		ArrayList<Student> students = new ArrayList<Student>();

		// Pack ArrayList
		students.add(new Student(1, "George", "Ontario, Canada"));
		students.add(new Student(2, "Kelsie", "New York, New York"));
		students.add(new Student(3, "Oscar", "Fort Collins, Colorado"));
		students.add(new Student(4, "Mindy", "Pierre, South Dakota"));
		students.add(new Student(5, "Charles", "Palm Beach, Florida"));
		students.add(new Student(6, "Jera", "Dover, Deleware"));
		students.add(new Student(7, "Livian", "San Diego, California"));
		students.add(new Student(8, "Romeo", "Santa Fe, New Mexico"));
		students.add(new Student(9, "Belle", "Montepelier, Vermont"));
		students.add(new Student(10, "Natasha", "Las Vegas, Nevada"));

		// Welcome user
		System.out.println("Welcome to the student roll program.\n");

		// Display the ArrayList as it is in its original order
		System.out.println("The students are:");
		arrayPrinter(students);

		// Sort ArrayList with custom comparator
		Collections.sort(students, new SortByName());

		// Display the ArrayList in new order
		System.out.println("\nSorting by Name...\n");
		System.out.println("Now the order is:");
		arrayPrinter(students);

		// Sort ArrayList with custom comparator
		Collections.sort(students, new SortByRoll());

		// Display the ArrayList in new order
		System.out.println("\nSorting by Roll...\n");
		System.out.println("Now the order is:");
		arrayPrinter(students);

		// Sort ArrayList with Selection Sorting
		SelectSort.selectSort(students);

		// Display the ArrayList in new order
		System.out.println("\nSorting by selectSort() (which sorts by name)...\n");
		System.out.println("Now the order is:");
		arrayPrinter(students);
	}

	// Creating a function to nicely present the ArrayList
	private static void arrayPrinter(ArrayList<Student> list) {

		System.out.println("* * * * * * * * * * * * * * * * * * * * *");
		System.out.println(String.format("%s %-2s %s %-7s %s %-22s %s", "*", "#", "*", "Name", "*", "Address", "*"));
		System.out.println("* * * * * * * * * * * * * * * * * * * * *");

		// Loop over arrayList to print
		for (int i = 0; i < 10; i++) {

			System.out.println(String.format("%s %-2s %s %-7s %s %-22s %s", "*", list.get(i).rollNo, "*",
					list.get(i).name, "*", list.get(i).address, "*"));

		}

		System.out.println("* * * * * * * * * * * * * * * * * * * * *");

	}

}
