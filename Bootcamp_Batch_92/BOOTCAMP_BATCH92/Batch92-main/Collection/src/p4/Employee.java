package p4;

public class Employee implements Comparable {

	private int id;
	private int age;
	private String name;
	private double salary;

	public Employee(int id, int age, String name, double salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {

		// e1.compreTo(e2) in the sort(-----)

		Employee e1 = this;
		Employee e2 = (Employee) o;

		return e1.getAge() - e2.getAge();
	}

}
