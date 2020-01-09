package OOPsConcepts.Aggregation._01;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private List<Student> students;

	public Department(String name) {
		super();
		this.name = name;
		this.students = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
