import java.util.ArrayList;

public class SelectSort {

	public static void selectSort(ArrayList<Student> list) {

		int n = list.size();

		// Outer loop loops through ArrayList of students one at a time
		for (int i = 0; i < n - 1; i++) {

			// Separate sorted from unsorted with this variable
			int minElement = i;

			// Inner loop compares student from outer loop to remaining unsorted values
			for (int j = i + 1; j < n; j++) {

				// Find smallest value from unsorted students and assign its index to minElement
				if (list.get(j).getName().compareTo(list.get(minElement).getName()) < 0) {
					minElement = j;
				}
			}

			// Put new smallest student in temp
			Student temp = list.get(minElement);

			// Swap new lowest student to end of sorted students list
			list.set(minElement, list.get(i));
			list.set(i, temp);

		}
	}

}
