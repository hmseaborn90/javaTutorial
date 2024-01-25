package tutorial;

public class Student implements Comparable<Student> {
	
	private String name;
	
	public Student(String name) {
		this.setName(name);
	}
	
	public boolean equals(Student other) {
		if (this.name == other.name) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Student other) {
		return this.name.compareTo(other.name);
	}
	
	public String toString() {
		return "Student(" + this.name + ")";
	}
//
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}
