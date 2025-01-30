package java8;

public class EmployeeBean {

	private int id;
	private String name;
	private int age;
	private int salary;
	private String gender;
	private String department;
	
	public EmployeeBean(int id, String name, int age, int salary, String gender, String department) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
		this.department=department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", gender="
				+ gender + ", department=" + department + "]";
	}
	
	
}
