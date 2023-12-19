package Comparable;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private String role;
	public Student(String name,int age,String role) {
		this.name=name;
		this.age=age;
		this.role=role;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int  compareTo(Student st) {
		if(age==st.age) {
			return 0;
		}
		else if(age>st.age) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
