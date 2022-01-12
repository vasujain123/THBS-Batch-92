package e1;

public class EmployeeDetails {

	public static void main(String[] args) {

		employee[] emp = new employee[4];

		emp[0] = new employee(100, "satya", 24, 20000);
		emp[1] = new employee(115, "tushar", 26, 50000);
		emp[2] = new employee(109, "arjeet", 20, 35000);
		emp[3] = new employee(119, "happy", 27, 55000);

		System.out.println("employee details before sorting");
		for (employee e1 : emp) {
			System.out.println(e1.id + "---" + e1.name + "---" + e1.age + "---" + e1.salary);
		}

		employee temp;
		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].age > emp[j].age) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}

		System.out.println("employee details after sorting w.r.t. age of employee");
		for (employee e1 : emp) {
			System.out.println(e1.id + "---" + e1.name + "---" + e1.age + "---" + e1.salary);
		}
	}
}