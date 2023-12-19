package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Comparator.NameComparator;

import Comparable.Student;

public class UseStudent {

	public static void main(String[] args) {
		ArrayList<Student> res=new ArrayList<>();
		Student s1=new Student("Raju", 27, "floor");
		Student s2=new Student("Vijay",29,"photo");
		Student s3=new Student("Vicky", 28, "driver");
		
		res.add(s1);
		res.add(s2);
		res.add(s3);
		AgeComparator age=new AgeComparator();
		Collections.sort(res,age);
	
	}

}
