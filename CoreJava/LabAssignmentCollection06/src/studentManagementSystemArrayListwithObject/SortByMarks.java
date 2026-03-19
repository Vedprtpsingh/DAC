package studentManagementSystemArrayListwithObject;

import java.util.Comparator;

public class SortByMarks implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.marks>s2.marks) {
			return 1;
		}else {
			return -1;
		}
	}
}
