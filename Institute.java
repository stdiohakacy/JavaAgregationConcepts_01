package OOPsConcepts.Aggregation._01;

import java.util.ArrayList;
import java.util.List;

public class Institute {
	private String name;
	private List<Department> departments;

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Institute(String name) {
		super();
		this.setName(name);
		this.departments = new ArrayList<Department>();
	}

	public int getTotalStudentsInstitute() {
		int count = 0;
		List<Student> students;
		for (Department department : this.departments) {
			students = department.getStudents();
			for (Student student : students) {
				count++;
			}
		}
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
