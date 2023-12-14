package arraylist.ex;

import java.util.ArrayList;
import java.util.Iterator;

class M{
	public static void main(String []args) {
		Student s1 = new Student(101, "Brook" , 29);
		Student s2 = new Student(102, "Sunny" , 12);
		Student s3 = new Student(103, "Luffy" , 18);
		ArrayList<Student> st = new ArrayList<Student>(); // create object into ArrList
		st.add(s1);
		st.add(s2);
		st.add(s3);
		Iterator<Student> itr = st.iterator();
		while(itr.hasNext()) {
			Student sd = (Student)itr.next(); // to display data by data
			System.out.println(sd.rollno + ", " + sd.name + ", " + sd.age );
			
		}
	}
}
