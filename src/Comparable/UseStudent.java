package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student("Rajesh", 27, "Developer");
		Student s2=new Student("Ranganathan",26,"Associate");
		Student s3=new Student("Samuel",29,"Manager");
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.getName()+" "+st.getAge()+" "+st.getRole());
		}
	}

}
